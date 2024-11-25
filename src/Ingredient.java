public class Ingredient {
    double amount;
    String unit;
    String name;

    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public Ingredient(){

    }

    @Override
    public String toString(){
        return amount + " " + unit + " " + name;

    }



}
