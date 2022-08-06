import java.util.ArrayList;

public class IceCreamShop {
    private String name; // name of shop
    private ArrayList<String> variants; // store variants of icecream in the shop

    public IceCreamShop(String shopName) {
        this.name = shopName;
        this.variants = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<String> getVariants() {
        return variants;
    }
    public void addVariant(String newVariant) {
        if (!getVariants().contains(newVariant)) {
            variants.add(newVariant);
            System.out.println("This variant is now added");
        } else {
            System.out.println("It already exists");
        }
    }
    public void removeVariant(String oldVariant) {
        if (getVariants().contains(oldVariant)) {
            getVariants().remove(oldVariant);
            System.out.println("This variant is now removed");
        } else {
            System.out.println("This does not exist");
        }
    }
    public int amountOfVariants(){
        return getVariants().size();
    }
    public void printVariants(){
        System.out.println(name + " has " + amountOfVariants() + " different variants:");
        if (!getVariants().isEmpty()) {
            for (int i = 0; i < getVariants().size(); i++) {
                System.out.println(getVariants().get(i));
            }
        } else {
            System.out.println("No variants yet!");
        }
    }
}