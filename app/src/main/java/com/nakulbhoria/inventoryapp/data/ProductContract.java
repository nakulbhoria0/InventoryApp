package com.nakulbhoria.inventoryapp.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public final class ProductContract {

    private ProductContract() {
    }

    public static final String CONTENT_AUTHORITY = "com.nakulbhoria.inventoryapp";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_PRODUCT = "product";


    public static final class ProductEntry {


        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PRODUCT);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCT;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCT;




        /**
         * Name of database table for Data
         */

        public final static String _ID = BaseColumns._ID;

        public final static String TABLE_NAME = "product";

        public final static String COLUMN_PRODUCT_NAME = "product_name";

        public final static String COLUMN_PRICE = "price";

        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";

        public final static String COLUMN_SUPPLIER_NAME = "supplier_name";


        public static final int QUANTITY_UNKNOWN = 0;
        public static final int QUANTITY_AVAILABLE = 1;
        public static final int QUANTITY_UNAVAILABLE = 2;


        public static boolean isValidQuantity(int quantity) {
            return quantity == QUANTITY_UNKNOWN || quantity == QUANTITY_AVAILABLE || quantity == QUANTITY_UNAVAILABLE;
        }

    }

}

