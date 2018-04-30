package com.example.c1722696.wmctraining;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    public static final ArrayList<String> selected = new ArrayList<>();
    public static final ArrayList<Integer> cost = new ArrayList<>();
    public static final ArrayList<String> quantity = new ArrayList<>();


    protected static int count = 0;
    public int price = 0;



//add line breaks to the quantity section

    //if layout isn't nice then can make a selection array for each checkbox which adds to a quantity array for each edit text
    //which would both be added to an final array
//e.g. array for checkbox one then checkbox1.add("string"); then in onclick, quantity.add(editText.gettext etc) then
    //Main cb.add(quantity)
    //then Selected.add(cb)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();



        final CheckBox checkBox1 =  findViewById(R.id.checkBox);
        final CheckBox checkBox5 =  findViewById(R.id.checkBox5);
        final CheckBox checkBox6 =  findViewById(R.id.checkBox6);
        final CheckBox checkBox7 =  findViewById(R.id.checkBox7);
        final CheckBox checkBox8 =  findViewById(R.id.checkBox8);
        final CheckBox checkBox9 =  findViewById(R.id.checkBox9);
        final CheckBox checkBox10 = findViewById(R.id.checkBox10);

        final TextView textView =  findViewById(R.id.amount);

        final EditText editText1 =  findViewById(R.id.editText);
        final EditText editText2 =  findViewById(R.id.editText2);
        final EditText editText3 =  findViewById(R.id.editText3);
        final EditText editText4 =  findViewById(R.id.editText4);
        final EditText editText5 =  findViewById(R.id.editText5);
        final EditText editText7 =  findViewById(R.id.editText7);
        final EditText editText8 =  findViewById(R.id.editText8);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox1.isChecked()){
                    Log.i("Checked0", "Checkbox 0 checked");
                    selected.add("Children and Young Peoples Workforce 2" + "\n");
                    count++;
                    price += 10;
                    textView.setText(String.valueOf(price));
                } else {
                    Log.i("Checked0", "Checkbox 0 unchecked");
                    selected.remove("Children and Young Peoples Workforce 2" + "\n");
                    count--;
                    price -= 10;
                    textView.setText(String.valueOf(price));
                    editText1.setText("");
                }
            }
        });

        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox5.isChecked()){
                    Log.i("Checked5", "Checkbox 5 checked");
                    selected.add("Early Years Educator Level 3 " + "\n");
                    count++;
                    price += 20;
                    textView.setText(String.valueOf(price));
                } else {
                    Log.i("Checked5", "Checkbox 5 unchecked");
                    selected.remove("Early Years Educator Level 3 " + "\n");
                    count--;
                    price -= 20;
                    textView.setText(String.valueOf(price));
                    editText2.setText("");
                }
            }
        });

        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox6.isChecked()){
                    Log.i("Checked6", "Checkbox 6 checked");
                    selected.add("Management Level 3" + "\n");
                    count++;
                    price += 30;
                    textView.setText(String.valueOf(price));
                } else {
                    Log.i("Checked6", "Checkbox 6 unchecked");
                    selected.remove("Management Level 3 " + "\n");
                    count--;
                    price -= 30;
                    textView.setText(String.valueOf(price));
                    editText3.setText("");
                }
            }
        });

        checkBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox7.isChecked()){
                    Log.i("Checked7", "Checkbox 7 checked");
                    selected.add("Management Level 4" + "\n");
                    count++;
                    price += 40;
                    textView.setText(String.valueOf(price));
                } else {
                    Log.i("Checked7", "Checkbox 7 unchecked");
                    selected.remove("Management Level 4" + "\n");
                    count--;
                    price -= 40;
                    textView.setText(String.valueOf(price));
                    editText4.setText("");
                }
            }
        });

        checkBox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox8.isChecked()){
                    Log.i("Checked8", "Checkbox 8 checked");
                    selected.add("Management Level 5" + "\n");
                    count++;
                    price += 50;
                    textView.setText(String.valueOf(price));
                } else {
                    Log.i("Checked8", "Checkbox 8 unchecked");
                    selected.remove("Management Level 5" + "\n");
                    count--;
                    price -= 50;
                    textView.setText(String.valueOf(price));
                    editText5.setText("");
                }
            }
        });

        checkBox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox9.isChecked()){
                    Log.i("Checked9", "Checkbox 9 checked");
                    selected.add("Room Leader/Supervisor Level 3 " + "\n");
                    count++;
                    price += 60;
                    textView.setText(String.valueOf(price));
                } else {
                    Log.i("Checked9", "Checkbox 9 unchecked");
                    selected.remove("Room Leader/Supervisor Level 3 " + "\n");
                    count--;
                    price -= 60;
                    textView.setText(String.valueOf(price));
                    editText7.setText("");
                }
            }
        });

        checkBox10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox10.isChecked()){
                    Log.i("Checked10", "Checkbox 10 checked");
                    selected.add("Deputy/General Manager Level 5 " + "\n");
                    count++;
                    price += 70;
                    textView.setText(String.valueOf(price));
                } else {
                    Log.i("Checked10", "Checkbox 10 unchecked");
                    selected.remove("Deputy/General Manager Level 5 " + "\n");
                    count--;
                    price -= 70;
                    textView.setText(String.valueOf(price));
                    editText8.setText("");
                }
            }
        });



    }


            //IF CHECKBOX/ARRAY IS NOT NULL THEN TOAST YOU HAVE 2 FREE SHORT COURSES

            public void init() {
                Button but1 = findViewById(R.id.but1);

                but1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        final EditText editText1 =  findViewById(R.id.editText);
                        final EditText editText2 =  findViewById(R.id.editText2);
                        final EditText editText3 =  findViewById(R.id.editText3);
                        final EditText editText4 =  findViewById(R.id.editText4);
                        final EditText editText5 =  findViewById(R.id.editText5);
                        final EditText editText7 =  findViewById(R.id.editText7);
                        final EditText editText8 =  findViewById(R.id.editText8);


                        Toast.makeText(MainActivity.this, "You can choose " + count + " courses for free",
                                Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this, ShortCoursesActivity.class);
                        startActivity(intent);
                        cost.add(price);



                        quantity.add("CB 1: " + editText1.getText().toString() + "\n" + "CB 2: "  + editText2.getText().toString() + "\n" + "CB 3: " +
                                editText3.getText().toString() + "\n" + "CB 4: " + editText4.getText().toString() + "\n" + "CB 5: " + editText5.getText().toString() + "\n" +
                                "CB 6: " + editText7.getText().toString() + "\n" + "CB 7: " + editText8.getText().toString());

                        //use case to track quantity?

                       /* if (count == 1 || count == 2) {
                            Toast.makeText(MainActivity.this, "You can choose 2 courses for free",
                                    Toast.LENGTH_LONG).show();
                            startActivity(intent);
                            cost.add(price);
                        } else if (count == 3 || count == 4){
                            Toast.makeText(MainActivity.this, "You can choose 4 courses for free",
                                    Toast.LENGTH_LONG).show();
                            startActivity(intent);
                            cost.add(price);
                        } else if (count == 5 || count == 6) {
                            Toast.makeText(MainActivity.this, "You can choose 8 courses for free",
                                    Toast.LENGTH_LONG).show();
                            startActivity(intent);
                            cost.add(price);
                        } else if (count == 7) {
                            Toast.makeText(MainActivity.this, "You can choose 8 courses for free",
                                    Toast.LENGTH_LONG).show();
                            startActivity(intent);
                            cost.add(price);
                        }else if (count == 0){
                            Toast.makeText(MainActivity.this, "You can choose 0 courses for free",
                                    Toast.LENGTH_LONG).show();
                            startActivity(intent);
                            cost.add(price);
                        } else {
                            startActivity(intent);
                            cost.add(price);
                        } */
                    }
                });
            }
        }
