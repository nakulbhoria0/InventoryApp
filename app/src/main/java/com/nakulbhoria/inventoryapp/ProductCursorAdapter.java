package com.nakulbhoria.inventoryapp;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.nakulbhoria.inventoryapp.data.ProductContract.ProductEntry;

public class ProductCursorAdapter extends CursorAdapter {
    public ProductCursorAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }


    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        TextView nameTextView = view.findViewById(R.id.name);
        TextView supplierNameTextView = view.findViewById(R.id.supplier_name);
        TextView quantityTextView = view.findViewById(R.id.quantity);
        quantityTextView.setText("");

        int nameColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_NAME);
        int supplierColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_SUPPLIER_NAME);

        String productName = cursor.getString(nameColumnIndex);
        String productSupplierName = cursor.getString(supplierColumnIndex);

        if (TextUtils.isEmpty(productSupplierName)) {
            productSupplierName = context.getString(R.string.unknown_supplier);
        }

        nameTextView.setText(productName);
        supplierNameTextView.setText(productSupplierName);

    }
}
