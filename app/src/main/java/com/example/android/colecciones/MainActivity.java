package com.example.android.colecciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView text;
    Map<String,Integer > map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        text = (TextView) findViewById(R.id.textView);

        // adapter
        ArrayAdapter<String> adapter;
        map = new HashMap<>();
        map.put("Salsa", 1);
        map.put("Baladas", 2);
        map.put("Criollos", 3);

        Set<String> cols = map.keySet();
        String[] temas = Arrays.copyOf(cols.toArray(), cols.toArray().length, String[].class);
        //

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, temas);
        spinner.setAdapter(adapter);

    }

    public void seleccionado(View view) {
        String selec = spinner.getSelectedItem().toString();
        text.setText("" + map.get(selec));
    }
}
