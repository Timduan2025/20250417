package org.example;

import net.datafaker.Faker;
import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ECommenceProductManagement {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        String[] categories = {"3C", "家用", "服飾", "食品", "書籍"};
        initializeProduct(productList, categories);
        showLowStockProduct(productList, categories);
        showTargetProductList("食品", productList, categories);
        publishProduct(productList, categories);
        unpublishProduct(productList, categories);
    }

    private static void initializeProduct(List<Product> productList, String[] categories) {
        Faker faker = new Faker();
        System.out.println("====== 初始商品 ======");
        for (int i = 0; i < 30; i++) {
            String id = faker.idNumber().valid();
            String name = faker.commerce().productName();
            String category = categories[faker.random().nextInt(categories.length)];
            double price = Double.parseDouble(faker.commerce().price(100, 2000));
            int stock = faker.random().nextInt(0, 100);
            Product product = new Product(id, name, category, price, stock);
            productList.add(product);
            System.out.println(product);
        }
    }

    private static void showLowStockProduct(List<Product> productList, String[] categories) {
        System.out.println("====== 庫存不足商品 ======");
        List<Product> lowStockProduct = new ArrayList<>();
        for (Product product : productList) {
            if (product.getStockQuantity() < 10) {
                lowStockProduct.add(product);
            }
        }
        for (Product product : lowStockProduct) {
            System.out.println(product);
        }
    }

    private static void showTargetProductList(String target, List<Product> productList, String[] categories) {
        System.out.println("====== 目標商品 ======");
        String targetCategory = "食品";
        List<Product> targetProductList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategory().equals(targetCategory)) {
                targetProductList.add(product);
            }
        }
        for (Product product : targetProductList) {
            System.out.println(product);
        }
    }

    private static void publishProduct(List<Product> productList, String[] categories) {
        Faker faker = new Faker();
        System.out.println("====== 上架商品 ======");
        for (int i = 0; i < 3; i++) {
            String id = faker.idNumber().valid();
            String name = faker.commerce().productName();
            String category = categories[faker.random().nextInt(categories.length)];
            double price = Double.parseDouble(faker.commerce().price(100, 2000));
            int stock = faker.random().nextInt(0, 100);
            Product product = new Product(id, name, category, price, stock);
            productList.add(product);
            System.out.println("已上架: " + product);
        }
    }

    private static void unpublishProduct(List<Product> productList, String[] categories) {
        Faker faker = new Faker();
        System.out.println("====== 下架商品 ======");
        if (productList.size() > 0) {
            int randomIndex = faker.random().nextInt(productList.size());
            Product removeProduct = productList.remove(randomIndex);
            System.out.println("已下架: " + removeProduct);
        } else {
            System.out.println("目前已無任何商品可下架。");
        }
    }
}
