package com.example.phonecontacts;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends ArrayAdapter<MyContact>{
    private LayoutInflater inflater;
    private int layout;
    private List<MyContact> contacts;

    public MyAdapter(Context context, int resource, List<MyContact> contacts) {
        super(context, resource, contacts);
        this.contacts = contacts;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView photoView = (ImageView) view.findViewById(R.id.ContactPhoto);
        TextView nameView = (TextView) view.findViewById(R.id.ContactName);
        TextView numberView = (TextView) view.findViewById(R.id.ContactNumber);

        MyContact myContact = contacts.get(position);

        String u = myContact.getPhotoResource();
        if (u != null) {
            photoView.setImageURI(Uri.parse(u));

        } else {
            photoView.setImageResource(R.drawable.ic_android_green_50dp);
        }

        //photoView.setImageResource(myContact.getPhotoResource());
        nameView.setText(myContact.getName());
        numberView.setText(myContact.getNumber());

        return view;
    }
}
