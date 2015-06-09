package com.roberto.clima;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.MenuItem;
import java.util.ArrayList;


ListView lista;

        ArrayList<ClaseLista> dato;

@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listado=(ListView)findViewById(R.id.listado);

        datos=new ArrayList<ClaseLista>();

        dato.add(new List("Lunes","Soleado","25/33",R.drawable.ic_launcher));
        dato.add(new List("Martes","Soleado","25/33",R.drawable.ic_launcher));
        dato.add(new List("Miercoles","Soleado","35/22",R.drawable.ic_launcher));
        dato.add(new List("Jueves","Soleado","35/22",R.drawable.ic_launcher));
        dato.add(new List("Viernes","Soleado","35/22",R.drawable.ic_launcher));
        dato.add(new List("Sábado","Soleado","35/22",R.drawable.ic_launcher));
        dato.add(new List("Domingo","Soleado","35/22",R.drawable.ic_launcher));
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
