package decorator;

public class Runner {
    public static void main(String[] args) {
//        add different kind but related object to a main object espresso,
//        which still results to return a type of Coffee when we pass espresso to the class, as decorator inherits coffee class
//        uses Composition not inheritance to create these Coffee objects with added functionality, dynamically during runtime
//        coffeeDecorator impersonates the original coffee class to add functionality to it

        Coffee espresso=new Espresso();
        printCoffee(espresso);

        System.out.println("----------adding milk------------");
        espresso=new WithMilk(espresso);
        printCoffee(espresso);

        System.out.println("---------------adding 2x sugar-------------");
        espresso=new WithSugar(espresso);
        espresso=new WithSugar(espresso);
        printCoffee(espresso);
    }

    public static void printCoffee(Coffee c){
        System.out.println("Cost: "+c.cost()+" Description: "+c.getDescription());
    }
}
