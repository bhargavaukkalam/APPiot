package com.example.android.appiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DisplayDeviceFunctionThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_device_function_three);
    }

    public void onUploadClick(View view) {
        if (view.getId() == R.id.button4) {

            Toast a = Toast.makeText(DisplayDeviceFunctionThree.this, "Uploading files...", Toast.LENGTH_SHORT);
            a.show();
        }
    }

    public void onBack(View view) {
        if (view.getId() == R.id.onBack ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayButtonObjects.class);
            startActivity(i);
        }
    }

}
