package com.blogspot.darwinsapp.tictactoeclassic;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    int n=0;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn;
    String s1="a",s2="b",s3="c",s4="e",s5="f",s6="g",s7="h",s8="i",s9="j";
    private TextView text;
    int n1=1,n2=1,n3=1,n4=1,n5=1,n6=1,n7=1,n8=1,n9=1;
    private BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=(TextView)findViewById(R.id.Text);

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) {
            // Device doesn't support Bluetooth
            text.setText("Bluetooth not supported");
        }else {
            Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();

            if (pairedDevices.size() > 0) {
// There are paired devices. Get the name and address of each paired device.
                text.setText(String.valueOf(pairedDevices.size()));

                for (BluetoothDevice device : pairedDevices) {
                    String deviceName = device.getName();
                    String deviceHardwareAddress = device.getAddress(); // MAC address
                }
            } else {
//There are no paired devices.
                text.setText("no paired devices");
            }
        }

        btn=(Button)findViewById(R.id.Btn);
        btn1=(Button)findViewById(R.id.Btn1);
        btn2=(Button)findViewById(R.id.Btn2);
        btn3=(Button)findViewById(R.id.Btn3);
        btn4=(Button)findViewById(R.id.Btn4);
        btn5=(Button)findViewById(R.id.Btn5);
        btn6=(Button)findViewById(R.id.Btn6);
        btn7=(Button)findViewById(R.id.Btn7);
        btn8=(Button)findViewById(R.id.Btn8);
        btn9=(Button)findViewById(R.id.Btn9);

        btn.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.setVisibility(View.INVISIBLE);
                s1="";s2="";s3="";s4="";s5="";s6="";s7="";s8="";s9="";
                btn1.setText(s1);btn2.setText(s2);btn3.setText(s3);btn4.setText(s4);btn5.setText(s5);
                btn6.setText(s6);btn7.setText(s7);btn8.setText(s8);btn9.setText(s9);
                s1="a";s2="b";s3="c";s4="e";s5="f";s6="g";s7="h";s8="i";s9="j";
                n1=1;n2=1;n3=1;n4=1;n5=1;n6=1;n7=1;n8=1;n9=1;

            text.setText("");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (n1!=0){
                if(n%2==0){
                s1="X";
                btn1.setText(s1);
                n++;
                n1=0;
            }
            else{
                s1="0";
                btn1.setText(s1);
                n++;
                n1=0;
            }
                    if((s1.equals(s2)&&s2.equals(s3))||(s4.equals(s5)&&s5.equals(s6))||(s7.equals(s8)&&s8.equals(s9))
                            ||(s1.equals(s4)&&s4.equals(s7))||(s2.equals(s5)&&s5.equals(s8))||(s3.equals(s6)&&s6.equals(s9))
                            ||(s1.equals(s5)&&s5.equals(s9))||(s3.equals(s5)&&s5.equals(s7)))
                    {   last();
                        btn.setVisibility(View.VISIBLE);
                        if(s1.equals("X")){
                            text.setText("PLAYER 1 WINS");
                        }
                        else{text.setText("PLAYER 2 WINS");}
                    }
                }
                if(n1==0&&n2==0&&n3==0&&n4==0&&n5==0&&n6==0&&n7==0&&n8==0&&n9==0){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                               while(n2!=0){
                if(n%2==0){
                    s2="X";
                    btn2.setText(s2);
                    n++;
                n2=0;
                }
                else{
                    s2="0";
                    btn2.setText(s2);
                    n++;
                n2=0;
                }
            }
                if((s1.equals(s2)&&s2.equals(s3))||(s4.equals(s5)&&s5.equals(s6))||(s7.equals(s8)&&s8.equals(s9))
                        ||(s1.equals(s4)&&s4.equals(s7))||(s2.equals(s5)&&s5.equals(s8))||(s3.equals(s6)&&s6.equals(s9))
                        ||(s1.equals(s5)&&s5.equals(s9))||(s3.equals(s5)&&s5.equals(s7)))
                {   last();
                    btn.setVisibility(View.VISIBLE);
                    if(s1.equals("X")){
                        text.setText("PLAYER 1 WINS");
                    }
                    else{text.setText("PLAYER 2 WINS");}
                }
                if(n1==0&&n2==0&&n3==0&&n4==0&&n5==0&&n6==0&&n7==0&&n8==0&&n9==0){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (n3!=0){
                if(n%2==0){
                    s3="X";
                    btn3.setText(s3);
                    n++;
                n3=0;}
                else{
                    s3="0";
                    btn3.setText(s3);
                    n++;
                n3=0;}
            }
                if((s1.equals(s2)&&s2.equals(s3))||(s4.equals(s5)&&s5.equals(s6))||(s7.equals(s8)&&s8.equals(s9))
                        ||(s1.equals(s4)&&s4.equals(s7))||(s2.equals(s5)&&s5.equals(s8))||(s3.equals(s6)&&s6.equals(s9))
                        ||(s1.equals(s5)&&s5.equals(s9))||(s3.equals(s5)&&s5.equals(s7)))
                {   last();
                    btn.setVisibility(View.VISIBLE);
                    if(s1.equals("X")){
                        text.setText("PLAYER 1 WINS");
                    }
                    else{text.setText("PLAYER 2 WINS");}
                }
                if(n1==0&&n2==0&&n3==0&&n4==0&&n5==0&&n6==0&&n7==0&&n8==0&&n9==0){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (n4!=0){
                if(n%2==0){
                    s4="X";
                    btn4.setText(s4);
                    n++;
                n4=0;}
                else{
                    s4="0";
                    btn4.setText(s4);
                    n++;
                n4=0;}
            }
                if((s1.equals(s2)&&s2.equals(s3))||(s4.equals(s5)&&s5.equals(s6))||(s7.equals(s8)&&s8.equals(s9))
                        ||(s1.equals(s4)&&s4.equals(s7))||(s2.equals(s5)&&s5.equals(s8))||(s3.equals(s6)&&s6.equals(s9))
                        ||(s1.equals(s5)&&s5.equals(s9))||(s3.equals(s5)&&s5.equals(s7)))
                {   last();
                    btn.setVisibility(View.VISIBLE);
                    if(s1.equals("X")){
                        text.setText("PLAYER 1 WINS");
                    }
                    else{text.setText("PLAYER 2 WINS");}
                }
                if(n1==0&&n2==0&&n3==0&&n4==0&&n5==0&&n6==0&&n7==0&&n8==0&&n9==0){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (n5!=0)
                {if(n%2==0){
                    s5="X";
                    btn5.setText(s5);
                    n++;
                n5=0;
                }
                else{
                    s5="0";
                    btn5.setText(s5);
                    n++;
                n5=0;
                }
            }
                if((s1.equals(s2)&&s2.equals(s3))||(s4.equals(s5)&&s5.equals(s6))||(s7.equals(s8)&&s8.equals(s9))
                        ||(s1.equals(s4)&&s4.equals(s7))||(s2.equals(s5)&&s5.equals(s8))||(s3.equals(s6)&&s6.equals(s9))
                        ||(s1.equals(s5)&&s5.equals(s9))||(s3.equals(s5)&&s5.equals(s7)))
                {   last();
                    btn.setVisibility(View.VISIBLE);
                    if(s1.equals("X")){
                        text.setText("PLAYER 1 WINS");
                    }
                    else{text.setText("PLAYER 2 WINS");}
                }
                if(n1==0&&n2==0&&n3==0&&n4==0&&n5==0&&n6==0&&n7==0&&n8==0&&n9==0){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (n6!=0){
                if(n%2==0){
                    s6="X";
                    btn6.setText(s6);
                    n++;
                n6=0;}
                else{
                    s6="0";
                    btn6.setText(s6);
                    n++;
                n6=0;}
            }
                if((s1.equals(s2)&&s2.equals(s3))||(s4.equals(s5)&&s5.equals(s6))||(s7.equals(s8)&&s8.equals(s9))
                        ||(s1.equals(s4)&&s4.equals(s7))||(s2.equals(s5)&&s5.equals(s8))||(s3.equals(s6)&&s6.equals(s9))
                        ||(s1.equals(s5)&&s5.equals(s9))||(s3.equals(s5)&&s5.equals(s7)))
                {   last();
                    btn.setVisibility(View.VISIBLE);
                    if(s1.equals("X")){
                        text.setText("PLAYER 1 WINS");
                    }
                    else{text.setText("PLAYER 2 WINS");}
                }
                if(n1==0&&n2==0&&n3==0&&n4==0&&n5==0&&n6==0&&n7==0&&n8==0&&n9==0){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (n7!=0){
                if(n%2==0){
                    s7="X";
                    btn7.setText(s7);
                    n++;
                n7=0;}
                else{
                    s7="0";
                    btn7.setText(s7);
                    n++;
                n7=0;}
            }
                if((s1.equals(s2)&&s2.equals(s3))||(s4.equals(s5)&&s5.equals(s6))||(s7.equals(s8)&&s8.equals(s9))
                        ||(s1.equals(s4)&&s4.equals(s7))||(s2.equals(s5)&&s5.equals(s8))||(s3.equals(s6)&&s6.equals(s9))
                        ||(s1.equals(s5)&&s5.equals(s9))||(s3.equals(s5)&&s5.equals(s7)))
                {   last();
                    btn.setVisibility(View.VISIBLE);
                    if(s1.equals("X")){
                        text.setText("PLAYER 1 WINS");
                    }
                    else{text.setText("PLAYER 2 WINS");}
                }
                if(n1==0&&n2==0&&n3==0&&n4==0&&n5==0&&n6==0&&n7==0&&n8==0&&n9==0){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (n8!=0){
                if(n%2==0){
                    s8="X";
                    btn8.setText(s8);
                    n++;
             n8=0;   }
                else{
                    s8="0";
                    btn8.setText(s8);
                    n++;
                n8=0;}
            }
                if((s1.equals(s2)&&s2.equals(s3))||(s4.equals(s5)&&s5.equals(s6))||(s7.equals(s8)&&s8.equals(s9))
                        ||(s1.equals(s4)&&s4.equals(s7))||(s2.equals(s5)&&s5.equals(s8))||(s3.equals(s6)&&s6.equals(s9))
                        ||(s1.equals(s5)&&s5.equals(s9))||(s3.equals(s5)&&s5.equals(s7)))
                {   last();
                    btn.setVisibility(View.VISIBLE);
                    if(s1.equals("X")){
                        text.setText("PLAYER 1 WINS");
                    }
                    else{text.setText("PLAYER 2 WINS");}
                }
                if(n1==0&&n2==0&&n3==0&&n4==0&&n5==0&&n6==0&&n7==0&&n8==0&&n9==0){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (n9!=0){
                if(n%2==0){
                    s9="X";
                    btn9.setText(s9);
                    n++;
               n9=0; }
                else{
                    s9="0";
                    btn9.setText(s9);
                    n++;
                n9=0;}
            }
                if((s1.equals(s2)&&s2.equals(s3))||(s4.equals(s5)&&s5.equals(s6))||(s7.equals(s8)&&s8.equals(s9))
                        ||(s1.equals(s4)&&s4.equals(s7))||(s2.equals(s5)&&s5.equals(s8))||(s3.equals(s6)&&s6.equals(s9))
                        ||(s1.equals(s5)&&s5.equals(s9))||(s3.equals(s5)&&s5.equals(s7)))
                {   last();
                    btn.setVisibility(View.VISIBLE);
                    if(s1.equals("X")){
                        text.setText("PLAYER 1 WINS");
                    }
                    else{text.setText("PLAYER 2 WINS");}
                }
                if(n1==0&&n2==0&&n3==0&&n4==0&&n5==0&&n6==0&&n7==0&&n8==0&&n9==0){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void last() {
        n1=0;n3=0;n5=0;n7=0;n9=0;
        n2=0;n4=0;n6=0;n8=0;
        n=0;
    }

}
