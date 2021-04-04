package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ACTIVITY A","onCreate invoked");
        Toast.makeText(MainActivity.this,"Created Activity A",Toast.LENGTH_SHORT).show();
    }
    public void actB(View view) {
        Intent i=new Intent(this,ActivityB.class);
        startActivity(i);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ACTIVITY A","onStart invoked");
        Toast.makeText(MainActivity.this,"Start Activity A",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ACTIVITY A","onResume invoked");
        Toast.makeText(MainActivity.this,"Resume Activity A",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ACTIVITY A","onPause invoked");
        Toast.makeText(MainActivity.this,"Pause Activity A",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ACTIVITY A","onStop invoked");
        Toast.makeText(MainActivity.this,"Stop Activity A",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ACTIVITY A","onRestart invoked");
        Toast.makeText(MainActivity.this,"Restart Activity A",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ACTIVITY A","onDestroy invoked");
        Toast.makeText(MainActivity.this,"Destroy Activity A",Toast.LENGTH_SHORT).show();
    }



}