public class Product {
    private String name;
    private String type;
    private String place;
    private int Warrenty;

    public Product() {
    }

    public Product(String name, String type, String place, int warrenty) {
        this.name = name;
        this.type = type;
        this.place = place;
        Warrenty = warrenty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getWarrenty() {
        return Warrenty;
    }

    public void setWarrenty(int warrenty) {
        Warrenty = warrenty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", place='" + place + '\'' +
                ", Warrenty=" + Warrenty +
                '}';
    }
}
