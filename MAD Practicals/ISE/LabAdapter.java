package com.yash.a110t5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class LabAdapter extends BaseAdapter {
    private Context context;
    private List<Lab> labs;
    private OnLabImageClickListener listener;

    public interface OnLabImageClickListener {
        void onImageClick(Lab lab);
    }

    public LabAdapter(Context context, List<Lab> labs, OnLabImageClickListener listener) {
        this.context = context;
        this.labs = labs;
        this.listener = listener;
    }

    @Override
    public int getCount() {
        return labs.size();
    }

    @Override
    public Object getItem(int position) {
        return labs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.lab_item, parent, false);
        }

        final Lab lab = labs.get(position);
        ImageView labImage = convertView.findViewById(R.id.labImage);
        TextView labName = convertView.findViewById(R.id.labName);

        labImage.setImageResource(lab.getImageResId());
        labName.setText(lab.getName());

        labImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onImageClick(lab);
                }
            }
        });

        return convertView;
    }
}