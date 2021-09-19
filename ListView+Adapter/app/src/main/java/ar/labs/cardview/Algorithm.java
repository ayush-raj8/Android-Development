package ar.labs.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Algorithm extends AppCompatActivity {
    TextView textreceived;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm);

        text = getIntent().getExtras().getString("Text");
        textreceived = (TextView)findViewById(R.id.textView3);
        textreceived.setText(text);
    }
}