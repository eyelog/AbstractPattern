package ru.eyelog.abstractpattern.classic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import ru.eyelog.abstractpattern.R;

public class ActivityClassic extends AppCompatActivity {

    TextView textView;
    Spinner spinner;
    EditText editText;
    Button button;

    // Толстый, жирный, старый/добрый класс.
    RoundClass roundClass;

    private int position;
    private String outLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sand_box);

        textView = findViewById(R.id.tvOut);
        spinner = findViewById(R.id.spinner);
        editText = findViewById(R.id.etIn);
        button = findViewById(R.id.btCount);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                setPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                setPosition(0);
            }
        });

        button.setOnClickListener(v -> {
            if(!editText.getText().toString().equals("")){
                switch (position){
                    case 0:
                        roundClass = new RoundClass();
                        outLine = String.valueOf(
                                roundClass.roundDexDown(editText.getText().toString()));

                        break;
                    case 1:
                        roundClass = new RoundClass();
                        outLine = String.valueOf(
                                roundClass.roundDexFlex(editText.getText().toString()));

                        break;
                    case 2:
                        roundClass = new RoundClass();
                        outLine = String.valueOf(
                                roundClass.roundDexUp(editText.getText().toString()));

                        break;
                    default:
                        outLine = "Чёт не так =(";
                        break;
                }
                textView.setText(outLine);
            }else {
                editText.setError("Пусто!");
            }
        });
    }

    private void setPosition(int position){
        this.position = position;
    }
}
