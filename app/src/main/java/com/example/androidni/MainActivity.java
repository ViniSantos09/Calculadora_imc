package com.example.androidni;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnCalculadoraImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Log.i("Ciclo de Vida", "Tela1 - Start");

        btnCalculadoraImc = findViewById(R.id.btnCalculadoraImc);

        btnCalculadoraImc.setOnClickListener(view -> {
            Intent intent = new Intent(this, CalculoIMCActivity.class);

            startActivity(intent);
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
        Log.i("Ciclo de Vida", "Tela1 - Start");
    }

    @Override
    protected void onResume(){
        super.onResume();Log.i("Ciclo de Vida", "Tela1 - Resume");

    }

    @Override
    protected void onPause(){
        super.onPause();Log.i("Ciclo de Vida", "Tela1 - Pause");

    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Ciclo de Vida", "Tela1 - Restart");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Ciclo de Vida", "Tela1 - Stop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Ciclo de Vida", "Tela1 - Stop");
    }
}