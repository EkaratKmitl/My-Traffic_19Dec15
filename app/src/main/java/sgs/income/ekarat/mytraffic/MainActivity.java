package sgs.income.ekarat.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Explicit = คือการประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind Widget
        bindWidget();
        //Button Controller
        buttonController();

        //ListView Controller
        listViewConroler();

    }   // Main Method

    private void listViewConroler() {

        //Setup Array #1
        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05,
                R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11,
                R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17,
                R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_02};// แหล่งกำเนิดของรูปภาพ

        //Setup Array #2
        String[] title1Strings = new String[20];
        title1Strings[0] = "หัวข้อ 1";
        title1Strings[1] = "หัวข้อ 2";
        title1Strings[2] = "หัวข้อ 3";
        title1Strings[3] = "หัวข้อ 4";
        title1Strings[4] = "หัวข้อ 5";
        title1Strings[5] = "หัวข้อ 6";
        title1Strings[6] = "หัวข้อ 7";
        title1Strings[7] = "หัวข้อ 8";
        title1Strings[8] = "หัวข้อ 9";
        title1Strings[9] = "หัวข้อ 10";
        title1Strings[10] = "หัวข้อ 11";
        title1Strings[11] = "หัวข้อ 12";
        title1Strings[12] = "หัวข้อ 13";
        title1Strings[13] = "หัวข้อ 14";
        title1Strings[14] = "หัวข้อ 15";
        title1Strings[15] = "หัวข้อ 16";
        title1Strings[16] = "หัวข้อ 17";
        title1Strings[17] = "หัวข้อ 18";
        title1Strings[18] = "หัวข้อ 19";
        title1Strings[19] = "หัวข้อ 20";

        //Setup Array #3
        String[] strTitle2 = getResources().getStringArray(R.array.title2);

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, title1Strings, strTitle2, intIcon);
        trafficListView.setAdapter(objMyAdapter);

    } // listViewController


    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Sound  Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                buttonMediaPlayer.start();
                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://www.youtube.com/watch?v=eBP9xRpQvA4"));
                startActivity(objIntent);
            } //Click
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }


}  //Main Class
