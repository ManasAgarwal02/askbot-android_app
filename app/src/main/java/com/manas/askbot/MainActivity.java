package com.manas.askbot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask = findViewById(R.id.btn_ask);
        final TextView message = findViewById(R.id.txt_msg);

       final String[] msgs = {"It is certain.",
                "It is decidedly so.",
                " Without a doubt.",
                "Yes - definitely.",
                "You may rely on it.",
                "As I see it, yes.",
               "Most likely.",
               "Outlook good.",
               "Yes.",
               "Signs point to yes.",
               "Reply hazy, try again.",
               " Ask again later.",
               "Better not tell you now.",
               " Cannot predict now.",
               "Concentrate and ask again.",
               "Don't count on it.",
               "My reply is no.",
               "My sources say no.",
               " Outlook not so good.",
               "Very doubtful."
        };

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random generateRandomNumber = new Random();
                int number = generateRandomNumber.nextInt(20);
                message.setText(msgs[number]);
            }
        });

    }
}
