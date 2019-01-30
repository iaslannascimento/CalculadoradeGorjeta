package com.example.user.calculadoradegorjeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.widget.SeekBar.*;

public class MainActivity extends AppCompatActivity {

    //atributos
    private EditText valor;
    private TextView progresso;
    private SeekBar seekGorjeta;
    private TextView gorjeta;
    private TextView total;

    public double porcentagem = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //contando atributos
        valor = findViewById(R.id.valor);
        progresso = findViewById(R.id.progresso);
        seekGorjeta = findViewById(R.id.seekGorjeta);
        gorjeta = findViewById(R.id.gorjeta);
        total = findViewById(R.id.total);

        //controlando a seekbar
        seekGorjeta.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

               int progress = SeekBar.getProgress();
                progresso.setText(porcentagem + "%");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
