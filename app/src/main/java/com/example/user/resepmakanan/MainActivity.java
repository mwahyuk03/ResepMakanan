package com.example.user.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView r1;
    String s1[],s2[];
    int image[]={R.drawable.sate,R.drawable.rendang,R.drawable.sotobetawi,R.drawable.ayambetutu,R.drawable.lumpia,R.drawable.pempek};

    ResepAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        r1 = (RecyclerView) findViewById(R.id.recycler);

        s1=getResources().getStringArray(R.array.judul_resep);
        s2=getResources().getStringArray(R.array.deskrip_resep);

        ad= new ResepAdapter(this,s1,s2,image);

        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}
