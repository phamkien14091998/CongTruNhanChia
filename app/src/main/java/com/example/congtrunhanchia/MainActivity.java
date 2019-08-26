package com.example.congtrunhanchia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtSoa,edtSob;
    TextView txtKQ;
    Button btnCong,btnTru,btnNhan,btnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSoa= (EditText) findViewById(R.id.edtSoa);
        edtSob = (EditText) findViewById(R.id.edtSob);
        txtKQ = (TextView) findViewById(R.id.txtKQ);

        btnCong=(Button) findViewById(R.id.btnCong);
        btnTru=(Button) findViewById(R.id.btnTru);
        btnNhan=(Button) findViewById(R.id.btnNhan);
        btnChia=(Button) findViewById(R.id.btnChia);

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa=Integer.parseInt(edtSoa.getText().toString());
                int sob=Integer.parseInt(edtSob.getText().toString());
                int tong=soa+sob;
                txtKQ.setText(soa +"+" + sob +"="+ tong);

            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa=Integer.parseInt(edtSoa.getText().toString());
                int sob=Integer.parseInt(edtSob.getText().toString());
                int hieu=soa-sob;
                txtKQ.setText(soa +"-" + sob +"="+ hieu);

            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa=Integer.parseInt(edtSoa.getText().toString());
                int sob=Integer.parseInt(edtSob.getText().toString());
                int nhan=soa*sob;
                txtKQ.setText(soa +"x" + sob +"="+ nhan);

            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa=Integer.parseInt(edtSoa.getText().toString());
                int sob=Integer.parseInt(edtSob.getText().toString());
                int chia=soa/sob;
                txtKQ.setText(soa +" : " + sob +"="+ chia);

            }
        });

    }
}
