package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    /*String variable with the giphy bicycle gif link*/
    private static String GIF_URL = "https://media.giphy.com/media/3o6ozDDjxZRmvxzUt2/giphy.gif";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*find the textView & imageView that are displayed in the activity_main*/
        TextView valuesTv = findViewById(R.id.values_tv);
        ImageView bicycleIv = findViewById(R.id.gif);
        /*the bicycle gif image load from drawable resource folder code using Glide library*/
        Glide.with(this).asGif().load(R.drawable.giphy).into(bicycleIv);
//      /*the bicycle gif load from giphy link code using Glide library*/
//      Glide.with(this).asGif().load(GIF_URL).into(gifBicycle);
        // Create a Bicycle object
        Bicycle bike1 = new Bicycle();
        // Invoke changeCadence, speedUp, changeGear methods on bike1 object
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        /*Invoking the valuesToDisplay method on bike1 object then
        Storing The String into a string variable named values*/
        String values = bike1.valuesToDisplay();
        /*Setting the values string to the text view*/
        valuesTv.setText(values);
    }


}