package br.pucminas.ciclo_de_vida_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class segundaActivity extends AppCompatActivity {

    private TextView txtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        txtTexto = findViewById(R.id.txtTextoId);

        // RECUPERANDO OS DADOS ENVIADOS DA ACTIVITY
        Bundle dados = getIntent().getExtras();
        String texto = dados.getString("texto");

        txtTexto.setText(texto);
    }
}
