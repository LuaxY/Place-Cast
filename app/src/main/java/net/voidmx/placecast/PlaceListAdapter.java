package net.voidmx.placecast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PlaceListAdapter extends ArrayAdapter<PlaceItem> {

    private final Context mContext;
    private final List<PlaceItem> mItems;
    private final LayoutInflater mInflater;

    public PlaceListAdapter(Context context, List<PlaceItem> items) {
        super(context, R.layout.item_list, items);
        mContext = context;
        mItems = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_list, null, true);
        }

        TextView txtTitle = (TextView) convertView.findViewById(R.id.txt);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.img);

        txtTitle.setText(mItems.get(position).getItemName());
        imageView.setImageResource(mItems.get(position).getImageId());

        return convertView;
    }
}
