package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class listlayout extends AppCompatActivity {


    SimpleAdapter simpleAdpter;
    int[] photos = new int[]{R.drawable.little_animal_01, R.drawable.little_animal_02,
            R.drawable.little_animal_03, R.drawable.little_animal_04,
            R.drawable.little_animal_05, R.drawable.little_animal_6, R.drawable.little_animal_7,
            R.drawable.little_animal_8,};
    String[] names = new String[]{"鸡鸡", "牛牛", "猫猫", "彩色牛牛", "狗狗", "象象", "马马", "豹豹"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listlayout);
        ListView lv = (ListView) findViewById(R.id.lv);/*定义一个动态数组*/

        ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();/*在数组中存放数据*/

        for (int i = 0; i < 8; i++) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("ItemImage", photos[i]);//加入图片
            map.put("ItemTitle", names[i]);
            map.put("ItemText", i);
            listItem.add(map);
        }
        //new String  数据来源， new int 数据到哪去
        SimpleAdapter mSimpleAdapter = new SimpleAdapter(this, listItem, R.layout.activity_listlayout,
                new String[]{"ItemImage", "ItemTitle", "ItemText"},
                new int[]{R.id.ItemImage, R.id.ItemTitle, R.id.ItemText});
        lv.setAdapter(mSimpleAdapter);//为ListView绑定适配器


    }
}