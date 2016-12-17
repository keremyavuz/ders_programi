package com.example.kerem.dersprogrami;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView metin;
    Button pzrts;
    Button sali;
    Button carsamba;
    Button persembe;
    Button cuma;


    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String [] pz=getResources().getStringArray(R.array.pazartesi) ;
        final String [] sa=getResources().getStringArray(R.array.sali) ;
        final String [] ca=getResources().getStringArray(R.array.carsamba) ;
        final String [] pe=getResources().getStringArray(R.array.persembe) ;
        final String [] cu=getResources().getStringArray(R.array.cuma) ;


        metin= (TextView) findViewById(R.id.Text);
        pzrts= (Button) findViewById(R.id.button1);
        sali= (Button) findViewById(R.id.button2);
        carsamba= (Button) findViewById(R.id.button3);
        persembe= (Button) findViewById(R.id.button4);
        cuma= (Button) findViewById(R.id.button5);

        pzrts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metin.setText(pz[0]);
            }
        });

        sali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metin.setText(sa[0]);
            }
        });

        carsamba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metin.setText(ca[0]);
            }
        });

        persembe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metin.setText(pe[0]);
            }
        });

        cuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metin.setText(cu[5]);
            }
        });


    }
}
