package com.nakulbhoria.inventoryapp.data;

public final class ProductContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private ProductContract() {
    }

    public static final class ProductEntry {

        /**
         * Name of database table for Data
         */
        public final static String TABLE_NAME = "Data";

        public final static String COLUMN_PRODUCT_NAME = "product_name";

        public final static String COLUMN_PRICE = "price";

        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";

        public final static String COLUMN_SUPPLIER_NAME = "supplier_name";

        public final static String COLUMN_SUPPLIER_PHONE_NUMBER = "supplier_phone_number";

    }

}

