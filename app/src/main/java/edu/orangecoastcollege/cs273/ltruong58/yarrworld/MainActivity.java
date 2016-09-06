package edu.orangecoastcollege.cs273.ltruong58.yarrworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //Create button
    private Button speakButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speakButton = (Button) findViewById(R.id.speak_button);
        speakButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.speak_text, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
