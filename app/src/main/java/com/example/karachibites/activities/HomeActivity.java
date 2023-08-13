package com.example.karachibites.activities;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.karachibites.adapters.CategoryAdapter;
import com.example.karachibites.adapters.ProductAdapter;
import com.example.karachibites.databinding.ActivityHomeBinding;
import com.example.karachibites.models.Category;
import com.example.karachibites.models.Product;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;
    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories;

    ProductAdapter productAdapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.show();
        }

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initCategories();
        initProducts();
        initCarasol();
    }

    private void initCarasol() {
        binding.carousel.addData(new CarouselItem("https://th.bing.com/th/id/R.fa3ba7343cc49e6ac4700cf1b82e3b7c?rik=2ZjDhqKFZHmHoA&pid=ImgRaw&r=0","Healthy Food"));
        binding.carousel.addData(new CarouselItem("https://images.summitmedia-digital.com/spotph/images/files/2013/11/1383815357-FastfoodWeMiss_642.jpg","Healthy Food"));
        binding.carousel.addData(new CarouselItem("https://th.bing.com/th/id/OIP.RkCl2QbBk6htAMvhwZswVgHaE8?pid=ImgDet&rs=1","Traditional Biryani"));
    }

    void initCategories() {
        categories = new ArrayList<>();

        categories.add(new Category("Sports and Games", "https://th.bing.com/th/id/OIP.DvOvIJ-XTfMgFKreCxzM7gAAAA?pid=ImgDet&rs=1", "#FFG25F", "hello", 1));
        categories.add(new Category("Sports and Games", "https://images.summitmedia-digital.com/spotph/images/files/2013/11/1383815357-FastfoodWeMiss_642.jpg", "#FFG25F", "hello", 1));
        categories.add(new Category("Sports and Games", "https://th.bing.com/th/id/OIP.nCiN1n2jZ_3YyP4sIsZdIAAAAA?pid=ImgDet&rs=1", "#FFG25F", "hello", 1));
        categories.add(new Category("Sports and Games", "https://th.bing.com/th/id/OIP.DvOvIJ-XTfMgFKreCxzM7gAAAA?pid=ImgDet&rs=1", "#FFG25F", "hello", 1));
        categories.add(new Category("Sports and Games", "https://th.bing.com/th/id/OIP.DvOvIJ-XTfMgFKreCxzM7gAAAA?pid=ImgDet&rs=1", "#FFG25F", "hello", 1));
        categories.add(new Category("Sports and Games", "https://th.bing.com/th/id/OIP.DvOvIJ-XTfMgFKreCxzM7gAAAA?pid=ImgDet&rs=1", "#FFG25F", "hello", 1));
        categories.add(new Category("Sports and Games", "https://th.bing.com/th/id/OIP.DvOvIJ-XTfMgFKreCxzM7gAAAA?pid=ImgDet&rs=1", "#FFG25F", "hello", 1));
        categories.add(new Category("Sports and Games", "https://th.bing.com/th/id/OIP.DvOvIJ-XTfMgFKreCxzM7gAAAA?pid=ImgDet&rs=1", "#FFG25F", "hello", 1));

        categoryAdapter = new CategoryAdapter(this, categories);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 5);
        binding.categoryRecyclerview.setLayoutManager(layoutManager);
        binding.categoryRecyclerview.setAdapter(categoryAdapter);
    }

    void initProducts() {
        products = new ArrayList<>();

        products.add(new Product("Biryani","https://th.bing.com/th/id/OIP.RkCl2QbBk6htAMvhwZswVgHaE8?pid=ImgDet&rs=1","Avilable",2,10,20,1));
        products.add(new Product("Biryani","https://th.bing.com/th/id/OIP.RkCl2QbBk6htAMvhwZswVgHaE8?pid=ImgDet&rs=1","Avilable",2,10,20,1));
        products.add(new Product("Biryani","https://th.bing.com/th/id/OIP.RkCl2QbBk6htAMvhwZswVgHaE8?pid=ImgDet&rs=1","Avilable",2,10,20,1));
        products.add(new Product("Biryani","https://th.bing.com/th/id/OIP.RkCl2QbBk6htAMvhwZswVgHaE8?pid=ImgDet&rs=1","Avilable",2,10,20,1));
        products.add(new Product("Biryani","https://th.bing.com/th/id/OIP.RkCl2QbBk6htAMvhwZswVgHaE8?pid=ImgDet&rs=1","Avilable",2,10,20,1));
        products.add(new Product("Biryani","https://th.bing.com/th/id/OIP.RkCl2QbBk6htAMvhwZswVgHaE8?pid=ImgDet&rs=1","Avilable",2,10,20,1));
        products.add(new Product("Biryani","https://th.bing.com/th/id/OIP.RkCl2QbBk6htAMvhwZswVgHaE8?pid=ImgDet&rs=1","Avilable",2,10,20,1));


        productAdapter = new ProductAdapter(this, products);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        binding.productRecyclerview.setLayoutManager(layoutManager);
        binding.productRecyclerview.setAdapter(productAdapter);

    }

}