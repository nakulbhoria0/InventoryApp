/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nakulbhoria.inventoryapp.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Pets app.
 */
public final class ProductContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private ProductContract() {}


    public static final class ProductEntry {

        /** Name of database table for Data */
        public final static String TABLE_NAME = "Data";


        public final static String COLUMN_PRODUCT_NAME ="product name";


        public final static String COLUMN_PRICE = "price";


        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";


        public final static String COLUMN_SUPPLIER_NAME = "supplier name";

        public final static String COLUMN_SUPPLIER_PHONE_NUMBER = "supplier phone number";


        public static final int QUANTITY_UNKNOWN = 0;
        public static final int QUANTITY_AVAILABLE = 1;
        public static final int QUANTITY_UNAVAILABLE = 2;
    }

}

