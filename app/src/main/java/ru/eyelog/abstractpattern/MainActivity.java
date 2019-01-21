package ru.eyelog.abstractpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import ru.eyelog.abstractpattern.abstracted.ActivityAbstract;
import ru.eyelog.abstractpattern.classic.ActivityClassic;
import ru.eyelog.abstractpattern.interfaced.ActivityInterface;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    Button btClassic, btAbstract, btInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btClassic = findViewById(R.id.btClassic);
        btAbstract = findViewById(R.id.btAbstracted);
        btInterface = findViewById(R.id.btInterface);

        btClassic.setOnClickListener(v -> {
            intent = new Intent(this, ActivityClassic.class);
            startActivity(intent);
        });

        btAbstract.setOnClickListener(v -> {
            intent = new Intent(this, ActivityAbstract.class);
            startActivity(intent);
        });

        btInterface.setOnClickListener(v -> {
            intent = new Intent(this, ActivityInterface.class);
            startActivity(intent);
        });

    }
}
