package com.auiz1.sheryarali.projectxmls;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myrvadapter extends RecyclerView.Adapter<myrvadapter.MyViewHolder>{
    List<blogs> ls;
    Context c;

    public myrvadapter(List<blogs> ls, Context c) {
        this.ls = ls;
        this.c = c;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(c).inflate(R.layout.row, parent , false);
        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        System.out.println("Arha hai");
        holder.title.setText(ls.get(position).getTitle());
        holder.msg.setText(ls.get(position).getMsg());

        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=holder.title.getText().toString();
                Intent intent=new Intent(c,CreateBlog.class);
                intent.putExtra("Name" ,a);
                c.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title , msg;
        public MyViewHolder(View itemview) {
            super(itemview);
            this.title = itemView.findViewById(R.id.title);
            this.msg = itemView.findViewById(R.id.msg);
        }
    }
}
