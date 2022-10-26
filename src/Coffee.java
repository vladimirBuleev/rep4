public class Coffee implements IProduct {
    int price =10;
    String name = "coffee";
    @Override
    public void printProduct() {
        System.out.println("you choice- "+name+",price- "+price);
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
