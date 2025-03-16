package JO06SOLID._2OpenClosedPrinciple._3_ShoppingCart;

public class OnlineOrder extends Order {

    protected OnlineOrder(Cart cart) {
        super(cart);
    }
}
