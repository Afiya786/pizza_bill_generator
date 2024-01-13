
public class Pizza {
    private int price;

    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingPrice = 150;
    private int backPack = 20;
    private int BasePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isOptedForTakeAway = false;


    public Pizza(Boolean veg) { //constructor of class PIZZA
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }

        BasePizzaPrice = this.price;

    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;

        this.price += extraCheesePrice;

    }

    public void addExtraToppings() {
        isExtraToppingAdded = true;
        this.price += extraToppingPrice;

    }

    public void placedelivery() {
        isOptedForTakeAway = true;

        this.price += backPack;

    }

    public void getBill() {
        String bill = "";
        System.out.println("basepizza " + BasePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "extra cheese added " + extraCheesePrice + "\n";
        }
        if (isExtraToppingAdded) {
            bill += "extra toppings added " + extraToppingPrice + "\n";
        }

        if (isOptedForTakeAway) {
            bill += "opted for delivery at your place " + backPack + "\n";
        }
        bill += "YOUR BILL IS " + this.price + "\n";
        System.out.println(bill);

    }
}







