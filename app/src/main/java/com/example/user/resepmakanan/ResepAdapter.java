package com.example.user.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 05/10/2017.
 */

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ResepViewHolder> {
    String data1[],data2[];
    int img[];
    Context ctx;

    public ResepAdapter(Context ctx, String[] data1, String[] data2, int[] img) {
        this.data1 = data1;
        this.data2 = data2;
        this.img = img;
        this.ctx = ctx;
    }



    @Override
    public ResepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myInflator = LayoutInflater.from(ctx);
        View view = myInflator.inflate(R.layout.item_recycler,parent,false);
        return new ResepViewHolder(view,ctx,data1,data2,img);
    }

    @Override
    public void onBindViewHolder(ResepViewHolder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.imageku.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class ResepViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView t1,t2;
        ImageView imageku;
        String data1[],data2[];
        int img[];
        Context ctx;

        public ResepViewHolder(View itemView,Context ctx, String[] s1, String[] s2, int[] img) {
            super(itemView);
            data1=s1;
            data2=s2;
            this.ctx=ctx;
           this.img=img;

            itemView.setOnClickListener(this);
            t1=(TextView)itemView.findViewById(R.id.judul_txt);
            t2=(TextView)itemView.findViewById(R.id.deskrip_txt);
            imageku=(ImageView)itemView.findViewById(R.id.myImage);
        }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
            Intent it=new Intent(this.ctx,DetailActivity.class);
            it.putExtra("img_id",img[position]);
            it.putExtra("judul_resep",data1[position]);
            it.putExtra("deskrip_resep",data2[position]);
            this.ctx.startActivity(it);
        }
    }
}
