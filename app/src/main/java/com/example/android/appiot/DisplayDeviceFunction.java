package com.example.android.appiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DisplayDeviceFunction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_device_function);

    }


    public void onBack(View view) {
        if (view.getId() == R.id.onBack ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayButtonObjects.class);
            startActivity(i);
        }
    }

}
