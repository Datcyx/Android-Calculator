package com.datzine.myapplication;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList <Integer> numbers = new LinkedList<Integer>();
    LinkedList <Float> totals = new LinkedList<Float>();
    LinkedList <String> operator = new LinkedList<String>();

    TextView resulttext;
    TextView resulttext2;
    Double az;
    Boolean ADD = false;
    Boolean SC = false;
    Boolean MUL = false;
    Boolean DEV = false;
    Boolean NEG = false;
    int fn = 0;
    float sn = 0.0F;
    String gd = "";
    int total = 0;
    float adin = 0.0F;
    float eadin = 0.0F;
    int trigger = 0;
    int more = 1;
    int stat = 0;
    int a;
    String extra ="";
    boolean firstnum = false;
    boolean secondnum = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        resulttext = (TextView) findViewById(R.id.rset);
        resulttext2 = (TextView) findViewById(R.id.rset2);
        numbers.add(0);
        numbers.add(0);

        int currentOrientation = getResources().getConfiguration().orientation;
        if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }

    public void num1(View view) {
        /*
        MUL
        if (!firstnum) {
            gd = gd.concat("1");
            resulttext.setText(resulttext.getText().toString() + "" + 1);
            numbers.set(0, Float.parseFloat(gd));
            a = total+ numbers.get(0);
            resulttext2.setText(gd + "");

        }else{
            gd = gd.concat("1");
            resulttext.setText(resulttext.getText().toString() + "" + 1);
            numbers.set(1, Float.parseFloat(gd));
            a = total * numbers.get(1);
            resulttext2.setText(a + "");

        }


         */
        if (!firstnum) {
            gd = gd.concat("1");
            resulttext.setText(resulttext.getText().toString() + "" + 1);
            numbers.set(0, Integer.parseInt(gd));
            a = total+ numbers.get(0);
            resulttext2.setText(gd + "");

        }else{
            gd = gd.concat("1");
            resulttext.setText(resulttext.getText().toString() + "" + 1);
            numbers.set(1, Integer.parseInt(gd));
            if(ADD){
                a = (int) total + numbers.get(1);
                resulttext2.setText(a + "");
            }else if(SC){
                a = (int) total - numbers.get(1);
                resulttext2.setText(a + "");
            }else if(MUL){
                a = (int) total * numbers.get(1);
                resulttext2.setText(a + "");
            }else if(DEV){
                if(numbers.get(1) == 0){
                    resulttext2.setText("Cannot Devide with Zero");

                }else{
                    a = (int) total / numbers.get(1);
                    resulttext2.setText(a + "");
                }
            }

        }
    }


    public void opadd(View view) {
        firstnum = true;

            resulttext.setText(resulttext.getText().toString() + "+");

        total=a;
        int g = total;

        gd="0";
        ADD = true;
        SC = false;
        MUL = false;
       DEV = false;
        NEG = false;
    }
    public void num2(View view) {
        if (!firstnum) {
            gd = gd.concat("2");
            resulttext.setText(resulttext.getText().toString() + "" + 2);
            numbers.set(0, Integer.parseInt(gd));
            a = total+ numbers.get(0);
            resulttext2.setText(gd + "");

        }else{
            gd = gd.concat("2");
            resulttext.setText(resulttext.getText().toString() + "" + 2);
            numbers.set(1, Integer.parseInt(gd));
            if(ADD){
                a = (int) total + numbers.get(1);
                resulttext2.setText(a + "");
            }else if(SC){
                a = (int) total - numbers.get(1);
                resulttext2.setText(a + "");
            }else if(MUL){
                a = (int) total * numbers.get(1);
                resulttext2.setText(a + "");
            }else if(DEV){
                if(numbers.get(1) == 0){
                    resulttext2.setText("Cannot Devide with Zero");

                }else{
                    a = (int) total / numbers.get(1);
                    resulttext2.setText(a + "");
                }
            }

        }
    }

    public void num3(View view) {
        if (!firstnum) {
            gd = gd.concat("3");
            resulttext.setText(resulttext.getText().toString() + "" + 3);
            numbers.set(0, Integer.parseInt(gd));
            a = total+ numbers.get(0);
            resulttext2.setText(gd + "");

        }else{
            gd = gd.concat("3");
            resulttext.setText(resulttext.getText().toString() + "" + 3);
            numbers.set(1, Integer.parseInt(gd));
            if(ADD){
                a = (int) total + numbers.get(1);
                resulttext2.setText(a + "");
            }else if(SC){
                a = (int) total - numbers.get(1);
                resulttext2.setText(a + "");
            }else if(MUL){
                a = (int) total * numbers.get(1);
                resulttext2.setText(a + "");
            }else if(DEV){
                if(numbers.get(1) == 0){
                    resulttext2.setText("Cannot Devide with Zero");

                }else{
                    a = (int) total / numbers.get(1);
                    resulttext2.setText(a + "");
                }
            }

        }
    }

    public void num4(View view) {
        if (!firstnum) {
            gd = gd.concat("4");
            resulttext.setText(resulttext.getText().toString() + "" + 4);
            numbers.set(0, Integer.parseInt(gd));
            a = total+ numbers.get(0);
            resulttext2.setText(gd + "");

        }else{
            gd = gd.concat("4");
            resulttext.setText(resulttext.getText().toString() + "" + 4);
            numbers.set(1, Integer.parseInt(gd));
            if(ADD){
                a = (int) total + numbers.get(1);
                resulttext2.setText(a + "");
            }else if(SC){
                a = (int) total - numbers.get(1);
                resulttext2.setText(a + "");
            }else if(MUL){
                a = (int) total * numbers.get(1);
                resulttext2.setText(a + "");
            }else if(DEV){
                if(numbers.get(1) == 0){
                    resulttext2.setText("Cannot Devide with Zero");

                }else{
                    a = (int) total / numbers.get(1);
                    resulttext2.setText(a + "");
                }
            }

        }
    }

    public void num5(View view) {
        if (!firstnum) {
            gd = gd.concat("5");
            resulttext.setText(resulttext.getText().toString() + "" + 5);
            numbers.set(0, Integer.parseInt(gd));
            a = total+ numbers.get(0);
            resulttext2.setText(gd + "");

        }else{
            gd = gd.concat("5");
            resulttext.setText(resulttext.getText().toString() + "" + 5);
            numbers.set(1, Integer.parseInt(gd));
            if(ADD){
                a = (int) total + numbers.get(1);
                resulttext2.setText(a + "");
            }else if(SC){
                a = (int) total - numbers.get(1);
                resulttext2.setText(a + "");
            }else if(MUL){
                a = (int) total * numbers.get(1);
                resulttext2.setText(a + "");
            }else if(DEV){
                if(numbers.get(1) == 0){
                    resulttext2.setText("Cannot Devide with Zero");

                }else{
                    a = (int) total / numbers.get(1);
                    resulttext2.setText(a + "");
                }
            }

        }
    }

    public void num6(View view) {
        if (!firstnum) {
            gd = gd.concat("6");
            resulttext.setText(resulttext.getText().toString() + "" + 6);
            numbers.set(0, Integer.parseInt(gd));
            a = total+ numbers.get(0);
            resulttext2.setText(gd + "");

        }else{
            gd = gd.concat("6");
            resulttext.setText(resulttext.getText().toString() + "" +6);
            numbers.set(1, Integer.parseInt(gd));
            if(ADD){
                a = (int) total + numbers.get(1);
                resulttext2.setText(a + "");
            }else if(SC){
                a = (int) total - numbers.get(1);
                resulttext2.setText(a + "");
            }else if(MUL){
                a = (int) total * numbers.get(1);
                resulttext2.setText(a + "");
            }else if(DEV){
                if(numbers.get(1) == 0){
                    resulttext2.setText("Cannot Devide with Zero");

                }else{
                    a = (int) total / numbers.get(1);
                    resulttext2.setText(a + "");
                }
            }

        }
    }

    public void num7(View view) {
        if (!firstnum) {
            gd = gd.concat("7");
            resulttext.setText(resulttext.getText().toString() + "" + 7);
            numbers.set(0, Integer.parseInt(gd));
            a = total+ numbers.get(0);
            resulttext2.setText(gd + "");

        }else{
            gd = gd.concat("7");
            resulttext.setText(resulttext.getText().toString() + "" + 7);
            numbers.set(1, Integer.parseInt(gd));
            if(ADD){
                a = (int) total + numbers.get(1);
                resulttext2.setText(a + "");
            }else if(SC){
                a = (int) total - numbers.get(1);
                resulttext2.setText(a + "");
            }else if(MUL){
                a = (int) total * numbers.get(1);
                resulttext2.setText(a + "");
            }else if(DEV){
                if(numbers.get(1) == 0){
                    resulttext2.setText("Cannot Devide with Zero");

                }else{
                    a = (int) total / numbers.get(1);
                    resulttext2.setText(a + "");
                }
            }

        }
    }

    public void num8(View view) {
        if (!firstnum) {
            gd = gd.concat("8");
            resulttext.setText(resulttext.getText().toString() + "" + 8);
            numbers.set(0, Integer.parseInt(gd));
            a = total+ numbers.get(0);
            resulttext2.setText(gd + "");

        }else{
            gd = gd.concat("8");
            resulttext.setText(resulttext.getText().toString() + "" + 8);
            numbers.set(1, Integer.parseInt(gd));
            if(ADD){
                a = (int) total + numbers.get(1);
                resulttext2.setText(a + "");
            }else if(SC){
                a = (int) total - numbers.get(1);
                resulttext2.setText(a + "");
            }else if(MUL){
                a = (int) total * numbers.get(1);
                resulttext2.setText(a + "");
            }else if(DEV){
                if(numbers.get(1) == 0){
                    resulttext2.setText("Cannot Devide with Zero");

                }else{
                    a = (int) total / numbers.get(1);
                    resulttext2.setText(a + "");
                }
            }

        }
    }

    public void num9(View view) {
        if (!firstnum) {
            gd = gd.concat("9");
            resulttext.setText(resulttext.getText().toString() + "" + 9);
            numbers.set(0, Integer.parseInt(gd));
            a = total+ numbers.get(0);
            resulttext2.setText(gd + "");

        }else{
            gd = gd.concat("9");
            resulttext.setText(resulttext.getText().toString() + "" + 9);
            numbers.set(1, Integer.parseInt(gd));
            if(ADD){
                a = (int) total + numbers.get(1);
                resulttext2.setText(a + "");
            }else if(SC){
                a = (int) total - numbers.get(1);
                resulttext2.setText(a + "");
            }else if(MUL){
                a = (int) total * numbers.get(1);
                resulttext2.setText(a + "");
            }else if(DEV){
                if(numbers.get(1) == 0){
                    resulttext2.setText("Cannot Devide with Zero");

                }else{
                    a = (int) total / numbers.get(1);
                    resulttext2.setText(a + "");
                }
            }

        }
    }

    public void num0(View view) {
        if (!firstnum) {
            gd = gd.concat("0");
            resulttext.setText(resulttext.getText().toString() + "" + 0);
            numbers.set(0, Integer.parseInt(gd));
            a = total+ numbers.get(0);
            resulttext2.setText(gd + "");

        }else{
            gd = gd.concat("0");
            resulttext.setText(resulttext.getText().toString() + "" + 0);
            numbers.set(1, Integer.parseInt(gd));
            if(ADD){
                a = (int) total + numbers.get(1);
                resulttext2.setText(a + "");
            }else if(SC){
                a = (int) total - numbers.get(1);
                resulttext2.setText(a + "");
            }else if(MUL){
                a = (int) total * numbers.get(1);
                resulttext2.setText(a + "");
            }else if(DEV){
                if(numbers.get(1) == 0){
                    resulttext2.setText("Cannot Devide with Zero");

                }else{
                    a = (int) total / numbers.get(1);
                    resulttext2.setText(a + "");
                }
            }



        }
    }







    public void optimes(View view) {
        firstnum = true;

        resulttext.setText(resulttext.getText().toString() + "X");

        total=a;
        int g = total;

        gd="0";
        ADD = false;
        SC = false;
        MUL = true;
        DEV = false;
        NEG = false;
    }

    public void opminus(View view) {
        firstnum = true;

        resulttext.setText(resulttext.getText().toString() + "-");

        total=a;
        int g = total;

        gd="0";
        ADD = false;
        SC = true;
        MUL = false;
        DEV = false;
        NEG = false;
    }

    public void opdevide(View view) {
        firstnum = true;

        resulttext.setText(resulttext.getText().toString() + "/");

        total=a;
        int g = total;

        gd="0";
        ADD = false;
        SC = false;
        MUL = false;
        DEV = true;
        NEG = false;
    }

    public void opnegative(View view) {
        if (!firstnum) {
            gd = gd.concat("-");
            resulttext.setText(resulttext.getText().toString() + "-");
            resulttext2.setText(gd + "");

        }else{
            gd = gd.concat("-");
            resulttext.setText(resulttext.getText().toString() + "-");
            resulttext2.setText(a + "");

        }
    }

    public void opequal(View view) {
        try {

                resulttext.setText(a+"");
            resulttext2.setText("");









        }
        catch(Exception e)
        {
        }
    }

    private String removeLastChar(String s)
    {
//returns the string after removing the last character
        return s.substring(0, s.length() - 1);
    }
    public void opdel(View view) {
            total = 0;
            resulttext2.setText("");
            resulttext.setText("");
            gd="";

        a=0;
        ADD = false;
        SC = false;
        MUL = false;
        DEV = false;
        NEG = false;
        firstnum = false;
        }


    public void opabout(View view) {
        AlertDialog.Builder credits = new AlertDialog.Builder(this);
                credits.setMessage("Created by CodecMaker")
                        .setTitle("About Me")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .show();
    }
}
