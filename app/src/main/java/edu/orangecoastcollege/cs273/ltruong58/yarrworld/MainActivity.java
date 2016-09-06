package edu.orangecoastcollege.cs273.ltruong58.yarrworld;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //Create button
    private Button speakButton;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Restoring user settings from a previous session
        super.onCreate(savedInstanceState);

        //Inflating (!) opening the layout called activity_main
        setContentView(R.layout.activity_main);

        // Hook up the speakButton to the one in our view
        speakButton = (Button) findViewById(R.id.speakButton);

        // Wire up the speakButton to perform an onClick event
        speakButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
                // Use the static reference to "Toast" to display the message:
                // Toast = vanishes after set amount of time
                // Dialog = requires user input
                Toast.makeText(context, R.string.toast_text, Toast.LENGTH_LONG).show();
            }
        });

    }
}
