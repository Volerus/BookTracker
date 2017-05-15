package com.mehul.cashtracker;

/**
 * Created by Mehul on 5/14/2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;
public class booksAdapter extends RecyclerView.Adapter<booksAdapter.MyViewHolder> {

        Context context;

        private List<books> booksList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView title, author_name, description;
            public RatingBar rating;
            public ImageView imageView;
            public MyViewHolder(View view) {
                super(view);
                title = (TextView) view.findViewById(R.id.book_title_tv);
                author_name=(TextView) view.findViewById((R.id.author_name_tv));
                description = (TextView) view.findViewById(R.id.book_description_tv);
                rating = (RatingBar) view.findViewById(R.id.ratings);
                imageView=(ImageView) view.findViewById(R.id.book_cover_iv);
            }
        }


        public booksAdapter(Context context,List<books> booksList) {
            this.context=context;
            this.booksList = booksList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item_book, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            books book = booksList.get(position);
            holder.title.setText(book.getTitle());
            holder.author_name.setText(book.getAuthor_name());
            holder.description.setText(book.getDescription());
            holder.rating.setNumStars(book.getRating());
            Picasso.with(context).load(book.getImageView()).into(holder.imageView);
        }

        @Override
        public int getItemCount() {
            return booksList.size();
        }

}
