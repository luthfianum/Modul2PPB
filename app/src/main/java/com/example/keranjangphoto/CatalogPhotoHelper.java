package com.example.keranjangphoto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CatalogPhotoHelper {

    private static int[] ridArray = {
            R.drawable.photo_1,
            R.drawable.photo_2,
            R.drawable.photo_3,
            R.drawable.photo_4,
            R.drawable.photo_5,
    };

    private static String[] filenameArray = {
            "2019_GBK",
            "2019_Kantas",
            "2019_Makrab",
            "2019_Me",
            "2019_Jogging",
    };

    private static List<CatalogPhoto> CatalogPhotoList;

    public static void init() {
        CatalogPhotoList = new ArrayList<>();

        int nArray = ridArray.length;
        for (int i=0;i<nArray;i++){
            CatalogPhotoList.add(new CatalogPhoto(ridArray[i], filenameArray[i]));
        }
    }

    public static List<CatalogPhoto> getCatalogPhotoList() {
        return CatalogPhotoList;
    }

    public static CatalogPhoto getCatalogPhotoAt(int i){
        return CatalogPhotoList.get(i);
    }
}
