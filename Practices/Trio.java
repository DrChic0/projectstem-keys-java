public class Trio {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    String getName() {
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }

    double getPrice() {
        double sandwichPrice = sandwich.getPrice();
        double saladPrice = salad.getPrice();
        double drinkPrice = drink.getPrice();

        if(sandwichPrice < saladPrice && sandwichPrice < drinkPrice) {
            return saladPrice + drinkPrice;
        } else if(saladPrice < sandwichPrice && saladPrice < drinkPrice) {
            return sandwichPrice + drinkPrice;
        } else {
            return sandwichPrice + saladPrice;
        }
    }
}