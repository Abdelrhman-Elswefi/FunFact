package com.example.abdoelswefi.funfact;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends AppCompatActivity {
    public final static String TAG = FunFactsActivity.class.getSimpleName();
    private TextView mFunTextView;
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        mFunTextView = findViewById(R.id.factTextView);
        final Button showFactButton = findViewById(R.id.showFactButton);
        final RelativeLayout mFactRelativeLayout = findViewById(R.id.factsRelativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFunTextView.setText(mFactBook.getFact());
                showFactButton.setTextColor(mColorWheel.getColor());
                mFactRelativeLayout.setBackgroundColor(mColorWheel.getColor());
            }
        };
        showFactButton.setOnClickListener(listener);
//        Toast.makeText(this, "YAY! Our Activity was created!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "we're logging from the fun facts activity !");
    }
}
