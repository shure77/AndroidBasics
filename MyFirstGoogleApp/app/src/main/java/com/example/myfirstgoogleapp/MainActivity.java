package com.example.myfirstgoogleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //create a method which is started when clicking on the send button
    public void sendMessage(View view) {
        /**Intent is used to launch an activity. An Intent is the glue between two activities.
        The intent takes the parameters this (stands for the activity as a subclass of context) and
         the class of the activity that should be started).
         **/
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //get the text of the activity_main
        EditText editText = (EditText) findViewById(R.id.editText);
        //transform the textinput to a string
        String message = editText.getText().toString().toUpperCase();

        intent.putExtra(EXTRA_MESSAGE, message);
        //starting an instance of DisplayMessageActivity
        startActivity(intent);
    }
}
