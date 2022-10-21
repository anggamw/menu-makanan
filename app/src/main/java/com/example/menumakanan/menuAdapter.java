package com.example.menumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class menuAdapter extends RecyclerView.Adapter<menuAdapter.Viewholder> {

    private ArrayList<menu> listmenu;
    private Context context;
    String nama,harga;

    public menuAdapter(Context context, ArrayList<menu> listmenu) {
        this.listmenu = listmenu;
        this.context = context;

    }



    @NonNull
    @Override
    public menuAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        Viewholder holder = new Viewholder(inflater.inflate(R.layout.data,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull menuAdapter.Viewholder holder, int position) {
        menu menu= listmenu.get(position);
        holder.txtNama.setText(menu.getNama());
        holder.txtHarga.setText(menu.getHarga());
        holder.imgFoto.setImageResource(menu.getId_gambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,Detail.class);

                context.startActivity(i);
            }
        });




    }

    @Override
    public int getItemCount() {
        return listmenu.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{

        public TextView txtNama, txtHarga;
        public ImageView imgFoto;
        public ConstraintLayout layout;


        public Viewholder(@NonNull View itemView) {
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txtnama);
            txtHarga = (TextView) itemView.findViewById(R.id.txtharga);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgfood);
            layout = (ConstraintLayout) itemView.findViewById(R.id.layoutFood);

        }

    }
}
