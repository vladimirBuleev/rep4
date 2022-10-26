public class Cinnamon extends Milk {
    int price = 2;
    String name = "cinnamon";
    Milk milk = new Milk();

    public void coffeeWithMilkAndCinnamon() {

        System.out.print("you choice " + coffee.getName() + " with " + milk.getName() +" and "+ name + ". Price-  ");
        System.out.println(coffee.getPrice()+ milk.getPrice()+price);
    }public void teaWithMilkAndCinnamon(){
        price+= milk.getPrice()+ tea.getPrice();
        System.out.print("you choice " + tea.getName() + " with " + milk.getName() +" and "+ name + ". Price-  ");
        System.out.println(tea.getPrice()+ milk.price+price);
    }

}
