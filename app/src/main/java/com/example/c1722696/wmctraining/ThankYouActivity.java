package com.example.c1722696.wmctraining;



import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import static com.example.c1722696.wmctraining.FormActivity.COMPADDRESS;
import static com.example.c1722696.wmctraining.FormActivity.COMPNAME;
import static com.example.c1722696.wmctraining.FormActivity.EMAIL;
import static com.example.c1722696.wmctraining.FormActivity.NAME;
import static com.example.c1722696.wmctraining.FormActivity.NUMBER;
import static com.example.c1722696.wmctraining.FormActivity.ROLE;
import static com.example.c1722696.wmctraining.MainActivity.cost;
import static com.example.c1722696.wmctraining.MainActivity.quantity;
import static com.example.c1722696.wmctraining.MainActivity.selected;
import static com.example.c1722696.wmctraining.ShortCoursesActivity.quantity2;
import static com.example.c1722696.wmctraining.ShortCoursesActivity.selected2;


public class ThankYouActivity extends AppCompatActivity {

    Intent intent = null, chooser = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
        init();



    }

    public void purchase (View view){

        Toast.makeText(getApplicationContext(), "Thank you for your purchase, Please exit the app", Toast.LENGTH_SHORT).show();


    }



    public void init() {

        Button but2 =  findViewById(R.id.returnToMain);

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  Intent intent = new Intent(ThankYouActivity.this, MainActivity.class);


                startActivity(intent); */

                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPreference", Context.MODE_PRIVATE);

                String compNames = sharedPreferences.getString(COMPNAME, "");
                String compAddy = sharedPreferences.getString(COMPADDRESS, "");
                String Nam = sharedPreferences.getString(NAME, "");
                String Roll = sharedPreferences.getString(ROLE, "");
                String Num = sharedPreferences.getString(NUMBER, "");
                String Emal = sharedPreferences.getString(EMAIL, "");


                intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String[] to = {"marlowe_white@yahoo.co.uk"};
                intent.putExtra(Intent.EXTRA_EMAIL, to);
                intent.putExtra(Intent.EXTRA_SUBJECT, "WMC Course SELECTION = " + cost.toString());
                //selected array lists will be added through array list
                intent.putExtra(Intent.EXTRA_TEXT, "Company Name: " + compNames + "\n" + "Company Address: " + compAddy + "\n" + "Name: " + Nam + "\n" + "Role: " + Roll + "\n" +
                        "Telephone Number: " + "+" + Num + "\n" + "Email: " + Emal + "\n" + "Chosen Courses: " + "\n" + "\n" + selected + "\n" + quantity + "\n" + selected2 +"\n" + quantity2 + "\n" + "---------------");
                intent.setType("message/rfc822");
                chooser = Intent.createChooser(intent, "Send email");


                startActivity(chooser);
            }
        });

    }

}

