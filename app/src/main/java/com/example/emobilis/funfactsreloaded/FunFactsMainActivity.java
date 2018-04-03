package com.example.emobilis.funfactsreloaded;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsMainActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private TextView mfactTextView;
    private Button mshowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts_main);

        mfactTextView = findViewById(R.id.factTextView);
        mshowFactButton = findViewById(R.id.showFactButton);
        mRelativeLayout = findViewById(R.id.relativeLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();

                mfactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mshowFactButton.setTextColor(color);
            }
        };
        mshowFactButton.setOnClickListener(listener);
    }
}
