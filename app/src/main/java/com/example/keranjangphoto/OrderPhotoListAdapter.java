package com.example.keranjangphoto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OrderPhotoListAdapter extends RecyclerView.Adapter<OrderPhotoListAdapter.OrderPhotoViewHolder> {

    private LayoutInflater mInflater;
    OrderPhotoListAdapter(Context context){
        mInflater = LayoutInflater.from(context)
    }

    @NonNull
    @Override
    public OrderPhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.catalog_item_photo, parent, false);
        return new OrderPhotoViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderPhotoViewHolder holder, int position) {
        OrderPhoto orderPhoto = OrderPhotoHelper.getOrderPhotoAt(position);
        CatalogPhoto catalogPhoto = CatalogPhoto;
//        holder.ivCatalogPhoto.setImageResource(catalogPhoto.getRestId());
//        holder.tvFilename.setText(catalogPhoto.getFilename());
    }

    @Override
    public int getItemCount() {
        return OrderPhotoHelper.getOrderCount();
    }

    class OrderPhotoViewHolder extends RecyclerView.ViewHolder{
        final TextView tvFilenameOrderPhoto, tvUkuran, tvNumOrder, tvSubtotal;
        final Button buttonDel, buttonInc, buttonDec;
        final ImageView ivOrderPhoto;

        OrderPhotoListAdapter mAdapter;

        public OrderPhotoViewHolder(@NonNull View itemView, OrderPhotoListAdapter _mAdapter){
            super(itemView);
            mAdapter = _mAdapter;
            tvFilenameOrderPhoto = itemView.findViewById(R.id.tv_photo_name);
            tvUkuran = itemView.findViewById(R.id.tv_photo_ukuran);
            tvNumOrder = itemView.findViewById(R.id.tv_num_order);
            tvSubtotal = itemView.findViewById(R.id.tv_subtotal);
            buttonDel = itemView.findViewById(R.id.btn_del);
            buttonInc = itemView.findViewById(R.id.btn_inc);
            buttonDec = itemView.findViewById(R.id.btn_dec);
            ivOrderPhoto = itemView.findViewById(R.id.iv_photo_order);
        }
    }
}
