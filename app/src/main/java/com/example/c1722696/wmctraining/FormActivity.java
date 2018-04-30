package com.example.c1722696.wmctraining;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;



public class FormActivity extends AppCompatActivity {

    //SharedPreferences sharedPreferences;
    ArrayList<String> form = new ArrayList<String>();

    TextInputEditText compName2, compAddress2, name2, role2, number2, emailValidate2;
    SharedPreferences sharedPreferences;
    public static final String MY_SHARED= "MySharedPreference";
    public static final String COMPNAME = "companyname";
    public static final String COMPADDRESS = "companyaddress";
    public static final String NAME = "username";
    public static final String ROLE = "userrole";
    public static final String NUMBER = "usernumber";
    public static final String EMAIL = "useremail";
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Place details in the form from the shared preferences


        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_form);



         compName2 =  findViewById(R.id.compName);
         compAddress2 =  findViewById(R.id.compAddress);
         name2 =  findViewById(R.id.yourName);
         role2 =  findViewById(R.id.yourRole);
         number2 =  findViewById(R.id.telephoneNum);
         emailValidate2 =  findViewById(R.id.emailAdd);

         sharedPreferences = getSharedPreferences(MY_SHARED, Context.MODE_PRIVATE);
         editor = sharedPreferences.edit();

         if (sharedPreferences.contains(COMPNAME)){
             String coName = sharedPreferences.getString(COMPNAME, "");
             compName2.setText(coName);
         }

        if (sharedPreferences.contains(COMPADDRESS)){
            String coAdd = sharedPreferences.getString(COMPADDRESS, "");
            compAddress2.setText(coAdd);
        }

        if (sharedPreferences.contains(NAME)){
            String uName = sharedPreferences.getString(NAME, "");
            name2.setText(uName);
        }

        if (sharedPreferences.contains(ROLE)){
            String uRole = sharedPreferences.getString(ROLE, "");
            role2.setText(uRole);
        }

        if (sharedPreferences.contains(NUMBER)){
            String uNum = sharedPreferences.getString(NUMBER, "");
            number2.setText(uNum);
        }

        if (sharedPreferences.contains(EMAIL)){
            String uEmail = sharedPreferences.getString(EMAIL, "");
            emailValidate2.setText(uEmail);
        }


    }

    public void process(View view) {



        if (view.getId() == R.id.sub) {

            TextInputEditText emailValidate =  findViewById(R.id.emailAdd);
            String email = emailValidate.getText().toString().trim();
            String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

            String cName = compName2.getText().toString();
            String cAdd = compAddress2.getText().toString();
            String pName = name2.getText().toString();
            String pRole = role2.getText().toString();
            String pNumber = number2.getText().toString();
            String pEmail = emailValidate2.getText().toString();
            editor.putString(COMPNAME, cName);
            editor.putString(COMPADDRESS, cAdd);
            editor.putString(NAME, pName);
            editor.putString(ROLE, pRole);
            editor.putString(NUMBER, pNumber);
            editor.putString(EMAIL, pEmail);
            editor.commit();



            if (email.matches(emailPattern)) {
                Toast.makeText(getApplicationContext(), "Valid email address", Toast.LENGTH_SHORT).show();
                //use case to track quantity?
                Intent intent2 = new Intent(FormActivity.this, LogoPageActivity.class);

                startActivity(intent2);

            } else {
                Toast.makeText(getApplicationContext(), "Invalid email address or number", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
