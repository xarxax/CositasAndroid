package com.example.usuario.alladapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.logging.StreamHandler;

/**
 * Created by usuario on 03/07/2016.
 */
public class MyRVAdapter extends RecyclerView.Adapter<MyRVAdapter.AdapterViewHolder> {
    ArrayList<String> hentemala;
    public void addhente(ArrayList<String> a){
        for(String s :a) hentemala.add(s);
    }

    @Override
    public MyRVAdapter.AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Instancia un layout XML en la correspondiente vista.
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        //Inflamos en la vista el layout para cada elemento
        View view = inflater.inflate(R.layout.row, parent, false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyRVAdapter.AdapterViewHolder holder, int position) {
        holder.icon.setImageDrawable(holder.v.getResources().getDrawable(R.drawable.a));
        holder.name.setText(hentemala.get(position));
    }

    MyRVAdapter(){
        hentemala = new ArrayList<>();
        hentemala.add(new String("Benito Camela"));
        hentemala.add(new String("Alberto Carlos Huevos"));
        hentemala.add(new String("Lola Mento"));
        hentemala.add(new String("Aitor Tilla"));
        hentemala.add(new String("Elvis Teck"));
        hentemala.add(new String("Débora Dora"));
        hentemala.add(new String("Borja Món de York"));
        hentemala.add(new String("Encarna Vales"));
        hentemala.add(new String("Enrique Cido"));
        hentemala.add(new String("Francisco Jones"));
        hentemala.add(new String("Estela Gartija"));
        hentemala.add(new String("Andrés Trozado"));
        hentemala.add(new String("Carmelo Cotón"));
        hentemala.add(new String("Alberto Mate"));
        hentemala.add(new String("Chema Pamundi"));
        hentemala.add(new String("Unai Nomás"));
        hentemala.add(new String("Ester Colero"));
    }




    @Override
    public int getItemCount() {
        return hentemala.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder{
        public View v;
        public ImageView icon;
        public TextView name;
        public AdapterViewHolder(View itemView) {
            super(itemView);
            this.v = itemView;
            this.icon = (ImageView) itemView.findViewById(R.id.icon);
            this.name = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
