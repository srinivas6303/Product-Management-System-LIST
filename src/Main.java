//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProductServices ps=new ProductServices();
        //Adding product into list
        ps.addProduct(new Product("Lenovo ThinkPad", "Laptop", "Office", 2024));
        ps.addProduct(new Product("iPhone 15", "Smartphone", "Home", 2023));
        ps.addProduct(new Product("Samsung QLED TV", "Television", "Living Room", 2025));
        ps.addProduct(new Product("Dell XPS 13", "Laptop", "Office", 2024));
        ps.addProduct(new Product("Sony WH-1000XM4", "Headphones", "Personal", 2001));
        ps.addProduct(new Product("Apple Watch Series 8", "Smartwatch", "Personal", 2022));
        ps.addProduct(new Product("LG UltraWide Monitor", "Monitor", "Office", 2023));
        ps.addProduct(new Product("Canon EOS R5", "Camera", "Studio", 2002));
        ps.addProduct(new Product("Bose SoundLink Revolve", "Speaker", "Living Room", 2024));
        ps.addProduct(new Product("HP LaserJet Pro", "Printer", "Office", 2023));
        ps.addProduct(new Product("Google Pixel 7", "Smartphone", "Home", 2025));
        ps.addProduct(new Product("Microsoft Surface Pro", "Tablet", "Office", 2030));
        ps.addProduct(new Product("Nikon Z9", "Camera", "Studio", 2029));
        ps.addProduct(new Product("Amazon Echo Dot", "Smart Speaker", "Home", 2026));
        ps.addProduct(new Product("Logitech MX Master 3", "Mouse", "Office", 2027));

        ps.getAllProducts();
        System.out.println("--------------------------------------");

        ps.getProductByName("google pixel 7");
        System.out.println("--------------------------------------");

        ps.getProductByPlace("home");
        System.out.println("--------------------------------------");

        ps.deleteProdutByName("Nikon Z9");
        ps.getProductByName("Nikon Z9");
        System.out.println("--------------------------------------");

        ps.outOfWarrenty(2024);
        System.out.println("--------------------------------------");

        ps.findBySubString("lap");
        System.out.println("--------------------------------------");

        ps.deleteAllProducts();
        ps.getAllProducts();

    }
}