package com.example.proda.menuopciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuAbout:
                Toast.makeText(MainActivity.this, "About", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuSesstings:
                Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuContexto:
                Intent menuContexto = new Intent(MainActivity.this, MenuContexto.class);
                startActivity(menuContexto);
                //finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void levantarPopup(View v){
        ImageView image = (ImageView) findViewById(R.id.iv_imagen);
        PopupMenu popup = new PopupMenu(this, v);
        popup.getMenuInflater().inflate(R.menu.menu_popup, popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mView:
                        Toast.makeText(MainActivity.this, "Vista", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mViewDetail:
                        Toast.makeText(MainActivity.this, "Vista Detalle", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });

        popup.show(); //mostramos el popup
    }
}
