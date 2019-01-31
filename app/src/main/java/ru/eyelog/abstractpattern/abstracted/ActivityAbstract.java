package ru.eyelog.abstractpattern.abstracted;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import ru.eyelog.abstractpattern.R;

public class ActivityAbstract extends AppCompatActivity {

    TextView textView;
    Spinner spinner;
    EditText editText;
    Button button;

    // Более легкие и стройные классы
    RoundDown roundDown;
    RoundFlex roundFlex;
    RoundUp roundUp;

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
            if(!editText.getText().toString().equals("")
                    &&Integer.parseInt(editText.getText().toString())>9){
                switch (position){
                    case 0:
                        roundDown = new RoundDown();
                        roundDown.setValues(editText.getText().toString());
                        outLine = roundDown.roundIt();

                        break;
                    case 1:
                        roundFlex = new RoundFlex();
                        roundFlex.setValues(editText.getText().toString());
                        outLine = roundFlex.roundIt();

                        break;
                    case 2:
                        roundUp = new RoundUp();
                        roundUp.setValues(editText.getText().toString());
                        outLine = roundUp.roundIt();

                        break;
                    default:
                        outLine = "Чёт не так =(";
                        break;
                }
                textView.setText(outLine);
            }else {
                editText.setError("Пусто! Либо мало.");
            }
        });
    }

    private void setPosition(int position){
        this.position = position;
    }
}
