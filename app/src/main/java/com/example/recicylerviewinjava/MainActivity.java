package com.example.recicylerviewinjava;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView=findViewById(R.id.recyclerView);
        RecyclerItemDTO [] recyclerItemDTO=new RecyclerItemDTO[]{
                new RecyclerItemDTO("Java",R.drawable.channels4_profile),
                new RecyclerItemDTO("Android",R.drawable.channels4_profile),
                new RecyclerItemDTO("Kotlin",R.drawable.channels4_profile),
                new RecyclerItemDTO("Swift",R.drawable.channels4_profile),
                new RecyclerItemDTO("Swift",R.drawable.channels4_profile)
        };
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(recyclerItemDTO);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}