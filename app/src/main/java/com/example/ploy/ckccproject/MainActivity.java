package com.example.ploy.ckccproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private  RecyclerView.Adapter adapter;
    private List<Listitem>listitems;

    public Button btnMore;
    public void MoreDetail(){
        btnMore=(Button)findViewById(R.id.id_btnmore);
        btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moredetail=new Intent(MainActivity.this,detail_info.class);
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView=(RecyclerView)findViewById(R.id.re_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listitems=new ArrayList<>();
        for (int i=0;i<=10; i++){
            Listitem listitem=new Listitem("Emergecy" + (i+1),"detail information ");

            listitems.add(listitem);
            MoreDetail();
        }
        adapter =new Myadapter(listitems,this);

        recyclerView.setAdapter(adapter);
    }
}
