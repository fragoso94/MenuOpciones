package com.example.proda.menuopciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MenuContexto extends AppCompatActivity {
    TextView tvTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_contexto);
        tvTexto = (TextView)findViewById(R.id.tvNombre);
        registerForContextMenu(tvTexto);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        //cuando se queda presionado unelemento del activity
        getMenuInflater().inflate(R.menu.menu_contexto, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mEditar:
                Toast.makeText(MenuContexto.this,"Editando", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mELiminar:
                Toast.makeText(MenuContexto.this,"Eliminado", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onContextItemSelected(item);
    }
}
