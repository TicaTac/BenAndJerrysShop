package clm.benandjerrysshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ShopActivity extends AppCompatActivity {
    ArrayList<IceCream> iceCreams ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        // init list
        iceCreams = new ArrayList<>();
        iceCreams.add(new IceCream("Cheesecake Brownie",10.0f,R.drawable.cheesebrown));
        iceCreams.add(new IceCream("Choco Fudge",12.0f,R.drawable.chocofudge));
        iceCreams.add(new IceCream("Karamel Sutra",14.0f,R.drawable.karamel));
        iceCreams.add(new IceCream("Vanilla",10.0f,R.drawable.vanilla));


        // TODONE create adapter

        // TODONE link adapter to lv

        ListView icecreamsLV= (ListView) findViewById(R.id.itemsLV);
        IceCreamAdapter arrayAdapter = new IceCreamAdapter(this, R.layout.list_item_icecream, iceCreams );
        icecreamsLV.setAdapter(arrayAdapter);

        // TODO write to preferences
        // TODO read from preferences
    }
}
