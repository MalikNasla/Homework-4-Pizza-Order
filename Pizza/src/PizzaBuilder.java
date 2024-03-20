import java.util.ArrayList;

public class PizzaBuilder {
    private String size;
    private String chain;
    private ArrayList<String> toppings = new ArrayList<>();

    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }

    public PizzaBuilder setChain(String chain){
        this.chain = chain;
        return this;
    }

    public PizzaBuilder addTopping(String topping){
        toppings.add(topping);
        return this;
    }

    public Pizza createPizza(){
        return new Pizza(size, chain, toppings);
    }
}



