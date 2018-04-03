package com.example.abdoelswefi.funfact;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.abdoelswefi.funfact.model.ColorWheel;
import com.example.abdoelswefi.funfact.model.FactBook;


public class FunFactsActivity extends AppCompatActivity {
    public final static String TAG = FunFactsActivity.class.getSimpleName();
    private static final String KEY_FACT = "KEY_FACT";
    private static final String KEY_COLOR = "KEY_COLOR";
    private TextView mFunTextView;
    private RelativeLayout mFactRelativeLayout;
    private Button showFactButton;
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private String mFact = mFactBook.getFactAtIndex(0);
    private int mColor = mColorWheel.getColorAtIndex(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        mFunTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        mFactRelativeLayout = findViewById(R.id.factsRelativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFact = mFactBook.getFact();
                mFunTextView.setText(mFact);

                mColor = mColorWheel.getColor();
                showFactButton.setTextColor(mColor);
                mFactRelativeLayout.setBackgroundColor(mColor);
            }
        };
        showFactButton.setOnClickListener(listener);
//        Toast.makeText(this, "YAY! Our Activity was created!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "we're logging from the fun facts activity !");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_FACT, mFact);
        outState.putInt(KEY_COLOR, mColor);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mFact = savedInstanceState.getString(KEY_FACT);
        mFunTextView.setText(mFact);
        mColor = savedInstanceState.getInt(KEY_COLOR);
        showFactButton.setTextColor(mColor);
        mFactRelativeLayout.setBackgroundColor(mColor);
    }
}
