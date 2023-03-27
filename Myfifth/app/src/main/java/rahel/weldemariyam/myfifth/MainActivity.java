package rahel.weldemariyam.myfifth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyDEARadapter myDEARadapter = new MyDEARadapter(this);
        recyclerView.setAdapter(myDEARadapter);

        myDEARadapter.setOnClickListner(new OnClickListner() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this,
                        "element number  "  +  position  + "  was clicked", Toast.LENGTH_SHORT).show();
            }

        });


}}