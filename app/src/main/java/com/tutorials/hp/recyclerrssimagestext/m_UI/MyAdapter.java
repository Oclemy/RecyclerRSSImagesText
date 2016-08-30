package com.tutorials.hp.recyclerrssimagestext.m_UI;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.recyclerrssimagestext.R;
import com.tutorials.hp.recyclerrssimagestext.m_DataObject.Article;

import java.util.ArrayList;

/**
 * Created by Oclemy on 6/12/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context c;
    ArrayList<Article> articles;

    public MyAdapter(Context c, ArrayList<Article> articles) {
        this.c = c;
        this.articles = articles;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.model,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Article article=articles.get(position);

        String title=article.getTitle();
        String desc=article.getDescription();
        String date=article.getDate();
        String imageUrl=article.getImageUrl().replace("localhost","10.0.2.2");

        holder.titleTxt.setText(title);
        holder.desctxt.setText(desc.substring(0,130));
        holder.dateTxt.setText(date);
        PicassoClient.downloadImage(c,imageUrl,holder.img);


    }

    @Override
    public int getItemCount() {
        return articles.size();
    }
}










