package dm.oscar.appdms;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ActivityConvocatorias extends AppCompatActivity {

    ListView listaCV;
    String [] elementos = {"region 1","region 2","region 3","region 4","region 5","region 6", "region 7","region 8","region 9","region 10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_convocatorias);

        listaCV =(ListView) findViewById(R.id.listaConvocatoria);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,elementos);
        listaCV.setAdapter(adapter);


    }
}
