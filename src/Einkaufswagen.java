import java.util.ArrayList;

public class Einkaufswagen {

    private ArrayList<String> cart = new ArrayList<>();

    public void addToCart(String item) {
        if (cart.size() < 5 ) {
            cart.add(item);
        }
        else {
            System.out.println(item + " kann nicht hinzugefügt werden, weil der Einkaufswagen bereits voll ist!");
        }
    }

    public void removeFromCart(String item) {
        cart.remove(item);
    }

    public void showContent() {
        System.out.println("Inhalt Einkaufswagen: " + cart);
    }

    public void size() {
        System.out.println(cart.size() + " Gegenstände im Einkaufswagen.");
    }
}
