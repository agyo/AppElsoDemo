package hu.itfactory.app.examples.appelsodemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Date;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Button btnShowDateTime = (Button) findViewById(R.id.btnShowDateTime);

        btnShowDateTime.setOnLongClickListener( new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText( getApplicationContext(), "valami", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        btnShowDateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        getApplicationContext().getPackageCodePath(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }



}
