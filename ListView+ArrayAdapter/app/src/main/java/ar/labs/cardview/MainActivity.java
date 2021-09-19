package ar.labs.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView l;
    String tutorials[] = { "Algorithms", "Data Structures", "Languages", "Interview Corner",
            "Android App Dev","Natural Language Programming" ,"Web Technologies","Blockchain Development"
            ,"Machine Learning","Data Science","Computer Vision","Operating System" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, tutorials);
        l.setAdapter(arr);
        TextView textView=(TextView)findViewById(R.id.textView);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                //textView.setText("The best football player is : " + selectedItem);
                Intent intent;
                switch (selectedItem) {
                    case "Algorithms":
                        intent = new Intent(MainActivity.this,Algorithm.class);
                        intent.putExtra("Text",selectedItem);
                        startActivity(intent);
                        break;
                    case "Data Structures":
                        intent = new Intent(MainActivity.this,DataStructure.class);
                        intent.putExtra("Text",selectedItem);
                        startActivity(intent);
                        break;
                    default:

                        break;

                }

            }
        });
    }
}
//https://www.techbeamers.com/how-to-switch-between-activities-in-android/