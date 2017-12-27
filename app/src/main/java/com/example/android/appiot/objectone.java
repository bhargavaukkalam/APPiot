package com.example.android.appiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class objectone extends AppCompatActivity {
    Button onDisplayTClick;
    public static TextView data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objectone);


    }
   public void onDisplayTClick(View view){

      /*  String url="http://10.0.2.2:3000/rooms";
        ArrayList<ObjectsDisplay> objectList=new ArrayList<>();

        final JsonArrayRequest getObjects=new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                System.out.println(response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.v("API","ERR"+error.getLocalizedMessage());
            }
        });

        Volley.newRequestQueue(this).add(getObjects);
    }*/
       if(view.getId()==R.id.displayTicket) {
            onDisplayTClick = (Button) findViewById(R.id.displayTicket);
           // Intent i = new Intent(getApplicationContext(), objectone.class);
            //startActivity(i);
            data = (TextView) findViewById(R.id.fetcheddata);

        onDisplayTClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fetchData process = new fetchData();
                    process.execute();
                   // System.out.println(process);
                }
            });
        }
}}
