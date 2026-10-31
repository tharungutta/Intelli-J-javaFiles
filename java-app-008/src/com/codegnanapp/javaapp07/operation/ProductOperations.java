package com.codegnanapp.javaapp07.operation;

import com.codegnanapp.javaapp07.entity.Product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;

import static java.lang.System.out;

public class ProductOperations {
    private HashSet<Product> productSet  ;

    public ProductOperations() {
        productSet = new HashSet<>();

        productSet.add(new Product(1, "Wireless Earbuds", "Electronics", "Audio", 49.99));
        productSet.add(new Product(2, "Bluetooth Speaker", "Electronics", "Audio", 79.99));
        productSet.add(new Product(3, "Over-Ear Headphones", "Electronics", "Audio", 129.99));
        productSet.add(new Product(4, "Soundbar", "Electronics", "Audio", 199.99));
        productSet.add(new Product(5, "Studio Microphone", "Electronics", "Audio", 89.99));
        productSet.add(new Product(6, "Wired Earphones", "Electronics", "Audio", 19.99));
        productSet.add(new Product(7, "USB-C Hub", "Electronics", "Accessories", 34.99));
        productSet.add(new Product(8, "Laptop Stand", "Electronics", "Accessories", 45.00));
        productSet.add(new Product(9, "Wireless Mouse", "Electronics", "Accessories", 29.99));
        productSet.add(new Product(10, "Mechanical Keyboard", "Electronics", "Accessories", 89.99));
        productSet.add(new Product(11, "Cotton T-Shirt", "Clothing", "Men's Wear", 19.99));
        productSet.add(new Product(12, "Slim Fit Jeans", "Clothing", "Men's Wear", 49.99));
        productSet.add(new Product(13, "Hooded Sweatshirt", "Clothing", "Men's Wear", 39.99));
        productSet.add(new Product(14, "Formal Blazer", "Clothing", "Men's Wear", 120.00));
        productSet.add(new Product(15, "Cargo Shorts", "Clothing", "Men's Wear", 29.99));
        productSet.add(new Product(16, "Polo Shirt", "Clothing", "Men's Wear", 25.00));
        productSet.add(new Product(17, "Floral Summer Dress", "Clothing", "Women's Wear", 55.00));
        productSet.add(new Product(18, "High-Waist Leggings", "Clothing", "Women's Wear", 35.00));
        productSet.add(new Product(19, "Knitted Cardigan", "Clothing", "Women's Wear", 45.00));
        productSet.add(new Product(20, "Denim Jacket", "Clothing", "Women's Wear", 65.00));
        productSet.add(new Product(21, "Non-Stick Frying Pan", "Home & Kitchen", "Cookware", 39.99));
        productSet.add(new Product(22, "Stainless Steel Pot", "Home & Kitchen", "Cookware", 49.99));
        productSet.add(new Product(23, "Cast Iron Skillet", "Home & Kitchen", "Cookware", 44.99));
        productSet.add(new Product(24, "Chef Knife", "Home & Kitchen", "Cookware", 59.99));
        productSet.add(new Product(25, "Cutting Board", "Home & Kitchen", "Cookware", 19.99));
        productSet.add(new Product(26, "Silicone Spatula Set", "Home & Kitchen", "Cookware", 14.99));
        productSet.add(new Product(27, "Scented Candle", "Home & Kitchen", "Decor", 18.50));
        productSet.add(new Product(28, "Wall Art Canvas", "Home & Kitchen", "Decor", 45.00));
        productSet.add(new Product(29, "Throw Pillow", "Home & Kitchen", "Decor", 22.00));
        productSet.add(new Product(30, "Ceramic Vase", "Home & Kitchen", "Decor", 32.00));
        productSet.add(new Product(31, "Yoga Mat", "Sports & Outdoors", "Fitness Equipment", 25.00));
        productSet.add(new Product(32, "Dumbbell Set", "Sports & Outdoors", "Fitness Equipment", 89.99));
        productSet.add(new Product(33, "Resistance Bands", "Sports & Outdoors", "Fitness Equipment", 15.99));
        productSet.add(new Product(34, "Jump Rope", "Sports & Outdoors", "Fitness Equipment", 12.00));
        productSet.add(new Product(35, "Exercise Ball", "Sports & Outdoors", "Fitness Equipment", 29.99));
        productSet.add(new Product(36, "Pull-up Bar", "Sports & Outdoors", "Fitness Equipment", 39.99));
        productSet.add(new Product(37, "Camping Tent", "Sports & Outdoors", "Outdoor Gear", 150.00));
        productSet.add(new Product(38, "Sleeping Bag", "Sports & Outdoors", "Outdoor Gear", 65.00));
        productSet.add(new Product(39, "Hiking Backpack", "Sports & Outdoors", "Outdoor Gear", 85.00));
        productSet.add(new Product(40, "Water Bottle", "Sports & Outdoors", "Outdoor Gear", 20.00));
        productSet.add(new Product(41, "Mystery Novel", "Books & Stationery", "Fiction", 14.99));
        productSet.add(new Product(42, "Sci-Fi Epic", "Books & Stationery", "Fiction", 18.99));
        productSet.add(new Product(43, "Fantasy Adventure", "Books & Stationery", "Fiction", 16.50));
        productSet.add(new Product(44, "Historical Romance", "Books & Stationery", "Fiction", 12.99));
        productSet.add(new Product(45, "Thriller Book", "Books & Stationery", "Fiction", 15.00));
        productSet.add(new Product(46, "Classic Literature", "Books & Stationery", "Fiction", 10.99));
        productSet.add(new Product(47, "Notebook", "Books & Stationery", "Office Supplies", 6.99));
        productSet.add(new Product(48, "Ballpoint Pens (Pack)", "Books & Stationery", "Office Supplies", 8.99));
        productSet.add(new Product(49, "Desk Organizer", "Books & Stationery", "Office Supplies", 19.99));
        productSet.add(new Product(50, "Sticky Notes", "Books & Stationery", "Office Supplies", 4.99));
    }


    public void displayProducts(){
        Stream<Product> productStream = productSet.stream();

        productStream.forEach((product) -> {
                                                     var productId = product.id();
                                                     var name = product.name();
                                                     var category = product.category();
                                                     var subCategory = product.subCategory();
                                                     var price = product.price();

                                                    out.println("Product ID:"+productId);
                                                    out.println("Name: "+name);
                                                    out.println("Category:"+category);
                                                    out.println("Sub Category:"+subCategory);
                                                    out.println("Price:"+price);
                                                    out.println();
        });

//        for(Product product : productSet){
//            var productId = product.id();
//            var name = product.name();
//            var category = product.category();
//            var subCategory = product.subCategory();
//            var price = product.price();
//
//            out.println("Product ID:"+productId);
//            out.println("Name: "+name);
//            out.println("Category:"+category);
//            out.println("Sub Category:"+subCategory);
//            out.println("Price:"+price);
//            out.println();
//        }
    }

    public void displayProductsFromCategory(String categoryName){

        productSet.stream()
                .filter(product -> product.category().equals(categoryName))
                .forEach(product -> {

                    var productId = product.id();
                    var name = product.name();
                    var category = product.category();
                    var subCategory = product.subCategory();
                    var price = product.price();

                    out.println("Product ID: " + productId);
                    out.println("Name: " + name);
                    out.println("Category: " + category);
                    out.println("Sub Category: " + subCategory);
                    out.println("Price: " + price);
                    out.println();
                });


//        Stream<Product> productStream = productSet.stream();
//        Stream<Product> filteredProductStreams = productStream.filter((product -> product.category().equals(categoryName)));
//
//        filteredProductStreams.forEach((product) -> {
//                                                              var productId = product.id();
//                                                              var name = product.name();
//                                                              var category = product.category();
//                                                              var subCategory = product.subCategory();
//                                                              var price = product.price();
//
//                                                              out.println("Product ID:"+productId);
//                                                              out.println("Name: "+name);
//                                                              out.println("Category:"+category);
//                                                              out.println("Sub Category:"+subCategory);
//                                                              out.println("Price:"+price);
//                                                              out.println();
//        });

//    for(Product product : productSet){
//            if( product.category().equals(categoryName)){
//                var productId = product.id();
//                var name = product.name();
//                var category = product.category();
//                var subCategory = product.subCategory();
//                var price = product.price();
//
//                out.println("Product ID:"+productId);
//                out.println("Name: "+name);
//                out.println("Category:"+category);
//                out.println("Sub Category:"+subCategory);
//                out.println("Price:"+price);
//                out.println();
//            }
//        }
    }

    public void displayProductsFromSubCategory(String categoryName, String subCategoryName){

        productSet.stream()
                .filter(product -> product.category().equals(categoryName))
                .filter(product -> product.subCategory().equals(subCategoryName))
                .forEach(product -> {

                    var productId = product.id();
                    var name = product.name();
                    var category = product.category();
                    var subCategory = product.subCategory();
                    var price = product.price();

                    out.println("Product ID: " + productId);
                    out.println("Name: " + name);
                    out.println("Category: " + category);
                    out.println("Sub Category: " + subCategory);
                    out.println("Price: " + price);
                    out.println();
                });
//        for(Product product : productSet){
//            if( product.category().equals(categoryName ) && product.subCategory().equals(subCategoryName )){
//                    var productId = product.id();
//                    var name = product.name();
//                    var category = product.category();
//                    var subCategory = product.subCategory();
//                    var price = product.price();
//
//                    out.println("Product ID:"+productId);
//                    out.println("Name: "+name);
//                    out.println("Category:"+category);
//                    out.println("Sub Category:"+subCategory);
//                    out.println("Price:"+price);
//                    out.println();
//            }
//        }

    }

    public double getTotalProductValues(){
        return totalProductValue;
    }
}
