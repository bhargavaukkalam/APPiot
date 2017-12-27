package com.example.android.appiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeScreenThree extends AppCompatActivity {

    Button onDisplayTicketClick;
    public static TextView data;

    private int count = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screentwo);
    }


    public void onDiscoverClick(View view) {
        if (view.getId() == R.id.discover) {
            count++;
            Toast a = Toast.makeText(HomeScreenThree.this, "Discovering object's...", Toast.LENGTH_SHORT);
            a.show();
        }
    }

    public void onRequestAccess(View view) {
        if (view.getId() == R.id.request) {
            //Toast b = Toast.makeText(HomeScreen.this, "Requesting access...", Toast.LENGTH_SHORT);
            //b.show();
            finish();
            Intent i = new Intent(getApplicationContext(), Connectobject.class);
            startActivity(i);
        }
    }

    public void onDisplayObjectClick(View view) {
        if (view.getId() == R.id.displayObject && count >= 1) {

            finish();
            Intent i = new Intent(getApplicationContext(), DisplayObjectsThree.class);
            startActivity(i);
        }
    }

    public void onDisplayTicketClick(View view) {

      /*  String url = "http://10.0.2.2:3000/rooms";
        ArrayList<ObjectsDisplay> objectList = new ArrayList<>();

        final JsonArrayRequest getObjects = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                System.out.println(response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.v("API", "ERR" + error.getLocalizedMessage());
            }
        });

        Volley.newRequestQueue(this).add(getObjects);
    }*/
        //if(view.getId()==R.id.displayTickets)

        //  {
        //  finish();
        // onDisplayTicketClick = (Button) findViewById(R.id.displayTickets);
        //Intent i = new Intent(getApplicationContext(), objectone.class);
        //    Intent i = new Intent(getApplicationContext(), DisplayDeviceFunction.class);
        //   startActivity(i);
        // data = (TextView) findViewById(R.id.fetcheddata);

        //onDisplayTicketClick.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //public void onClick(View v) {
        //  fetchData process = new fetchData();
        //process.execute();
        //}
        //     //});
        // }

    }}
