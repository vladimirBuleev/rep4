public class Milk {
    int price = 5;
    String name = "milk";
    Coffee coffee = new Coffee();
    Tea tea = new Tea();
    public void coffeeWithMilk(){
        System.out.print("you choice- "+coffee.getName()+" with "+name+". Price - ");
        System.out.println(price+ coffee.getPrice());

    }public void teaWithMilk(){
        price+=tea.getPrice();
        System.out.print("you choice- "+tea.getName()+" with "+ name+". Price - ");
        System.out.println(price+ tea.getPrice());
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
