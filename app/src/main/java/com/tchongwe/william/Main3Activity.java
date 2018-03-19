package com.tchongwe.william;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
//william tchongwe
//15922

public class Main3Activity extends AppCompatActivity {

    public static ArrayList<String> myArray = new ArrayList<String>();
    public static String name;
    private TextView mTextViewResult;
    private RequestQueue mQueue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mTextViewResult = findViewById(R.id.text_view_result);
        Button button1 = findViewById(R.id.button1);
        Button buttonTwo = findViewById(R.id.buttonTwo);

        mQueue = Volley.newRequestQueue(this);

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, ListList.class);
                startActivity(intent);

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jsonParse();
            }
        });
    }
    private void jsonParse() {

        String url = "https://api.myjson.com/bins/zhlt9";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, (String) null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("stations");

                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject station = jsonArray.getJSONObject(i);

                            name = station.getString("name");
                            int number = station.getInt("number");
                            String address = station.getString("address");
                            double latitude = station.getDouble("latitude");
                                double longitude = station.getDouble("longitude");

                                mTextViewResult.append("Number: " + String.valueOf(number)+"\n " + "Name: " + name + "\n" + "Address: " + address +"\n "+ "Latitude: " +String.valueOf(latitude) + "\n " + "Longitude: " +String.valueOf(longitude) +"\n");


                                myArray.add("Number: " + String.valueOf(number)+ "\n " + "Name: " + name + "\n " + "Address: " +address + "\n "+ "Latitude: "+String.valueOf(latitude) + "\n " + "Longitude: "+String.valueOf(longitude) +"\n" );
                               // myArray.add(address);

                                System.out.println( name + number+ address);
                        }

                    } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        mQueue.add(request);
    }
}