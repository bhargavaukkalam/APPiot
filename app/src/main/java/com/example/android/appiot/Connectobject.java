package com.example.android.appiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import static android.widget.Toast.*;

public class Connectobject extends AppCompatActivity {
    ArrayList<String> selectedItems;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connectobject);
        selectedItems=new ArrayList<String>();
    }


    public void onStart(){
      super.onStart();

       ListView chl=(ListView) findViewById(R.id.checkable_list);

        chl.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        String[] items={"Frey Hall 101 - Fan",
                "Frey Hall 101 - Light",
                "Frey Hall 201 - printer",
                "Frey Hall 201 - xerox machine"};
        //supply data items to ListView
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,R.layout.rowlayout,R.id.txt_title,items);
        chl.setAdapter(aa);
        //set OnItemClickListener

        chl.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // selected item
               // String selectedItem = ((TextView) view).getText().toString();
              //  Toast.makeText(getApplicationContext(), "Device turned ON", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(view.getContext(),objectone.class);
                startActivity(i);
              //  if(selectedItems.contains(selectedItem))
                //    selectedItems.remove(selectedItem); //remove deselected item from the list of selected items
                  //  Toast b = Toast.makeText(Connectobject.this, "Requesting access...", Toast.LENGTH_SHORT);
               // else if
                 //   selectedItems.add(selectedItem); //add selected item to the list of selected items

            }

        });





    }



   /* public void showSelectedItems(View view){
        String selItems="";
        for(String item:selectedItems){
            if(selItems=="")
                selItems=item;
            else
                selItems+="/"+item;
        }
        Toast.makeText(this, selItems, Toast.LENGTH_LONG).show();
    }*/

    public void showSelectedItems(View view){
        //for(String item:selectedItems){

        int count =1;
        if(count==1) {
            Intent i = new Intent(getApplicationContext(), objectone.class);
            startActivity(i);
        }
       // }
    }

}


