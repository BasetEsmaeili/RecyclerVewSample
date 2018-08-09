package com.esmaili0gmail.baset.recyclervewsample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterRv extends RecyclerView.Adapter<AdapterRv.MyRvViewHolder> {
    private Context context;
    private ArrayList<String> userNames;
    private ArrayList<String> phoneNumbers;
    private InterfaceItemClick itemClick;
    public AdapterRv(Context context, ArrayList<String> userNames, ArrayList<String> phoneNumbers) {
        this.context = context;
        this.userNames = userNames;
        this.phoneNumbers = phoneNumbers;
    }

    @NonNull
    @Override
    public MyRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemview_recyclerview, parent, false);
        return new MyRvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRvViewHolder holder, int position) {
        holder.bindData();
    }

    @Override
    public int getItemCount() {
        return userNames.size();
    }

    public class MyRvViewHolder extends RecyclerView.ViewHolder {
        private TextView userName;
        private TextView phoneNumber;

        public MyRvViewHolder(View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.tv_usrName);
            phoneNumber = itemView.findViewById(R.id.tv_PhoneNumber);
        }

        public void bindData() {
            userName.setText(userNames.get(getAdapterPosition()));
            phoneNumber.setText(phoneNumbers.get(getAdapterPosition()));
        }
    }
}
