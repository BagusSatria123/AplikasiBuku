package com.bagus.aplikasibuku.myadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bagus.aplikasibuku.R;

import com.bagus.aplikasibuku.mymodal.MyModal;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<MyModal> myModals;
    View view;

    public MyAdapter(Context context, ArrayList<MyModal> myModals) {
        this.context = context;
        this.myModals = myModals;
    }

    class MyAdapterKu extends RecyclerView.ViewHolder{

        private ImageView image;
        private TextView textView;

        public MyAdapterKu(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.adapter_image);
            textView = itemView.findViewById(R.id.adapter_text);
        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        view = LayoutInflater.from(context).inflate(R.layout.adapter_users,viewGroup,false);

        return new MyAdapterKu(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        ((MyAdapterKu)viewHolder).textView.setText(myModals.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return myModals.size();
    }
}
