package com.example.c1722696.wmctraining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.c1722696.wmctraining.MainActivity.count;




public class ShortCoursesActivity extends AppCompatActivity {
    public static final ArrayList<String> selected2 = new ArrayList<>();
    public static final ArrayList<String> quantity2 = new ArrayList<>();

    protected static int shortCourses = 0;



    public Button but2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_courses);
        init();

       //2346-12



        final CheckBox checkBox2 =  findViewById(R.id.checkBox2);
        final CheckBox checkBox3 =  findViewById(R.id.checkBox3);
        final CheckBox checkBox4 =  findViewById(R.id.checkBox4);
        final CheckBox checkBox6 =  findViewById(R.id.checkBox6);
        final CheckBox checkBox7 =  findViewById(R.id.checkBox7);
        final CheckBox checkBox8 =  findViewById(R.id.checkBox8);
        final CheckBox checkBox9 =  findViewById(R.id.checkBox9);
        final CheckBox checkBox10 = findViewById(R.id.checkBox10);
        final CheckBox checkBox11 =  findViewById(R.id.checkBox11);
        final CheckBox checkBox12 =  findViewById(R.id.checkBox12);

        final EditText editText6 =  findViewById(R.id.editText6);
        final  EditText editText9 =  findViewById(R.id.editText9);
        final  EditText editText10 =  findViewById(R.id.editText10);
        final  EditText editText11 =  findViewById(R.id.editText11);
        final  EditText editText12 =  findViewById(R.id.editText12);
        final  EditText editText13 =  findViewById(R.id.editText13);
        final  EditText editText14 =  findViewById(R.id.editText14);
        final  EditText editText15 =  findViewById(R.id.editText15);
        final  EditText editText16 =  findViewById(R.id.editText16);
        final  EditText editText17 =  findViewById(R.id.editText17);

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox2.isChecked()){
                    Log.i("Checked0", "Checkbox 6 checked");
                    selected2.add("Safeguarding "  + "\n");
                    shortCourses++;
                } else {
                    Log.i("Checked0", "Checkbox 6 unchecked");
                    selected2.remove("Safeguarding "  + "\n");
                    shortCourses--;
                    editText6.setText("");
                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox3.isChecked()){
                    Log.i("Checked0", "Checkbox 9 checked");
                    selected2.add("Prevent " + "\n");
                    shortCourses++;
                } else {
                    Log.i("Checked0", "Checkbox 9 unchecked");
                    selected2.remove("Prevent " + "\n");
                    shortCourses--;
                    editText9.setText("");
                }
            }
        });

        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox4.isChecked()){
                    Log.i("Checked0", "Checkbox 10 checked");
                    selected2.add("Fire Safety " + "\n");
                    shortCourses++;
                } else {
                    Log.i("Checked0", "Checkbox 10 unchecked");
                    selected2.remove("Fire Safety " + "\n");
                    shortCourses--;
                    editText10.setText("");
                }
            }
        });

        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox6.isChecked()){
                    Log.i("Checked0", "Checkbox 11 checked");
                    selected2.add("First Aid " + "\n");
                    shortCourses++;
                } else {
                    Log.i("Checked0", "Checkbox 11 unchecked");
                    selected2.remove("First Aid " + "\n");
                    shortCourses--;
                    editText11.setText("");
                }
            }
        });

        checkBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox7.isChecked()){
                    Log.i("Checked0", "Checkbox 12 checked");
                    selected2.add("Positive Handling " + "\n");
                    shortCourses++;
                } else {
                    Log.i("Checked0", "Checkbox 12 unchecked");
                    selected2.remove("Positive Handling " + "\n");
                    shortCourses--;
                    editText12.setText("");
                }
            }
        });

        checkBox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox8.isChecked()){
                    Log.i("Checked0", "Checkbox 13 checked");
                    selected2.add("Food Hygeine " + "\n");
                    shortCourses++;
                } else {
                    Log.i("Checked0", "Checkbox 13 unchecked");
                    selected2.remove("Food Hygeine " + "\n");
                    shortCourses--;
                    editText13.setText("");
                }
            }
        });

        checkBox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox9.isChecked()){
                    Log.i("Checked0", "Checkbox 14 checked");
                    selected2.add("Data handling in care " + "\n");
                    shortCourses++;
                } else {
                    Log.i("Checked0", "Checkbox 14 unchecked");
                    selected2.remove("Data handling in care " + "\n");
                    shortCourses--;
                    editText14.setText("");
                }
            }
        });

        checkBox10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox10.isChecked()){
                    Log.i("Checked0", "Checkbox 15 checked");
                    selected2.add("Working safely " + "\n");
                    shortCourses++;
                } else {
                    Log.i("Checked0", "Checkbox 15 unchecked");
                    selected2.remove("Working safely " + "\n");
                    shortCourses--;
                    editText15.setText("");
                }
            }
        });

        checkBox11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox11.isChecked()){
                    Log.i("Checked0", "Checkbox 16 checked");
                    selected2.add("Equality, Diversity and Inclusion  " + "\n");
                    shortCourses++;
                } else {
                    Log.i("Checked0", "Checkbox 16 unchecked");
                    selected2.remove("Equality, Diversity and Inclusion  " + "\n");
                    shortCourses--;
                    editText16.setText("");
                }
            }
        });

        checkBox12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox12.isChecked()){
                    Log.i("Checked0", "Checkbox 17 checked");
                    selected2.add("Nutrition and Hydration " + "\n");
                    shortCourses++;
                } else {
                    Log.i("Checked0", "Checkbox 17 unchecked");
                    selected2.remove("Nutrition and Hydration " + "\n");
                    shortCourses--;
                    editText17.setText("");
                }
            }
        });

    }


    public void init() {
        Button but2 =  findViewById(R.id.ontoDis);

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(ShortCoursesActivity.this, DisclaimerActivity.class);
                if (shortCourses > count){
                    Toast.makeText(ShortCoursesActivity.this, "Yikes",
                            Toast.LENGTH_LONG).show();

                } else {

                    final EditText editText6 =  findViewById(R.id.editText6);
                    final  EditText editText9 =  findViewById(R.id.editText9);
                    final  EditText editText10 =  findViewById(R.id.editText10);
                    final  EditText editText11 =  findViewById(R.id.editText11);
                    final  EditText editText12 =  findViewById(R.id.editText12);
                    final  EditText editText13 =  findViewById(R.id.editText13);
                    final  EditText editText14 =  findViewById(R.id.editText14);
                    final  EditText editText15 =  findViewById(R.id.editText15);
                    final  EditText editText16 =  findViewById(R.id.editText16);
                    final  EditText editText17 =  findViewById(R.id.editText17);

                    quantity2.add("CB 8: " +editText6.getText().toString()  + "\n" + "CB 9: " + editText9.getText().toString()  + "\n"
                            + "CB 10: " + editText10.getText().toString()  + "\n" +  "CB 11: " + editText11.getText().toString()  + "\n" +
                            "CB 12: " + editText12.getText().toString()  + "\n" + "CB 13: " + editText13.getText().toString()  + "\n" +
                            "CB 14: " + editText14.getText().toString()  + "\n" + "CB 15: " + editText15.getText().toString()  + "\n" +
                            "CB 16: " + editText16.getText().toString()  + "\n" + "CB 17: " + editText17.getText().toString()  + "\n");

                    startActivity(intent);
                }


            }
        });
    }

}
