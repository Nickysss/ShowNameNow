package com.example.shownamenow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //  Step 1
    private Button myButton;
    private TextView showText;
    private EditText enterName;
    //  Step 1 End

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //      Step 2
        myButton = findViewById(R.id.button);
        showText = findViewById(R.id.textView);
        enterName = findViewById(R.id.editText);
        //      Step 2 End


        //      Step 3
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Step 4
                String name = enterName.getText().toString();
                // Step 4 End

                showText.setText("Hello " + /*Step 4*/ name /*Step 4 End*/);
        }
        });
        //      Step 3 End

    }
}
