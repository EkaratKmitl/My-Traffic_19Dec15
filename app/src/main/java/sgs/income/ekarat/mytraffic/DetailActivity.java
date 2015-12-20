package sgs.income.ekarat.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView headTextView4, detalTextView;
    private ImageView trafficimageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        //Bind Widget
        bindWidget();

        //show view
        showView();

    }//Main Method

    private void showView() {

        //Show Head  รับค่าที่ส่งมาให้จากMainActivity.java
        String strHead = getIntent().getStringExtra("Head");
        headTextView4.setText(strHead);

        //Show Image
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficimageView2.setImageResource(intImage);

        //Show Detail
        int intIndex = getIntent().getIntExtra("Index",0);
        String[] strDetail = getResources().getStringArray(R.array.detail);
        detalTextView.setText(strDetail[intIndex]);

    }// Show View

    private void bindWidget() {
        headTextView4 = (TextView) findViewById(R.id.textView4);
        trafficimageView2 = (ImageView) findViewById(R.id.imageView2);
        detalTextView = (TextView) findViewById(R.id.textView3);


    }

} //Main Class
