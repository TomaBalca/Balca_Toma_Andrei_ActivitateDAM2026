package com.example.seminarul_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ButoiAdapter extends BaseAdapter {

    private List<Butoi> butoaie;
    private Context ctx;
    private int resursaLayout;

    public ButoiAdapter(List<Butoi> butoaie, Context ctx, int resursaLayout) {
        this.butoaie = butoaie;
        this.ctx = ctx;
        this.resursaLayout = resursaLayout;
    }

    @Override
    public int getCount() {
        return butoaie.size();
    }

    @Override
    public Object getItem(int i) {
        return butoaie.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View v = inflater.inflate(resursaLayout, viewGroup, false);

        TextView capacitateTV = v.findViewById(R.id.tvCapacitate);
        TextView etansTV = v.findViewById(R.id.tvEtans);

        Butoi butoi = (Butoi) getItem(i);

        capacitateTV.setText("Capacitate: " + butoi.getCapacitate());
        etansTV.setText(butoi.isEtans() ? "Etans: da" : "Etans: nu");

        return v;
    }
}