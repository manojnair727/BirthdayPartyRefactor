
package scrap.heap.refactor;


import java.util.ArrayList;
import java.util.List;

import org.refactor.lendup.model.Balloon;
import org.refactor.lendup.model.Cake;
import org.refactor.lendup.model.Cake.Size;
import org.refactor.lendup.model.Item;


/**
 * Helps the system to place order for the birthday party. Mainly the
 * 
 * @author Manoj
 */
public class App {
    private List<Item> orders = new ArrayList<>();

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        App app = new App();
        // Place birthday party orders
        Balloon balloon1 = Balloon.builder().color("red").material("mylar").addQuantity(4).build();
        Cake cake1 = Cake.builder().addFlavor("chocolate").addFrostingFlavor("chocolate").shape("circle").size(Size.large).addColor("brown").build();
        app.order(balloon1, cake1);
        Balloon balloon2 = Balloon.builder().color("blue").material("latex").addQuantity(7).build();
        Cake cake2 = Cake.builder().addFlavor("chocolate").addFrostingFlavor("Vanilla").shape("square").size(Size.medium).addColor("brown").build();
        app.order(balloon2, cake2);
        Balloon balloon3 = Balloon.builder().color("yellow").material("mylar").addQuantity(4).build();
        Cake cake3 = Cake.builder().addFlavor("Vanilla").addFrostingFlavor("Vanilla").shape("square").size(Size.small).addColor("yellow").build();
        app.order(balloon3, cake3);


    }

    /**
     * Method to order the balloon and cake for the party. To order cake and balloon has to be specified. They will be
     * added to the order through this interface.
     * 
     * @param balloon balloon
     * @param cake cake
     */
    public void order(Balloon balloon, Cake cake) {
        if (balloon != null) {
            orderItem(balloon, "Balloons");
        }
        if (cake != null) {
            orderItem(cake, "Cake");
        }
    }

    /**
     * Adds the item of given type to the list of orders.
     * 
     * @param item item to be added to the order
     * @param type type of item ordered
     */
    public void orderItem(Item item, String type) {
        // for the purposes of this exercise, pretend this method works and adds balloons to the order
        if (item != null) {
            System.out.println(String.format("%s ordered; %s", type, item));
            orders.add(item);
        }
    }

    /**
     * Gets the list of orders made in this system.
     * 
     * @return list of orders.
     */
    public List<Item> getOrders() {
        return orders;
    }
}
