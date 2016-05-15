package dm.oscar.appdms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ActivityOne extends AppCompatActivity implements View.OnClickListener {

    Button bnoticias;
    Button bcontacto;
    Button bacercade;

    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        logo = (ImageView) findViewById(R.id.imageView);

        bacercade = (Button) findViewById(R.id.button3);
        bacercade.setOnClickListener(this);

       bcontacto = (Button) findViewById(R.id.button4);
        bcontacto.setOnClickListener(this);

        bnoticias = (Button) findViewById(R.id.button);
        bnoticias.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button3:
                Intent vacerca = new Intent(this, ActivityAcercaDe.class);
                startActivity(vacerca);
                break;
            case R.id.button4:
                Intent vcontacto = new Intent(this, ActivityContacto.class);
                startActivity(vcontacto);
                break;
            case R.id.button:
                Intent vnoticias = new Intent(this, ActivityConvocatorias.class);
                startActivity(vnoticias);


        }

    }




}
