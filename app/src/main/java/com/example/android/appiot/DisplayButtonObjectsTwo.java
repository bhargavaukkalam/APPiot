package com.example.android.appiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DisplayButtonObjectsTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_button_objects_two);
    }

    public void onFreyHallTwoZeroOnePrint(View view){
        if (view.getId() == R.id.FreyHallTwoZeroOnePrinter ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayStudentPrinter.class);
            startActivity(i);
        }
    }

    public void onFreyHallTwoZeroThreeProjector(View view){
        if (view.getId() == R.id.FreyHallTwoZeroThreeProjector ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayStudentProjector.class);
            startActivity(i);
        }
    }

    public void onFreyHallTwoZeroThreeLabDoor(View view){
        if (view.getId() == R.id.FreyHallTwoZeroThreeLabDoor ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayStudentLabDoor.class);
            startActivity(i);
        }
    }

    public void onBack(View view) {
        if (view.getId() == R.id.onBack ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayObjects.class);
            startActivity(i);
        }
    }


}
