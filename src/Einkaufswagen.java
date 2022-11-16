import java.util.ArrayList;

public class Einkaufswagen {

    // erzeugt neue ArrayList für den Einkaufswagen
    private ArrayList<String> cart = new ArrayList<>();

    // fügt Items zur cart hinzu, wenn weniger als 5 Items im Einkaufswagen sind
    public void addToCart(String item) {
        if (cart.size() < 5 ) {
            cart.add(item);
        }
        else {
            System.out.println(item + " kann nicht hinzugefügt werden, weil der Einkaufswagen bereits voll ist!");
        }
    }

    // entfernt das übergebene item aus dem Einkaufswagen
    public void removeFromCart(String item) {
        if (!cart.remove(item)) {
            System.out.println(item + " ist nicht im Einkaufswagen enthalten.");
        }
        cart.remove(item);
    }

    // gibt den Inhalt des Einkaufswagens aus
    public void showContent() {
        System.out.println("Inhalt Einkaufswagen: " + cart);
    }

    // gibt die größe des Einkaufwagens aus
    public void size() {
        System.out.println(cart.size() + " Gegenstände im Einkaufswagen.");
    }
}
