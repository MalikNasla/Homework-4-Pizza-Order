public class Driver {
    public static void main(String args[]){
        Pizza pizza1 = new PizzaBuilder().setSize("Small").setChain("Pizza Hut").addTopping("Pepperoni").addTopping("Sausage").addTopping("Mushrooms").createPizza();
        Pizza pizza2 = new PizzaBuilder().setSize("Medium").setChain("Pizza Hut").addTopping("Pepperoni").addTopping("Sausage").addTopping("Mushrooms").addTopping("Bacon").addTopping("Onions").addTopping("Peppers").createPizza();
        Pizza pizza3 = new PizzaBuilder().setSize("Large").setChain("Pizza Hut").addTopping("Pepperoni").addTopping("Sausage").addTopping("Mushrooms").addTopping("Bacon").addTopping("Onions").addTopping("Peppers").addTopping("Chicken").addTopping("Olives").addTopping("Spinach").createPizza();

        Pizza pizza4 = new PizzaBuilder().setSize("Large").setChain("Pizza Hut").addTopping("Ham").addTopping("Pesto").addTopping("Spinach").createPizza();
        Pizza pizza5 = new PizzaBuilder().setSize("Small").setChain("Pizza Hut").addTopping("Beef").addTopping("Tomato and Basil").createPizza();

        Pizza pizza6 = new PizzaBuilder().setSize("Medium").setChain("Little Caesars").addTopping("Peppers").addTopping("Chicken").addTopping("Olives").addTopping("Spinach").addTopping("Tomato and Basil").addTopping("Beef").addTopping("Pesto").addTopping("Spicy Pork").createPizza();
        Pizza pizza7 = new PizzaBuilder().setSize("Small").setChain("Little Caesars").addTopping("Extra Cheese").addTopping("Onions").addTopping("Bacon").addTopping("Mushrooms").addTopping("Sausage").addTopping("Olives").createPizza();

        Pizza pizza8 = new PizzaBuilder().setSize("Small").setChain("Dominos").addTopping("Ham").createPizza();
        Pizza pizza9 = new PizzaBuilder().setSize("Large").setChain("Dominos").addTopping("Beef").addTopping("Tomato and Basil").addTopping("Olives").createPizza();

        pizza1.eat();
        pizza2.eat();
        pizza3.eat();
        pizza4.eat();
        pizza5.eat();
        pizza6.eat();
        pizza7.eat();
        pizza8.eat();
        pizza9.eat();
    }
}
