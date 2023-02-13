package amnatariq.org.quranapplicationfinalproject;

//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
//
//    LayoutInflater inflater;
//
//    public Adapter(List<ModalClass> userList, Context context){
//        this.inflater = LayoutInflater.from(context);
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = inflater.inflate(R.layout.custom_layout,parent,false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 30;
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder{
//        public ViewHolder(@NonNull View itemView){
//            super(itemView);
//        }
//    }
//}


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private final RecyclerViewInterface rvi;

    private List<ModalClass> userList;

    public Adapter(List<ModalClass> userList, RecyclerViewInterface recyclerViewInterface){
        this.userList = userList;
        this.rvi = recyclerViewInterface;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,parent,false);
        return new ViewHolder(view,rvi);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        //int resource = userList.get(position).getImageview1();
        String name = userList.get(position).getSurahName();
        String type = userList.get(position).getSurahType();


        holder.setData(name,type);
        //holder.setData(resource,name,msg,status,line);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView textView1;
        private TextView textView3;



        public ViewHolder(@NonNull View itemView,RecyclerViewInterface recyclerViewInterface)
        {
            super(itemView);
            textView1 = itemView.findViewById((R.id.textview));
            textView3 = itemView.findViewById((R.id.textview3));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(recyclerViewInterface!=null)
                    {
//                        int pos = getAbsoluteAdapterPosition();
                        int pos=0;
                        if(pos!=RecyclerView.NO_POSITION)
                        {
                            recyclerViewInterface.onItemClick(pos);
                        }
                    }
                }
            });

        }

        public void setData(String name, String msg) {
            //imageView.setImageResource(resource);
            textView1.setText(name);
            textView3.setText(msg);
        }
    }
}
