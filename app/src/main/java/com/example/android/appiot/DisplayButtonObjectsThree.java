package com.example.android.appiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DisplayButtonObjectsThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_button_objects_three);
    }
    public void onFreyHallOneZeroOne(View view) {
        if (view.getId() == R.id.FreyHallOneZeroOne ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayStaffFan.class);
            startActivity(i);
        }
    }

    public void onFreyHallOneZeroOnelight(View view){
        if (view.getId() == R.id.FreyHallOneZeroOneLight ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayStaffLight.class);
            startActivity(i);
        }
    }



    public void onFreyHallTwoZeroOneAirConditioning(View view){
        if (view.getId() == R.id.FreyHallTwoZeroOneAirConditioning ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayStaffAC.class);
            startActivity(i);
        }
    }

    public void onFreyHallTwoZeroTwoHeater(View view){
        if (view.getId() == R.id.FreyHallTwoZeroTwoHeater ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayStaffHeater.class);
            startActivity(i);
        }
    }

    public void onFreyHallTwoZeroThreeLabDoor(View view){
        if (view.getId() == R.id.FreyHallTwoZeroThreeLabDoor ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayStaffLabDoor.class);
            startActivity(i);
        }
    }
    public void onBack(View view) {
        if (view.getId() == R.id.onBack ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayObjectsThree.class);
            startActivity(i);
        }
    }
}

