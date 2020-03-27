package com.example.common.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.common.EditActivity;
import com.example.common.HomeScreen;
import com.example.common.Model.Listdata;
import com.example.common.R;

import java.io.Serializable;
import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.MyHolder>
{

    List<Listdata> noteslist;
    private Context context;
    public  NotesAdapter(List<Listdata> noteslist,Context context)
    {
        this.context=context;
        this.noteslist=noteslist;
    }

    public NotesAdapter(List<Listdata> list, HomeScreen context) {
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);

        MyHolder myHolder=new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int position) {
        Listdata data=noteslist.get(position);
        myHolder.title.setText(data.getTitle());
        myHolder.desc.setText(data.getDesc());
//        myHolder.grade.setText(data.getGrade());
//        myHolder.subject.setText(data.getSubject());
    }

    @Override
    public int getItemCount() {
        return noteslist.size();
    }

    class  MyHolder extends RecyclerView.ViewHolder  {
        TextView title,desc,grade,subject;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            desc=itemView.findViewById(R.id.desc);
            grade=itemView.findViewById(R.id.grade);
            subject=itemView.findViewById(R.id.subject);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Listdata listdata=noteslist.get(getAdapterPosition());
                    Intent i=new Intent(context, EditActivity.class);
                    i.putExtra("id",listdata.id);
                    i.putExtra("title",listdata.title);
                    i.putExtra("desc",listdata.desc);
                    i.putExtra("grade",listdata.grade);
                    i.putExtra("subject",listdata.subject);
                    context.startActivity(i);
                    }
            });

        }


    }
}
