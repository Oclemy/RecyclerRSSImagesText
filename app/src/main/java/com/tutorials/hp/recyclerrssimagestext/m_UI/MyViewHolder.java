package com.tutorials.hp.recyclerrssimagestext.m_UI;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.recyclerrssimagestext.R;

/**
 * Created by Oclemy on 6/12/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView titleTxt,desctxt,dateTxt;
    ImageView img;

    public MyViewHolder(View itemView) {
        super(itemView);

        titleTxt= (TextView) itemView.findViewById(R.id.titleTxt);
        desctxt= (TextView) itemView.findViewById(R.id.descTxt);
        dateTxt= (TextView) itemView.findViewById(R.id.dateTxt);
        img= (ImageView) itemView.findViewById(R.id.articleImage);
    }
}
