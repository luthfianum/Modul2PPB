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

public class CatalogPhotoListAdapter extends RecyclerView.Adapter<CatalogPhotoListAdapter.CatalogPhotoViewHolder> {

    private final LayoutInflater mInflater;

    CatalogPhotoListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public CatalogPhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.catalog_item_photo, parent, false);
        return new CatalogPhotoViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull CatalogPhotoViewHolder holder, int position) {
        CatalogPhoto catalogPhoto = CatalogPhotoHelper.getCatalogPhotoAt(position);
        holder.ivCatalogPhoto.setImageResource(catalogPhoto.getRestId());
        holder.tvFilename.setText(catalogPhoto.getFilename());
    }

    @Override
    public int getItemCount() {
        return CatalogPhotoHelper.getCatalogPhotoList().size();
    }

    class CatalogPhotoViewHolder extends RecyclerView.ViewHolder {

        final Button btnCetak;
        final Button[] btnUkuranArray;
        final ImageView ivCatalogPhoto;
        final TextView tvFilename;
        private CatalogPhotoListAdapter mAdapter;

        private int[] resBtnUkuranArray = {
                R.id.btn_3R,
                R.id.btn_4R,
                R.id.btn_8R,
                R.id.btn_10R,
        };

        public CatalogPhotoViewHolder(@NonNull View itemView, CatalogPhotoListAdapter _mAdapter) {
            super(itemView);
            mAdapter = _mAdapter;

            btnCetak = this.itemView.findViewById(R.id.btn_cetak);
            ivCatalogPhoto = itemView.findViewById(R.id.iv_photo_item);
            tvFilename = itemView.findViewById(R.id.tv_filename);

            btnUkuranArray = new Button[resBtnUkuranArray.length];
            for (int i=0;i< resBtnUkuranArray.length;i++){
                btnUkuranArray[i] = this.itemView.findViewById(resBtnUkuranArray[i]);
            }
        }
    }
}
