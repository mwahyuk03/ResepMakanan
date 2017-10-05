package com.example.user.resepmakanan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 05/10/2017.
 */

public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView txt_judul,txt_bahan,txt_cara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//As up
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.resep_detail);
        imageView=(ImageView) findViewById(R.id.image_detail);
        txt_judul=(TextView) findViewById(R.id.judul_detail);
        txt_bahan=(TextView) findViewById(R.id.deskrip_detail);
        //txt_cara=(TextView) findViewById(R.id.cara_detail);
        imageView.setImageResource(getIntent().getIntExtra("img_id",00));
        txt_judul.setText(getIntent().getStringExtra("judul_resep"));
        txt_bahan.setText(getIntent().getStringExtra("deskrip_resep"));
        //txt_cara.setText(getIntent().getStringExtra(""));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
