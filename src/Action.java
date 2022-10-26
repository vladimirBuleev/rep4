public class Action {
    Cinnamon cin = new Cinnamon();
    Coffee coffee= new Coffee();
    Milk milk = new Milk();
    Tea tea = new Tea();
    UserInput answer = new UserInput();
    MenuOutput menu = new MenuOutput();
    public void action(){
        menu.MenuOutput();
        if(answer.getUserAnswerString().equalsIgnoreCase("coffee")){
            System.out.println("add milk?");
            if(answer.getUserAnswerBoolean()==true){
                System.out.println("add cinnamon?");
                if(answer.getUserAnswerBoolean()==true){
                    cin.coffeeWithMilkAndCinnamon();
                }else{
                    milk.coffeeWithMilk();
                }
            }else{
                coffee.printProduct();
            }
        }else if(answer.getUserAnswerString().equalsIgnoreCase("tea")){
            System.out.println("add milk?");
            if(answer.getUserAnswerBoolean()==true){
                System.out.println("add cinnamon?");
                if(answer.getUserAnswerBoolean()==true){
                    cin.teaWithMilkAndCinnamon();
                }else{
                    milk.teaWithMilk();
                }
            }else{
                tea.printProduct();
            }
        }else{
            System.out.println("wrong answer");
        }
    }
}
