import java.util.ArrayList;
import java.util.List;

public class ProductServices {

    List<Product> products=new ArrayList<>();

    //1.ADD PRODUCT
    public void addProduct(Product product){
        products.add(product);
    }


    //2.ALL PRODUCTS
    public void getAllProducts() {
        System.out.println("ALL PRODUCTS");
        for(Product p: products){
            System.out.println(p);
        }
    }

    //3.GET PRODUCT BY NAME
    public void getProductByName(String name) {
        String newName=name.toLowerCase();
        System.out.println("GET PRODUCT BY NAME");
        for(Product p : products){
            String val=p.getName().toLowerCase();
            if(val.equals(newName)){
                System.out.println(p);
               return;
            }
        }
        System.out.println(name+" Produt not in the list");
    }

   //4.GET PRODUCT BY PLACE
    public void getProductByPlace(String place) {
        String lowerplace=place.toLowerCase();
        System.out.println("GET PRODUCTS BY PLACE");
        List<Product> filterList =new ArrayList<>();
        for(Product p: products){
            String val=p.getPlace().toLowerCase();
            if(val.equals(lowerplace)){
                filterList.add(p);
            }
        }
        if(filterList.isEmpty()) {
            System.out.println("Not product found on this place! "+ place);
        }
        else {

            for (Product p : filterList) {
                System.out.println(p);
            }
        }

    }

    //5.DELETE PRODUCT BY NAME
    public void deleteProdutByName(String name){
        System.out.println("DELETE PRODUCT BY NAME");
        String newname=name.toLowerCase();
        for(Product p: products){
            String val=p.getName().toLowerCase();
            if(val.equals(newname)){
                products.remove(p);
                System.out.println(name + " Product deleted Sucessfully!");
               return;
            }
        }
        System.out.println("Product not found with this name: " + name);
    }

    //6.DELETE ALL PRODUCT FROM LIST
    public void deleteAllProducts(){
        System.out.println("All PRODUCTS DELETED FROM LIST");
        products.clear();
    }

    //7.OUT OF WARRENTY
    public void outOfWarrenty(int year) {
        System.out.println("OUT OF WARRENTY");
        List<Product> list=new ArrayList<>();
        for(Product p : products){
            if(p.getWarrenty() < year){
                list.add(p);
            }
        }
        if(list.isEmpty()){
            System.out.println("No out of warrenty products!");
        }
        else{
            for(Product p: list){
                System.out.println(p);
            }
        }
    }

    //8.FIND BY SUBSTRING
    public void findBySubString(String text) {
        System.out.println("FIND BY SUBSTRING");
        String lowertext=text.toLowerCase();
        List<Product> list=new ArrayList<>();
        for(Product  p : products){
            String name=p.getName().toLowerCase();
            String type=p.getType().toLowerCase();
            String place=p.getPlace().toLowerCase();
            String warrenty=String.valueOf(p.getWarrenty()).toLowerCase();

            if(name.contains(lowertext) || place.contains(lowertext) || type.contains(lowertext) || warrenty.contains(lowertext)){
                list.add(p);
            }
        }
        if(list.isEmpty()){
            System.out.println("Products does't have this subString: "+text);
        }
        else{
            for(Product p : list){
                System.out.println(p);
            }
        }

    }


}
