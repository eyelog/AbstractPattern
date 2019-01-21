package ru.eyelog.abstractpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import ru.eyelog.abstractpattern.abstracted.ActivityAbstract;
import ru.eyelog.abstractpattern.classic.ActivityClassic;
import ru.eyelog.abstractpattern.interfaced.ActivityInterface;

// Округляем заданное число.
// Тремя способами:
// 1. Классическим способом;
// 2. С помощью абстрактного класса;
// 3. С помощью интерфейсов.

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

        // Название кнопок как бы намекают ;)
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
