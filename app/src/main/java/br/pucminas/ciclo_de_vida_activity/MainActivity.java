package br.pucminas.ciclo_de_vida_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnAbrirActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAbrirActivity = findViewById(R.id.btnAbrirActivityId);

        // ADICIONANDO A ACAO ONCLICK DO BOTAO
        btnAbrirActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CRIA UMA INTENCAO NO ANDROID ==> ABRIR A SEGUNDA ACTIVITY
                Intent intent = new Intent(getApplicationContext(), segundaActivity.class);

                // PASSANDO DADOS PARA A OUTRA ACTIVITY
                intent.putExtra("texto", "Hakuna Matata!");

                startActivity(intent);
            }
        });

        print("onCreate");
    }
    protected void print(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        print("onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        print("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        print("onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        print("onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        print("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        print("onDestroy");
    }
}
