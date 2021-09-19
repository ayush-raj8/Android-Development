package ar.labs.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataStructure extends AppCompatActivity {
    TextView textreceived;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structure);
        text = getIntent().getExtras().getString("Text");
        textreceived = (TextView)findViewById(R.id.textView2);
        textreceived.setText(text);
    }
}