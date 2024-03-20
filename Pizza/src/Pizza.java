import java.util.ArrayList;

public class Pizza {
    private String size;
    private String chain;
    private ArrayList<String> toppings;

    public Pizza(String size, String chain, ArrayList<String> toppings){
        this.size = size;
        this.chain = chain;
        this.toppings = toppings;
    }

    public void eat(){
        System.out.print(size + " " + chain + " Pizza With ");

        for (int i = 0; i < toppings.size(); i++) {
            System.out.print(toppings.get(i) + " ");
        }
        System.out.println();
    }
}
