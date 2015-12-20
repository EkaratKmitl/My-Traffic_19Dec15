package sgs.income.ekarat.mytraffic;

import android.content.ContentProvider;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/*** Created by Eva on 12/19/2015.*/

public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private String[] title1Strings,  getTit2e1Strings;
    private int[] iconInts;

    public MyAdapter(Context objContext, String[] title1Strings, String[] getTit2e1Strings, int[] iconInts) {
        this.objContext = objContext;
        this.title1Strings = title1Strings;
        this.getTit2e1Strings = getTit2e1Strings;
        this.iconInts = iconInts;



    }// Constructor

    @Override
    public int getCount() {
        return  title1Strings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // open Service
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        //For TextView
        TextView title1TextView = (TextView) objView1.findViewById(R.id.txtText2);
        title1TextView.setText(title1Strings[position]);

        TextView Title2TextView = (TextView) objView1.findViewById(R.id.txtText2);
        Title2TextView.setText(getTit2e1Strings[position]);

        //For Image
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvIcon);
        iconImageView.setImageResource(iconInts[position]);




        return objView1;
    }
} //Main Class
