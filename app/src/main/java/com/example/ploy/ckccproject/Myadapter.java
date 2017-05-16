package com.example.ploy.ckccproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ploy on 5/13/17.
 */

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {

    private List<Listitem>listitems;
    private Context context;

    public Myadapter(List<Listitem> listitems, Context context) {
        this.listitems = listitems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
      Listitem listitem=listitems.get(position);
      holder.textViewTitle.setText(listitem.getTitle());
      holder.textViewDetail.setText(listitem.getDetail());
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewTitle;
        public TextView textViewDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewTitle=(TextView)itemView.findViewById(R.id.txt_Title);
            textViewDetail=(TextView)itemView.findViewById(R.id.txt_detail);


        }
    }
}
