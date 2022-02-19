package com.example.hash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    TextView tvHs, tvTs;
    Button btnPut, btnWr,clean;
    EditText edText;
    HashSet<String> myHashSet = new
            HashSet<String>();
    TreeSet<String> myTreeSet = new TreeSet<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHs=findViewById(R.id.Hs);
        tvTs=findViewById(R.id.Ts);
        btnPut=findViewById(R.id.addButton);
        btnWr=findViewById(R.id.viewButton);
        edText=findViewById(R.id.addText);
        clean=findViewById(R.id.clearButton);
        btnPut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myHashSet.add(edText.getText().toString());
                myTreeSet.add(edText.getText().toString());
                edText.setText("");
            }
        });
        btnWr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //btnPut.setVisibility(View.INVISIBLE);
//скрываем кнопку, используемую для размещения значений в контейнер
                for (String bfr : myHashSet) {
                    tvHs.append (bfr+"\n");
                }
                for (String bfr : myTreeSet) {
                    tvTs.append(bfr+"\n");
                }
            }
        });
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myHashSet.clear();
                myTreeSet.clear();
                tvHs.setText("");
                tvTs.setText("");
            }
        });
    }
}