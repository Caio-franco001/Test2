package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tela1 extends AppCompatActivity {



    Button Btnsoma;
    Button Btnsubt;
    Button Btndiv;
    Button Btnmult;
    EditText Txt1;
    EditText Txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela1);

        Btnsoma=findViewById(R.id.Btnsoma)  ;
        Btnsubt=findViewById(R.id.Btnsub);
        Btndiv=findViewById(R.id.Btndiv);
        Btnmult=findViewById(R.id.Btnmult);

         Txt1=findViewById(R.id.Txt1);
        Txt2=findViewById(R.id.Txt2);

        Intent it = getIntent();

        String numm1 = it.getStringExtra("numero1");
        String numm2 = it.getStringExtra("numero2");

        Txt1.setText(numm1);
        Txt2.setText(numm2);



        Btnsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it=new Intent(tela1.this, tela2.class );

                it.putExtra("numero1", Txt1.getText().toString());
                it.putExtra("numero2", Txt2.getText().toString());


                String num1= Txt1.getText().toString();
                String num2= Txt2.getText().toString();

                double n1 = Double.parseDouble(num1);
                double n2 = Double.parseDouble(num2);
                double result=n1+n2;

                String resultado = String.valueOf(result);
                it.putExtra("Resultado", resultado);

                startActivity(it);

            }
        });

        Btnsubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(tela1.this, tela2.class );

                it.putExtra("numero1", Txt1.getText().toString());
                it.putExtra("numero2", Txt2.getText().toString());


                String num1= Txt1.getText().toString();
                String num2= Txt2.getText().toString();

                double n1 = Double.parseDouble(num1);
                double n2 = Double.parseDouble(num2);
                double result=n1-n2;

                String resultado = String.valueOf(result);
                it.putExtra("Resultado", resultado);

                startActivity(it);
            }
        });

        Btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(tela1.this, tela2.class );

                it.putExtra("numero1", Txt1.getText().toString());
                it.putExtra("numero2", Txt2.getText().toString());


                String num1= Txt1.getText().toString();
                String num2= Txt2.getText().toString();

                double n1 = Double.parseDouble(num1);
                double n2 = Double.parseDouble(num2);
                double result=n1/n2;

                String resultado = String.valueOf(result);
                it.putExtra("Resultado", resultado);

                startActivity(it);
            }
        });

        Btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(tela1.this, tela2.class );

                it.putExtra("numero1", Txt1.getText().toString());
                it.putExtra("numero2", Txt2.getText().toString());


                String num1= Txt1.getText().toString();
                String num2= Txt2.getText().toString();

                double n1 = Double.parseDouble(num1);
                double n2 = Double.parseDouble(num2);
                double result=n1*n2;

                String resultado = String.valueOf(result);
                it.putExtra("Resultado", resultado);

                startActivity(it);
            }
        });
    }
}