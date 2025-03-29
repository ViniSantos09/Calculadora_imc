package com.example.androidni.telas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidni.MainActivity;
import com.example.androidni.R;

public class AbaixoDoPesoActivity extends AppCompatActivity {

    private TextView titleMedidas, txtMensagem;
    private Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_abaixo_do_peso);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        double peso = bundle.getDouble("peso");
        double altura = bundle.getDouble("altura");
        double IMC = bundle.getDouble("IMC");
        String IMCDecimal = String.format("%.2f",IMC);
        titleMedidas = findViewById(R.id.titleMedidas);
        titleMedidas.setText("Peso: " + peso + "\n"
                + "Altura: " + altura + "\n"
                +"IMC: " + IMCDecimal + "\n"
                +"classificação: " + "Abaixo do peso");

        txtMensagem = findViewById(R.id.txtMensagem);
        txtMensagem.setText(R.string.mensagem_abaixodopeso);

        btnFechar = findViewById(R.id.btnFechar);
        btnFechar.setOnClickListener(view->{
            Intent intentAbaixoDoPeso = new Intent(this, MainActivity.class);
            startActivity(intentAbaixoDoPeso);
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Ciclo da Vida","Tela Abaixo Do Peso - OnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Ciclo da Vida","Tela Abaixo Do Peso - OnResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Ciclo da Vida","Tela Abaixo Do Peso - OnPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Ciclo da Vida","Tela Abaixo Do Peso - OnStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Ciclo da Vida","Tela Abaixo Do Peso - OnDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Ciclo da Vida","Tela Calculadora IMC - OnRestart");
    }
}