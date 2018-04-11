package com.example.tequila.sumacheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText varTxtNum1;
EditText varTxtNum2;

RadioButton varmultiplicacion;
RadioButton varRdresta;
RadioButton varRdsuma;
RadioButton vardivision;
Button varButton;
TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        varTxtNum1 = (EditText) findViewById(R.id.txtNum1);
        varTxtNum2 = (EditText) findViewById(R.id.txtNum2);

        varRdsuma = (RadioButton) findViewById(R.id.rdSuma);
        varRdresta = (RadioButton) findViewById(R.id.rdResta);
        varmultiplicacion = (RadioButton) findViewById(R.id.rdmultiplicacion);
        vardivision = (RadioButton) findViewById(R.id.rdDivision);
        
        varButton = (Button) findViewById(R.id.btnOperacion);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        varButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resultado = 0;
                int num1 = Integer.parseInt(varTxtNum1.getText().toString());
                int num2 = Integer.parseInt(varTxtNum2.getText().toString());
                if (varRdsuma.isChecked())
                    resultado = num1 + num2;
                if (varmultiplicacion.isChecked())
                    resultado = num1 * num2;
                if (varRdresta.isChecked())
                    resultado = num1 - num2;
                if (vardivision.isChecked())
                    resultado = num1 / num2;
                    txtResultado.setText("El resultado es" + resultado);
            }

        });
    }
    }








