public class EinkaufswagenTest {
    public static void main(String[] args) {

        // Beispiel bzw. Test aus der Aufgabe inkl. Erweiterung zur Überprüfung der Grenzfälle
        Einkaufswagen cart = new Einkaufswagen();
        // Einkaufswagen zu beginn leer
        cart.size();

        cart.addToCart("Birne");
        cart.addToCart("Salat");
        cart.addToCart("Paprika");
        cart.addToCart("Salz");
        cart.addToCart("Pfeffer");

        // Einkaufswagen voll → Öl wird nicht hinzugefügt
        cart.addToCart("Öl");
        cart.showContent();

        cart.removeFromCart("Pfeffer");

        // Öl kann hinzugefügt werden, weil Pfeffer entfernt wurde und Einkaufswagen somit nicht mehr voll ist
        cart.addToCart("Öl");

        cart.showContent();
        cart.size();

    }
}