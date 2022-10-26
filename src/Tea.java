public class Tea implements IProduct{
    int price=8;
    String name="tea";
    @Override
    public void printProduct() {
        System.out.println(name+price);
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
