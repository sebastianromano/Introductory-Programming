public class Main {
    public static void main(String[] args) {
        IceCreamShop newShop = new IceCreamShop("Chocolicious");
        newShop.addVariant("something delisss...");
        newShop.addVariant("monkey pox...");
        newShop.addVariant("slice of heaven...");
        newShop.addVariant("slice of heaven...");
        newShop.amountOfVariants();
        newShop.getName();
        newShop.removeVariant("slice");
        newShop.removeVariant("slice of heaven...");
        newShop.printVariants();
    }
}