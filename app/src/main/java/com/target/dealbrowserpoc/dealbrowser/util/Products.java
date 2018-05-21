package com.target.dealbrowserpoc.dealbrowser.util;

import com.target.dealbrowserpoc.dealbrowser.R;
import com.target.dealbrowserpoc.dealbrowser.models.Product;

import java.math.BigDecimal;
import java.util.HashMap;

public class Products {

    public Product[] PRODUCTS = {item1,item2,item3,item4,item5,item6,item7,item8,item9,item10};


    public HashMap<String, Product> PRODUCT_MAP = new HashMap<>();

    public Products() {
        for(Product product : PRODUCTS){
            PRODUCT_MAP.put(String.valueOf(product.getId()), product);
        }

    }

    public static final Product item1 = new Product(0, 16776690, "I‘m With Cupid Graphic Tee", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis eget metus id arcu auctor consectetur. Donec vestibulum, justo ut bibendum blandit, tellus nisi laoreet dolor, eget tempor sapien est eu enim. Pellentesque finibus risus ut lacus tristique pulvinar.", new BigDecimal(12.99), new BigDecimal(9.99), R.drawable.image_16776690,"a1");
    public static final Product item2 = new Product(1, 16625608, "Lace Trim Tiered Cami Black - Xhilaration®", "Phasellus condimentum metus id lectus tempor faucibus. Curabitur bibendum est et sem pretium tempus. Sed posuere risus at faucibus eleifend.", new BigDecimal(17.99), new BigDecimal(10.99), R.drawable.image_16625608, "b2");
    public static final Product item3 = new Product(2, 16607030, "Pokémon Lightning Strike Throw - 46\" x 60\"", "Suspendisse potenti. Nulla sed massa vel velit ultricies tempus ac nec felis. Nulla urna urna, malesuada a ligula vel, molestie fringilla diam.", new BigDecimal(14.99), new BigDecimal(3.99), R.drawable.image_16607030, "c3");
    public static final Product item4 = new Product(3, 16250391, "Dickies® Men's Quilted Shirt Jacket - Black S", "Ut tincidunt justo sed malesuada ultrices. Cras posuere velit at sapien venenatis porta non vitae nibh. In dapibus cursus magna, sed commodo elit sollicitudin quis.", new BigDecimal(39.99), new BigDecimal(27.98), R.drawable.image_16250391, "d4");
    public static final Product item5 = new Product(4, 15629893, "Mustache Ice Cube Tray", "Curabitur est tortor, varius in est dapibus, pharetra iaculis leo. Sed auctor ut lorem sed tristique. Vestibulum ac pretium ligula. Fusce vel felis id turpis sodales iaculis sit amet at massa.", new BigDecimal(7.99), new BigDecimal(4.78), R.drawable.image_15629893, "e5");
    public static final Product item6 = new Product(5, 16185659, "Threshold™ Floral Stencil Decorative Pillow - Grey (Oblong)", "Morbi ut condimentum ante, vitae fermentum mi. Quisque vel dolor nulla. In id metus non eros venenatis rhoncus.", new BigDecimal(24.99), new BigDecimal(12.48), R.drawable.image_16185659, "f6");
    public static final Product item7 = new Product(6, 16710655, "Christmas Santa Cat Men's T-Shirt", "Quisque vehicula convallis metus, quis sollicitudin mauris ultricies nec. Quisque sollicitudin pellentesque massa vitae rutrum. Proin tincidunt magna eget dolor placerat, vitae placerat risus auctor.", new BigDecimal(14.99), new BigDecimal(7.98), R.drawable.image_16710655, "g7");
    public static final Product item8 = new Product(7, 15629906, "Men's Grooming Set", "Maecenas a mattis nunc. Phasellus commodo nibh at cursus elementum. Suspendisse eleifend est est, sit amet pulvinar dui efficitur eget. Mauris quis odio scelerisque ligula consectetur luctus id a nunc.", new BigDecimal(12.99), new BigDecimal(7.78), R.drawable.image_15629906, "h8");
    public static final Product item9 = new Product(8, 16710656, "Star Wars Darth Vader Men's Sweater", "Nam sit amet elit eget turpis gravida vestibulum. Nulla facilisi. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque consectetur, ex sollicitudin fermentum bibendum, risus turpis malesuada mi, sed vehicula neque leo a quam.", new BigDecimal(29.99), new BigDecimal(20.98), R.drawable.image_16710656, "i9");
    public static final Product item10 = new Product(9, 16200413, "Every Man Jack Cedarwood Grooming Kit", "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Quisque vel sem dapibus, pharetra tortor in, sodales leo. Aliquam erat volutpat. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.", new BigDecimal(14.99), new BigDecimal(12.74), R.drawable.image_16200413, "r2");



}
















