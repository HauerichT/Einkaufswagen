public class EinkaufswagenTest {
    public static void main(String[] args) {

        Einkaufswagen cart = new Einkaufswagen();
        cart.size();

        cart.addToCart("Birne");
        cart.addToCart("Salat");
        cart.addToCart("Paprika");
        cart.addToCart("Salz");
        cart.addToCart("Pfeffer");
        cart.addToCart("Öl");

        cart.showContent();

        cart.removeFromCart("Pfeffer");
        cart.addToCart("Öl");

        cart.showContent();

        cart.size();

    }
}