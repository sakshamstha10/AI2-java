package Week8;

public class ShoppingApp
{

    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart("Laptop", 95000, 1);

        cart.displayCart();

        cart.setQuantity(2);

        System.out.println("Updated Quantity: " + cart.getQuantity());

        System.out.println("New Total: " + cart.calculateTotal());
        
        System.out.println("Discounted Total (10% off): " + cart.calculateDiscountedTotal(10));

    }
}