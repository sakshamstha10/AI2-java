package Week8;

public class ShoppingCart
{
    private String itemName;
    private double itemPrice;
    private int quantity;

    public ShoppingCart(String itemName, double itemPrice, int quantity)
    {
        this.itemName= itemName;
        this.itemPrice=itemPrice;
        this.quantity=quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity= quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double calculateTotal()
    {
        return itemPrice*quantity;
    }

    public double calculateDiscountedTotal(double discountPercent)
    {

        double total = calculateTotal();
        double discount = total * (discountPercent / 100);
        return total - discount;

    }

    public void displayCart() 
    {
        System.out.println("---- Shopping Cart Details ----");
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotal());
    }

}