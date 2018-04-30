package com.example.c1722696.wmctraining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;



public class DisclaimerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);

        final Button but2 =  findViewById(R.id.confirming);
        final CheckBox checkBox =  findViewById(R.id.agree);

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(DisclaimerActivity.this, ThankYouActivity.class);

                if (checkBox.isChecked()){
                    startActivity(intent2);
                } else {
                    Toast.makeText(getApplicationContext(), "Please tick checkbox", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}
