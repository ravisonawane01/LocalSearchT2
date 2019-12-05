package com.example.ravi.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ravi.R;

public class OneActivity extends AppCompatActivity {

    private static String TAG = OneActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Log.d(TAG, "1-ON CREATE");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "1-ON START");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "1-ON RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "1-ON PAUSE");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "1-ON RESTART");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "1-ON STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "1-ON DESTROY");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "1-onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "1-onSaveInstanceState");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
