package com.example.calculadorasimple; // Reemplaza por tu package si es diferente

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNum1, txtNum2;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        lblResultado = findViewById(R.id.lblResultado);
    }

    private double[] obtenerNumeros() {
        try {
            double n1 = Double.parseDouble(txtNum1.getText().toString());
            double n2 = Double.parseDouble(txtNum2.getText().toString());
            return new double[]{n1, n2};
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public void sumar(View view) {
        double[] nums = obtenerNumeros();
        if (nums != null) {
            double res = nums[0] + nums[1];
            lblResultado.setText("Resultado: " + res);
        } else {
            lblResultado.setText("Introduce números válidos");
        }
    }

    public void restar(View view) {
        double[] nums = obtenerNumeros();
        if (nums != null) {
            double res = nums[0] - nums[1];
            lblResultado.setText("Resultado: " + res);
        } else {
            lblResultado.setText("Introduce números válidos");
        }
    }

    public void multiplicar(View view) {
        double[] nums = obtenerNumeros();
        if (nums != null) {
            double res = nums[0] * nums[1];
            lblResultado.setText("Resultado: " + res);
        } else {
            lblResultado.setText("Introduce números válidos");
        }
    }

    public void dividir(View view) {
        double[] nums = obtenerNumeros();
        if (nums != null) {
            if (nums[1] == 0) {
                lblResultado.setText("No se puede dividir por cero");
            } else {
                double res = nums[0] / nums[1];
                lblResultado.setText("Resultado: " + res);
            }
        } else {
            lblResultado.setText("Introduce números válidos");
        }
    }
}
