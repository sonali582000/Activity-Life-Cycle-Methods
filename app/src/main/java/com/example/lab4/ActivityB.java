package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.d("ACTIVITY B","onCreate invoked");
        Toast.makeText(this,"Created Activity B",Toast.LENGTH_SHORT).show();
    }

    public void actA(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ACTIVITY B","onStart invoked");
        Toast.makeText(ActivityB.this,"Start Activity B",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ACTIVITY B","onResume invoked");
        Toast.makeText(ActivityB.this,"Resume Activity B",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ACTIVITY B","onPause invoked");
        Toast.makeText(this,"Pause Activity B",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ACTIVITY B","onStop invoked");
        Toast.makeText(this,"Stop Activity B",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ACTIVITY B","onRestart invoked");
        Toast.makeText(this,"Restart Activity B",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ACTIVITY B","onDestroy invoked");
        Toast.makeText(this,"Destroy Activity B",Toast.LENGTH_SHORT).show();
    }



}