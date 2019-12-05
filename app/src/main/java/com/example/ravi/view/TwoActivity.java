package com.example.ravi.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ravi.R;

public class TwoActivity extends AppCompatActivity {

    private static String TAG = TwoActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Log.d(TAG, "2-ON CREATE");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "2-ON START");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "2-ON RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "2-ON PAUSE");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "2-ON RESTART");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "2-ON STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "2-ON DESTROY");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "2-onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "2-onSaveInstanceState");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
