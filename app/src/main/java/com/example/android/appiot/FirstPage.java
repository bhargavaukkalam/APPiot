package com.example.android.appiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
    }

    public void studentLogin(View view){
        if(view.getId()==R.id.studentlogin){
            finish();
            Intent i = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(i);

        }

    }

    public void facultyLogin(View view){
        if(view.getId()==R.id.facultylogin){
            finish();
            Intent i = new Intent(getApplicationContext(), LoginActivitytwo.class);
            startActivity(i);

        }

    }

    public void staffLogin(View view){
        if(view.getId()==R.id.stafflogin){
            finish();
            Intent i = new Intent(getApplicationContext(), LoginActivityThree.class);
            startActivity(i);

        }

    }

}
