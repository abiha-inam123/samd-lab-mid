package com.dataflair.ticgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText P1 = (EditText) findViewById(R.id.p1);
        final EditText P2 = (EditText) findViewById(R.id.p2);
       btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("player1", P1.getText().toString());
                intent.putExtra("player2", P2.getText().toString());
                startActivity(intent);
            }
        });
    }
}