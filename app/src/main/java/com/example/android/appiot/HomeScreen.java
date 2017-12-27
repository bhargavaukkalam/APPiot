package com.example.android.appiot;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.android.appiot.model.ObjectsDisplay;

import org.json.JSONArray;

import java.util.ArrayList;

/**
 * Created by bhargava on 01/11/17.
 */

public class HomeScreen extends Activity {
    Button onDisplayTicketClick;
    public static TextView data;

    private int count = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }




    public void onDiscoverClick(View view) {
        if (view.getId() == R.id.discover) {
            count++;
            Toast a = Toast.makeText(HomeScreen.this, "Discovering object's...", Toast.LENGTH_SHORT);
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
            Intent i = new Intent(getApplicationContext(), DisplayObjects.class);
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

    //{
     //   finish();
      // onDisplayTicketClick = (Button) findViewById(R.id.displayTickets);
    //   Intent i = new Intent(getApplicationContext(), objectone.class);
    //    startActivity(i);
       // data = (TextView) findViewById(R.id.fetcheddata);

        //onDisplayTicketClick.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  fetchData process = new fetchData();
                //process.execute();
            //}
        //});
   // }

}}
