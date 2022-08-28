package clothes;

public class Item implements Clothes {

    private String type;
    private double price;

    public Item(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println("Item type: " + type + "price is - " + price);
    }
}
