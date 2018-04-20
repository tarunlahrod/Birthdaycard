package com.example.dabba.birthdaycard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main_Activity extends AppCompatActivity {
    TextView text1,text2;
    EditText edit1,edit2;
    Button bt;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_);
        bt=(Button) findViewById(R.id.but);
        edit1=(EditText) findViewById(R.id.ed1);
        edit2=(EditText) findViewById(R.id.ed2);
        text1=(TextView) findViewById(R.id.t1);
        text2=(TextView) findViewById(R.id.t2);
        image=(ImageView) findViewById(R.id.img1);
    }

    public void change (View view) {
        String from = edit1.getText().toString();
        String to = edit2.getText().toString();
        edit1.setVisibility(View.INVISIBLE);
        edit2.setVisibility(View.INVISIBLE);
        bt.setVisibility(View.INVISIBLE);
        image.setVisibility(View.INVISIBLE);

        text2.setText(from);
        text1.setText(to);
    }
}
