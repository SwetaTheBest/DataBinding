package com.swetajain.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.swetajain.databinding.databinding.ActivityMainBinding;
import com.swetajain.databinding.models.Product;
import com.swetajain.databinding.utils.Products;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding ;
    private Product mProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Products products = new Products();
        mProduct = products.PRODUCTS[0];

        activityMainBinding.setProduct(mProduct);


    }
}
