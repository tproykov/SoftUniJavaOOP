package JO06SOLID._2OpenClosedPrinciple._3_ShoppingCart;

public abstract class Order {
    protected final Cart cart;

    protected Order(Cart cart) {
        this.cart = cart;
    }
    void chekout(){
        //log the order in the p03_Database
    }
}
