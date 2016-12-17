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
                metin.setText(pz[0]+"\n"+pz[1]+"\n"+pz[2]+"\n"+pz[3]+"\n"+pz[4]+"\n"+pz[5]+"\n"+pz[6]+"\n"+pz[7]);

            }
        });

        sali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metin.setText(sa[0]+"\n"+sa[1]+"\n"+sa[2]+"\n"+sa[3]+"\n"+sa[4]+"\n"+sa[5]+"\n"+sa[6]+"\n"+sa[7]);
            }
        });

        carsamba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metin.setText(ca[0]+"\n"+ca[1]+"\n"+ca[2]+"\n"+ca[3]+"\n"+ca[4]+"\n"+ca[5]+"\n"+ca[6]+"\n"+ca[7]);
            }
        });

        persembe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metin.setText(pe[0]+"\n"+pe[1]+"\n"+pe[2]+"\n"+pe[3]+"\n"+pe[4]+"\n"+pe[5]+"\n"+pe[6]+"\n"+pe[7]);
            }
        });

        cuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metin.setText(cu[0]+"\n"+cu[1]+"\n"+cu[2]+"\n"+cu[3]+"\n"+cu[4]+"\n"+cu[5]+"\n"+cu[6]+"\n"+cu[7]);
            }
        });


    }
}
