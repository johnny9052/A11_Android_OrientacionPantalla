package com.example.johnny.a11_android_orientacionpantalla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Recordar la configuracion en el manifiest. Landscape = horizontal - portrait = vertical
    }


    public void abrirVertical(View view) {
        Intent intent = new Intent(this, VerticalActivity.class);
        startActivity(intent);
    }

    public void abrirHorizontal(View view) {
        Intent intent = new Intent(this, HorizontalActivity.class);
        startActivity(intent);
    }

}
