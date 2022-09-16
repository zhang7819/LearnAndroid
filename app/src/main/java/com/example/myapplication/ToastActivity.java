package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        findViewById(R.id.btnSimpleToast).setOnClickListener(this);
        findViewById(R.id.btnSimpleToastWithCustomPosition).setOnClickListener(this);
        findViewById(R.id.btnCustomToast).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
Toast toast = null;
       switch (view.getId()){
           case R.id.btnSimpleToast:
               Toast.makeText(getApplicationContext(),"默认的Toast样式",Toast.LENGTH_SHORT).show();
               break;
           case R.id.btnSimpleToastWithCustomPosition:
               toast = Toast.makeText(getApplicationContext(),"改变位置的Toast",Toast.LENGTH_SHORT);
               toast.setGravity(Gravity.CENTER,0,0);
               toast.show();
               break;
           case R.id.btnCustomToast:
               toast = Toast.makeText(getApplicationContext(),"带图片+更改位置的Toast",Toast.LENGTH_LONG);
               LinearLayout toastView = (LinearLayout)toast.getView();
               ImageView imageCodeProject = new ImageView(getApplicationContext());
               imageCodeProject.setImageResource(R.drawable.hyteacher);
               toastView.addView(imageCodeProject,1);
               toast.setGravity(Gravity.CENTER,0,0);
               toast.show();
               break;
       }
    }
}