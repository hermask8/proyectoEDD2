package com.example.ervi.proyectoedd2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtUsuario;
    EditText txtContraseña;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (EditText) findViewById(R.id.txtIngresoUsuario);
        txtContraseña = (EditText) findViewById(R.id.txtIngresoContra);
        btnLogin = (Button) findViewById(R.id.btnIngresar);
    }
}
