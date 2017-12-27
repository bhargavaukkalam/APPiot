package com.example.android.appiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DisplayStaffFan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_staff_fan);
    }

    public void onBackone(View view) {
        if (view.getId() == R.id.onBackone ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayButtonObjectsThree.class);
            startActivity(i);
        }
    }
}
