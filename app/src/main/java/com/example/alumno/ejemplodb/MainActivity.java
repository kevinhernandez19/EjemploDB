package com.example.alumno.ejemplodb;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Asignatura> asignaturas;
    private ArrayAdapter<Asignatura> adapterAsignaturas;
    private AdminSQLiteOpenHelper adminAsignaturas;

    private EditText et1;
    private EditText et2;
    private ListView lv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        lv1 = (ListView) findViewById(R.id.lv1);


        asignaturas = new ArrayList<>();
        adapterAsignaturas = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1);
        lv1.setAdapter(adapterAsignaturas);
        adminAsignaturas = new AdminSQLiteOpenHelper(this, "administracion", null, 1);

    }

    public void add(View viev) {

        SQLiteDatabase bd = adminAsignaturas.getReadableDatabase();
        String codigo = txtCodigo.gettext().toString();
        int cant = bd.delete("asignatura", "codigo = " + codigo, null);
        bd.close();
        ;
        Toast.makeText(this, "asignatura eliminada", Toast.LENGTH_SHORT).show();
    } else

    {
        Toast.makeText(this, " no exixte la asignatura en el codigo " + codigo, Toast.LENGTH_SHORT).show();

    }


    SQLiteDatabase bd = adminAsignaturas.getWritableDatabase();
    int oodigo = Integer.parseInt(txtCantEstudiantes.getText().tostring());
    String nombre = txtNombre.getText().toString();

    ContentValues registro = new ContentValues();
     registro.put("codigo",codigo);
     registro.put("codigo",nombre);
     registro.put("cantidadEstudiantes", cantidadEstudiantes);

    bd.insert("asignatura", null tupla);
    bd.close();

    toast.makeText(this, "Asignatura insertada", Toast.LENGTH_SHORT).show();
     showAll();


}
       public void del(View view){}
       public void showAll() {}

       String query = "select * from asignatura";
       SQLiteDatebase bd = adminAsignaturas.getReadableDatabase();

       asignaturas.clear();

       Cursor c = bd.rawQuery(query, null);
               while(c.moveTonext()){
               }
               Asignatura a = new Asignatura();
               a.setCodigo(c.getInt(cgetColumnIndex("codigo")));
               .setNombre(c.getString(c.getInt(c.getcolumnIndex("cantidad estudiantes")));
               asignaturas.add(a);
}

adapter.notifyDataSetchanged(9);
}
               }