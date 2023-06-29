package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tela2 extends AppCompatActivity {

    TextView Result2;
    Button Btnedit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela2);

        Result2 = findViewById(R.id.Result2);
        Btnedit = findViewById(R.id.Btnedit);

        Intent it = getIntent();
        String num1 = it.getStringExtra("numero1");
        String num2 = it.getStringExtra("numero2");
        String result = it.getStringExtra("Resultado");

        Result2.setText(result);


        Btnedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(tela2.this, tela1.class );
                it.putExtra("numero1",num1);
                it.putExtra("numero2",num2);

                startActivity(it);
            }
        });
    }
}