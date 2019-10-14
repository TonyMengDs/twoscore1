package com.example.twoscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /*android:configChanges="orientation|keyboardHidden|screenSize"*/
    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        Button btn4 = findViewById(R.id.btn4);
        btn3.setOnClickListener(this);

        TextView text1 = findViewById(R.id.textView1);
        TextView text2 = findViewById(R.id.textView2);

        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(this);

        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(this);

        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(this);

        TextView text3 = findViewById(R.id.textView3);
        TextView text4 = findViewById(R.id.textView4);

    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        String scorea = ((TextView)findViewById(R.id.textView2)).getText().toString();
        String scoreb = ((TextView)findViewById(R.id.textView4)).getText().toString();
        
        Log.i(TAG, "onSaveInstanceState: ");
        outState.putString("teama_score",scorea);
        outState.putString("teamb_score",scoreb);

    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        String scorea = savedInstanceState.getString("teama_score");
        String scoreb = savedInstanceState.getString("teamb_score");

        Log.i(TAG,"onRestoreInstanceState: ");
        ((TextView)findViewById(R.id.textView2)).setText(scorea);
        ((TextView)findViewById(R.id.textView4)).setText(scoreb);
    }
    
    

    @Override
    public void onClick(View view) {
        TextView textView2 = findViewById(R.id.textView2);
        String str1 = textView2.getText()+"";
        TextView textView4 = findViewById(R.id.textView4);
        String str2 = textView4.getText()+"";
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        switch (view.getId())
        {
            case R.id.btn1:
                num1 = num1 +3;
                textView2.setText(num1+"");
                break;
            case R.id.btn2:
                num1 = num1 +2;
                textView2.setText(num1+"");
                break;
            case R.id.btn3:
                num1 = num1 +1;
                textView2.setText(num1+"");
                break;
            case R.id.btn4:
                num1 = 0;
                textView2.setText(num1+"");
                break;
            case R.id.btn5:
                num2 = num2 +3;
                textView4.setText(num2+"");
                break;
            case R.id.btn6:
                num2 = num2 +2;
                textView4.setText(num2+"");
                break;
            case R.id.btn7:
                num2 = num2 +1;
                textView4.setText(num2+"");
                break;
            case R.id.btn8:
                num2 = 0;
                textView4.setText(num2+"");
                break;
            default:
                break;
        }
    }
}
