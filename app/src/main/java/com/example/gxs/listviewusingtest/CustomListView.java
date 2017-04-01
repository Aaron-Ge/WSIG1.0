package com.example.gxs.listviewusingtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by GXS on 2017/3/25.
 */

public class CustomListView extends Activity {

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_listview);
        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(adapter);


    }
    private BaseAdapter adapter = new BaseAdapter() {

        //private String[] data = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        private CustomListCellData[] data = new CustomListCellData[]{
                new CustomListCellData("Monday","1-2计算机前沿@7教北220","3-5数据库@7教北408","6-8计组@7教中3022","",R.drawable.img1),
                new CustomListCellData("Tuesday","","3-4跨文化交际@3教110","6-8计算机图形学@12教316","10-11书法@12教414",R.drawable.img2),
                new CustomListCellData("Wednesday","","3-5计组@6教北114","6-7形势@12教214","",R.drawable.img3),
                new CustomListCellData("Thursday","1-2毛概@3教211","3-4体育@体育馆大厅","6-7现代经济@7教北222","",R.drawable.img4),
                new CustomListCellData("Friday","1-2现代经济@11教301","3-5概率论@6教404","8-9创新@7教219","",R.drawable.img5),
                new CustomListCellData("Saturday","3-8大军@6教北106"," ","","",R.drawable.img6),
                new CustomListCellData("Sun333day"," "," ","","",R.drawable.img7),
        };
        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public CustomListCellData getItem(int position) {
            return data[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
          /*  TextView tv= null;
            if(convertView!=null){
                tv = (TextView) convertView;
            }else {
                tv = new TextView(CustomListView.this);

            }


            tv.setText(getItem(position));
            tv.setTextSize(50);


            return tv;*/
            LinearLayout ll = null;
            if(convertView!=null){
                ll = (LinearLayout)convertView;

            }else{
                ll = (LinearLayout) LayoutInflater.from(CustomListView.this).inflate(R.layout.custom_listcell,null);
            }
            CustomListCellData data = getItem(position);

            ImageView icon = (ImageView) ll.findViewById(R.id.icon);
            TextView name = (TextView) ll.findViewById(R.id.name);
            TextView dec = (TextView) ll.findViewById(R.id.description);
            TextView dec1 = (TextView) ll.findViewById(R.id.description1);
            TextView dec2 = (TextView) ll.findViewById(R.id.description2);
            TextView dec3 = (TextView) ll.findViewById(R.id.description3);
            icon.setImageResource(data.iconId);
            name.setText(data.name);
            dec.setText(data.description);
            dec1.setText(data.description1);
            dec2.setText(data.description2);
            dec3.setText(data.description3);

            return ll;
        }
    };
}
