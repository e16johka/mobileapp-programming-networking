package com.example.networking;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

ArrayList<String> mountains = new ArrayList<String>(); // Create an ArrayList object

    public class Main {
    public static void main(String[] args) {
        ArrayList<String> mountains = new ArrayList<String>();
        mountains.add("Kebnekaise");
        mountains.add("Mount Everest");
        mountains.add("Danmarks hogsta kulle");
        mountains.add("Kilimanjaro");
        System.out.println(mountains);
    }
}

import androidx.appcompat.app.AppCompatActivity;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "HTTPS_URL_TO_JSON_DATA_CHANGE_THIS_URL";
    private final String JSON_FILE = "mountains.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonFile(this, this).execute(JSON_FILE);
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
    }

}
