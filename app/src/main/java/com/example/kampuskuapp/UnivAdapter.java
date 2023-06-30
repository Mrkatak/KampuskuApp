package com.example.kampuskuapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UnivAdapter extends RecyclerView.Adapter<UnivAdapter.UnivViewHolder> {
    private final LayoutInflater mInflater;
    private List<univModel> univModelList;
    private LayoutInflater layoutInflater;
    private Context context;
    private UnivAdapter.OnItemClickListener listener;

    public UnivAdapter(List<univModel> univModelList, Context context, OnItemClickListener onItemClickListener) {
        this.mInflater = layoutInflater.from(context);
        this.univModelList = univModelList;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public UnivAdapter.UnivViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_univ, null);
        return new UnivAdapter.UnivViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UnivAdapter.UnivViewHolder holder, int position) {
        holder.bindData(univModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return univModelList.size();
    }

    public void setItem(List<univModel> Item) {univModelList = Item;}

    public interface OnItemClickListener {
        void onItemClick(univModel item);
    }


    public class UnivViewHolder extends RecyclerView.ViewHolder{

        TextView tv_namaUniv,jml_Fakultas, jml_Prodi, nama_favorit;


        public UnivViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_namaUniv = itemView.findViewById(R.id.tv_namaUniv);
            jml_Fakultas = itemView.findViewById(R.id.jml_Fakultas);
            jml_Prodi = itemView.findViewById(R.id.jml_Prodi);
            nama_favorit = itemView.findViewById(R.id.nama_favorit);
        }


        public void bindData(final univModel item) {
            tv_namaUniv.setText(item.getNamaUniv());
            jml_Fakultas.setText(item.getJmlFakultas());
            jml_Prodi.setText(item.getJmlProdi());
            nama_favorit.setText(item.getFavoritProdi());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });

        }
    }
}
