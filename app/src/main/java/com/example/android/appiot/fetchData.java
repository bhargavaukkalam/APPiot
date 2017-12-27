package com.example.android.appiot;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by bhargava on 03/12/17.
 */

public class fetchData extends AsyncTask<Void,Void,Void>{
    String data="";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url=new URL("http://172.24.28.38:3000/rooms");

            HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();
            InputStream inputStream=httpURLConnection.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
            String line="";
            while(line!=null){
                line=bufferedReader.readLine();
                data=data+line;
            }
            System.out.println(data);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        //objectone.data.setText(this.data);
       // System.out.println(DisplayObjects.data);
        DisplayObjects.data.setText(this.data);


    }
}
