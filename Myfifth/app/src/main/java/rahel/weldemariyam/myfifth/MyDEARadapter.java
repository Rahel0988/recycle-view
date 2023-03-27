package rahel.weldemariyam.myfifth;

import android.content.Context;
import android.os.Binder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyDEARadapter extends RecyclerView.Adapter<MyDEARadapter.ViewHolder> {
Context context;
LayoutInflater layoutInflater;
    OnClickListner onClickListner;
    public MyDEARadapter(Context context){

        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);


    }
   // public void

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = layoutInflater.inflate(R.layout.simple_item , parent , false);
        ViewHolder VH = new ViewHolder(view, onClickListner);

        return VH;
    }

    public  void setOnClickListner(OnClickListner listner ){
        onClickListner = listner;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView.setText("This is element number:" +position);
//  holder.textView.setOnClickListener(new View.OnClickListener() {
//      @Override
//      public void onClick(View view) {
//          Toast.makeText(context.getApplicationContext(),"Number "+holder.getAdapterPosition()  ,Toast.LENGTH_SHORT).show();
//      }
//  });
    }


    @Override
    public int getItemCount() {

        return 100000;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final OnClickListner onClickedListerner;
        View root;
        TextView textView;

        public ViewHolder(@NonNull View itemView, OnClickListner onClickListner) {

            super(itemView);
            root = itemView;
            textView = root.findViewById(R.id.textView3);
            this.onClickedListerner = onClickListner;

            root.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClickListner.onItemClick(view , getAdapterPosition());
                }
            });
        }


    }


}
