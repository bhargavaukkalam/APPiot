package com.example.android.appiot;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.appiot.R.id.logout;

public class DisplayObjectsThree extends AppCompatActivity {

    @Nullable


    private TextView textView;
    Button onDisplayTClick;
    public static TextView data;
    // LoginActivity logact=new LoginActivity();

    //see if this is working else delete







    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //   getSupportActionBar().setDisplayShowHomeEnabled(true);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_objects_three);
        //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // data = (TextView) findViewById(R.id.fetcheddata);
        // System.out.println(data);

        textView = (TextView) findViewById(R.id.fetcheddata);




        String[] Objects ={

                "                                                    Status",
                "Frey Hall 101 - Fan                       OFF",
                "Frey Hall 101 - Light                      ON",
                "Frey Hall 201 - Air Conditioning  ON",
                "Frey Hall 202 - Heater                  OFF",
                "Frey Hall 203 - Lab Door               ON"


        };

        for (String data : Objects) {

            textView.append(data + "\n\n\n");
        }

    }
    public void onRequestAccess(View view) {
        if (view.getId() == R.id.request ) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayButtonObjectsThree.class);
            startActivity(i);
        }
    }

    public void onBack(View view) {
        if (view.getId() == R.id.onBack ) {

            finish();
            Intent i = new Intent(getApplicationContext(), HomeScreenThree.class);
            startActivity(i);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case logout:
                finish();
                Intent i = new Intent(DisplayObjectsThree.this, ProfileActivityThree.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    // public void onDisplayTClick(View view){


    //   if(view.getId()==R.id.displayTicket) {
    //     onDisplayTClick = (Button) findViewById(R.id.displayTicket);
    // Intent i = new Intent(getApplicationContext(), objectone.class);
    //startActivity(i);
    // data = (TextView) findViewById(R.id.fetcheddata);

    //  onDisplayTClick.setOnClickListener(new View.OnClickListener() {
    //  @Override
    //   public void onClick(View v) {
    //      fetchData process = new fetchData();
    //     process.execute();
    // System.out.println(process);
    //     }
    // });
    // }
    // }*/

}


