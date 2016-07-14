package clm.benandjerrysshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jbt on 7/14/2016.
 */
public class IceCreamAdapter extends ArrayAdapter<IceCream>{
    List<IceCream> iceCreams ;
    Context c;

    public IceCreamAdapter(Context context, int resource, List<IceCream> objects) {
        super(context, resource, objects);
        iceCreams=objects;
        c=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        // TODONE init listview
        if ( v == null) {
            LayoutInflater viewInflater;
            viewInflater= LayoutInflater.from(getContext());
            v=viewInflater.inflate( R.layout.list_item_icecream,null);
        }
        IceCream iceCream = iceCreams.get(position);

        TextView nameTV=(TextView)v.findViewById(R.id.nameTV);
        nameTV.setText(iceCream.getName());

        TextView amountTV=(TextView) v.findViewById(R.id.amountTV);
        amountTV.setText(""+iceCream.getAmount());

        TextView priceTV=(TextView) v.findViewById(R.id.priceTV);
        priceTV.setText(""+iceCream.getPrice());

        ImageView image=(ImageView) v.findViewById(R.id.imageView);
        image.setImageResource(iceCream.getPic());

        return v;
    }
}
