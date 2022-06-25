package com.example.keranjangphoto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderPhotoHelper {
    private static List<OrderPhoto> orderPhotoList;
    private static HashMap<String,Double> hargaMap;

    public void initHargaMap(){
        hargaMap = new HashMap<>();
        hargaMap.put("3R", 3000.0);
        hargaMap.put("4R", 6000.0);
        hargaMap.put("8R", 10000.0);
        hargaMap.put("10R", 15000.0);
    }

    public void init(){
        orderPhotoList = new ArrayList<>();
        initHargaMap();
    }

    public static int getOrderCount(){
        return orderPhotoList.size();
    }

    public static OrderPhoto getOrderPhotoAt(int position){
        return orderPhotoList.get(position);
    }
}
