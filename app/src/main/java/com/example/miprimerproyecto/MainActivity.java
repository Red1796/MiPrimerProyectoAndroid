package com.example.miprimerproyecto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MiPrimerProyecto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView welcomeText = findViewById(R.id.welcome_text);

        Button enterButton = findViewById(R.id.enter_button);

        String currentLanguage = getResources().getConfiguration().getLocales().get(0).getLanguage();
        Log.d(TAG, "Idioma de la aplicación cargado: " + currentLanguage);


        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "¡Botón 'Entrar' presionado!");

                Log.i(TAG, "El mensaje de bienvenida actual es: " + welcomeText.getText());
            }
        });
    }
}