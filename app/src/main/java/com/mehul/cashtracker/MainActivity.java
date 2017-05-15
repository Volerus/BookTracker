package com.mehul.cashtracker;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private List<books> bookList = new ArrayList<>();
    private RecyclerView recyclerView;
    private booksAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prepareBookData();

        recyclerView = (RecyclerView) findViewById(R.id.rvbooks);

        mAdapter = new booksAdapter(this,bookList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


    }


    private void prepareBookData(){
        books book= new books("A","B","C",3,"http://books.google.com/books/content?id=YvQ_AhkJpBUC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api");
        bookList.add(book);
        bookList.add(book);
        bookList.add(book);
        bookList.add(book);
        bookList.add(book);


    }

}
