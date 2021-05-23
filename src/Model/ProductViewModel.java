package Model;

public class ProductViewModel {
    private final String name;
    private final int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ProductViewModel(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
