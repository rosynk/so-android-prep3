package com.example.prep3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMensagem = findViewById(R.id.tvMensagem);
        tvMensagem.setGravity(Gravity.CENTER);

        EditText edValor = findViewById(R.id.edValor);
        edValor.setGravity(Gravity.CENTER);

        Button calcular = findViewById(R.id.calcular);

        calcular.setOnClickListener(view -> jogar(edValor, tvMensagem));
    }

    private void jogar(EditText edValor, TextView tvMensagem) {
        int numero = Integer.parseInt(edValor.getText().toString());
        int soma = 0;

        if (numero > 0 && numero <= 20) {
            for (int i = 1; i <= numero; i++) {
                soma += (2 * i - 1) * 2;
            }
            tvMensagem.setText("O valor é: " + soma);
        } else {
            Toast.makeText(this, "Por favor, escolha um número entre 1 e 20.", Toast.LENGTH_SHORT).show();
        }
    }
}
