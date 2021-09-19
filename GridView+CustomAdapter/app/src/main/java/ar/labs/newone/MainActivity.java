package ar.labs.newone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String names[]={"DSA","OS","OOP","DBMS","CN","ML","Web Dev","Android dev","BlockChain","Help"};
    int [] images={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridView);

    CustomAdapter customAdapter =new CustomAdapter(names,images,this);
    gridView.setAdapter(customAdapter);



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedName = names[i];
                //int selectedImage=images[i];

                long viewId = view.getId();
                Intent intent;

                    switch (selectedName)
                    {
                        case "DSA":
                            intent = new Intent(MainActivity.this,DSA.class);
                            startActivity(intent);
                            break;
                        case "OS":
                            intent = new Intent(MainActivity.this,OS.class);
                            startActivity(intent);
                            break;
                        case "DBMS":
                            Toast.makeText(MainActivity.this, "ListView clicked"+selectedName, Toast.LENGTH_SHORT).show();
                            break;
                        case "OOP":
                            Toast.makeText(MainActivity.this, "ListView clicked"+selectedName, Toast.LENGTH_SHORT).show();
                            break;
                        case "CN":
                            Toast.makeText(MainActivity.this, "ListView clicked"+selectedName, Toast.LENGTH_SHORT).show();
                            break;
                        case "ML":
                            Toast.makeText(MainActivity.this, "ListView clicked"+selectedName, Toast.LENGTH_SHORT).show();
                            break;
                        case "Web Dev":
                            Toast.makeText(MainActivity.this, "ListView clicked"+selectedName, Toast.LENGTH_SHORT).show();
                            break;
                        case "Android dev":
                            Toast.makeText(MainActivity.this, "ListView clicked"+selectedName, Toast.LENGTH_SHORT).show();
                            break;
                        case "BlockChain":
                            Toast.makeText(MainActivity.this, "ListView clicked"+selectedName, Toast.LENGTH_SHORT).show();
                            break;
                        case "Help":
                            Toast.makeText(MainActivity.this, "ListView clicked"+selectedName, Toast.LENGTH_SHORT).show();
                            break;
                        default:
                            Toast.makeText(MainActivity.this, "ListView clicked"+selectedName, Toast.LENGTH_SHORT).show();
                            break;
                    }

            }
        });

    }

    public class CustomAdapter extends BaseAdapter{
        private String[] imageNames;
        private int[] imagePhoto;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomAdapter(String[] imageNames,int[] imagePhoto,Context context){
            this.imageNames=imageNames;
            this.imagePhoto=imagePhoto;
            this.context=context;
            this.layoutInflater=(LayoutInflater)context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            return imagePhoto.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            if(view==null)
            {
                view=layoutInflater.inflate(R.layout.row_items,viewGroup,false);
            }
            TextView tvName= view.findViewById(R.id.textView) ;
            ImageView imageView=view.findViewById(R.id.imageView);

            tvName.setText(imageNames[i]);
            imageView.setImageResource(imagePhoto[i]);

            return view;
        }
    }
}