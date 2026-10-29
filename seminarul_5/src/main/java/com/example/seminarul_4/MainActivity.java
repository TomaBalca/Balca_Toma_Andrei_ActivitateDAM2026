package com.example.seminarul_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Butoi> listaButoi = new ArrayList<>();
    private static final int COD_Adaugare = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }
    public void Date(View view){
        Intent it = new Intent(getApplicationContext(), AdaugaButoi.class);
        startActivityForResult(it, COD_Adaugare);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == COD_Adaugare && resultCode == RESULT_OK && data != null) {
            Butoi butoi = (Butoi) data.getSerializableExtra("butoi");
            listaButoi.add(butoi);
            Toast.makeText(getApplicationContext(), "In lista: " + listaButoi.size(), Toast.LENGTH_SHORT).show();
        }
    }

    public void afiseazaLista(View view) {
        Intent it = new Intent(getApplicationContext(), ListaButoi.class);
        it.putExtra("lista", listaButoi);
        startActivity(it);
    }

}