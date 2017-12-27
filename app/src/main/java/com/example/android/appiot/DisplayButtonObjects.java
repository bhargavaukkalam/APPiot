package com.example.android.appiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DisplayButtonObjects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_button_objects);
    }
    public void onFreyHallOneZeroOne(View view) {
        if (view.getId() == R.id.FreyHallOneZeroOne ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayDeviceFunction.class);
            startActivity(i);
        }
    }

    public void onFreyHallOneZeroOnelight(View view){
        if (view.getId() == R.id.FreyHallOneZeroOneLight ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayDeviceFunctionTwo.class);
            startActivity(i);
        }
    }

    public void onFreyHallTwoZeroOnePrint(View view){
        if (view.getId() == R.id.FreyHallTwoZeroOnePrinter ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayDeviceFunctionThree.class);
            startActivity(i);
        }
    }

    public void onFreyHallTwoZeroOneAirConditioning(View view){
        if (view.getId() == R.id.FreyHallTwoZeroOneAirConditioning ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayDeviceFunctionFour.class);
            startActivity(i);
        }
    }

    public void onFreyHallTwoZeroThreeProjector(View view){
        if (view.getId() == R.id.FreyHallTwoZeroThreeProjector ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayDeviceFunctionProjector.class);
            startActivity(i);
        }
    }

    public void onFreyHallTwoZeroThreeLabDoor(View view){
        if (view.getId() == R.id.FreyHallTwoZeroThreeLabDoor ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayDeviceFunctionLabDoor.class);
            startActivity(i);
        }
    }
    public void onBack(View view) {
        if (view.getId() == R.id.onBack ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayObjectstwo.class);
            startActivity(i);
        }
    }

}
