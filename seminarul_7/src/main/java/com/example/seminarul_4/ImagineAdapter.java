package com.example.seminarul_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ImagineAdapter extends BaseAdapter {

    private List<ImagineButoi> imagini;
    private Context ctx;
    private int resursaLayout;

    public ImagineAdapter(List<ImagineButoi> imagini, Context ctx, int resursaLayout) {
        this.imagini = imagini;
        this.ctx = ctx;
        this.resursaLayout = resursaLayout;
    }

    @Override
    public int getCount() {
        return imagini.size();
    }

    @Override
    public Object getItem(int i) {
        return imagini.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = LayoutInflater.from(ctx).inflate(resursaLayout, viewGroup, false);

        ImageView imagineIV = v.findViewById(R.id.ivImagine);
        TextView descriereTV = v.findViewById(R.id.tvDescriere);

        ImagineButoi imagine = (ImagineButoi) getItem(i);

        descriereTV.setText(imagine.getDescriere());
        Glide.with(ctx).load(imagine.getImagineUrl()).into(imagineIV);

        return v;
    }
}
