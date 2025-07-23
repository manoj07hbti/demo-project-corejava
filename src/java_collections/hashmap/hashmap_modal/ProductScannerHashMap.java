package java_collections.hashmap.hashmap_modal;

import model.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ProductScannerHashMap {

    public HashMap<String, ArrayList<Product>> createProductData() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<Product>> departmentWiseProducts = new HashMap<>();

        while (true) {
            System.out.print("Do you want to add a new department? (yes/no): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }

            System.out.print("Enter department name: ");
            String deptName = scanner.nextLine();

            System.out.print("Enter number of products in " + deptName + ": ");
            int count = Integer.parseInt(scanner.nextLine());

            ArrayList<Product> productList = new ArrayList<>();

            for (int i = 1; i <= count; i++) {
                System.out.println("Enter details for Product " + i + ":");

                System.out.print("Product Name: ");
                String productName = scanner.nextLine();

                System.out.print("Product ID: ");
                String productId = scanner.nextLine();

                System.out.print("Price: ");
                double price = Double.parseDouble(scanner.nextLine());

                Product product = new Product(productName, productId, price);
                productList.add(product);
            }

            departmentWiseProducts.put(deptName, productList);
        }

        return departmentWiseProducts;
    }

    public static void main(String[] args) {
        ProductScannerHashMap obj = new ProductScannerHashMap();
        HashMap<String, ArrayList<Product>> result = obj.createProductData();

        for (String dept : result.keySet()) {
            System.out.println("\nDepartment: " + dept);
            for (Product p : result.get(dept)) {
                System.out.println("Product: " + p.getName() + ", ID: " + p.getId() + ", Price: " + p.getPrice());
            }
        }
    }
}
