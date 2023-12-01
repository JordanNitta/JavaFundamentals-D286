package WorkingWithVariablesAndArrays.PackagesAndClasses.ExcersiseTwo.main;

// Add the necessary imports to the Main class for the Product, Inventory, and Warehouse classes from the inventory package. They should go below the package statement:
import WorkingWithVariablesAndArrays.PackagesAndClasses.ExcersiseTwo.Inventory.Inventory;
import WorkingWithVariablesAndArrays.PackagesAndClasses.ExcersiseTwo.Inventory.Warehouse;
import WorkingWithVariablesAndArrays.PackagesAndClasses.ExcersiseTwo.Inventory.Product;

// 6. In the main method, create Product, Inventory, and Warehouse objects and set some values for their fields.
public class Main {
    public static void main(String[] args){

        Product product = new Product();
        product.productId = 1;
        product.name = "Oranges";
        product.price = 20.0;

        Warehouse warehouse = new Warehouse();
        warehouse.warehouseId = 1;
        warehouse.warehouseName = "Main Warehouse";
        warehouse.inventories = "Placeholder";

        Inventory inventory = new Inventory();
        inventory.product = product;
        inventory.quantity = 20;

        System.out.println("Product ID: " + inventory.product.productId + ", Name: " + inventory.product.name + ", Price: " + inventory.product.price);
        System.out.println("Inventory Quantity: " + inventory.quantity);
        System.out.println("Warehouse ID: " + warehouse.warehouseId + ", Name: " + warehouse.warehouseName);

    }
}
