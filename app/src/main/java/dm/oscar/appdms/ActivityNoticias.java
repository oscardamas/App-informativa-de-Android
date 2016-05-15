package dm.oscar.appdms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityNoticias extends AppCompatActivity {

    ListView listView;
    String [] elementos = {"estado1", "estado2", "estado3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);

        listView = (ListView) findViewById(R.id.listview1);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,elementos);
        listView.setAdapter(adapter);
    }
}
