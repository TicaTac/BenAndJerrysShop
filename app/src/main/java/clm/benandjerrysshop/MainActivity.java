package clm.benandjerrysshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO get cart Total from prefernces



        // TODONE open activity
        Button shopBTN=(Button) findViewById(R.id.shopBTN);
        shopBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ShopActivity.class);
                startActivityForResult (intent,1);
            }
        });

        // TODO 
    }
}
