package com.example.dell.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addbutton = (Button) findViewById(R.id.addbutton);

        Button subbutton = (Button) findViewById(R.id.subbutton);

        Button mulbutton = (Button) findViewById(R.id.mulbutton);

        Button divbutton = (Button) findViewById(R.id.divbutton);

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstnumedittext = (EditText) findViewById(R.id.firstnumeditText);
                EditText secnumedittext = (EditText) findViewById(R.id.secnumeditText);
                TextView resulttextview = (TextView) findViewById(R.id.resulttextView);

                int first_num = Integer.parseInt(firstnumedittext.getText().toString());
                int sec_num = Integer.parseInt(secnumedittext.getText().toString());
                int result = first_num + sec_num;

                resulttextview.setText(result+"");

            }
        });

        subbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstnumedittext = (EditText) findViewById(R.id.firstnumeditText);
                EditText secnumedittext = (EditText) findViewById(R.id.secnumeditText);
                TextView resulttextview = (TextView) findViewById(R.id.resulttextView);

                int first_num = Integer.parseInt(firstnumedittext.getText().toString());
                int sec_num = Integer.parseInt(secnumedittext.getText().toString());
                int result = first_num - sec_num;

                resulttextview.setText(result+"");

            }
        });

        mulbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstnumedittext = (EditText) findViewById(R.id.firstnumeditText);
                EditText secnumedittext = (EditText) findViewById(R.id.secnumeditText);
                TextView resulttextview = (TextView) findViewById(R.id.resulttextView);

                int first_num = Integer.parseInt(firstnumedittext.getText().toString());
                int sec_num = Integer.parseInt(secnumedittext.getText().toString());
                int result = first_num * sec_num;

                resulttextview.setText(result+"");

            }
        });

        divbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstnumedittext = (EditText) findViewById(R.id.firstnumeditText);
                EditText secnumedittext = (EditText) findViewById(R.id.secnumeditText);
                TextView resulttextview = (TextView) findViewById(R.id.resulttextView);

                int first_num = Integer.parseInt(firstnumedittext.getText().toString());
                int sec_num = Integer.parseInt(secnumedittext.getText().toString());
                float result = (first_num) / sec_num;

                resulttextview.setText(result+"");

            }
        });
    }
}
