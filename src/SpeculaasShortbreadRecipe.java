public class SpeculaasShortbreadRecipe {

    Ingredient roomboter = new Ingredient(250, "gram", "ongezouten roomboter");
    Ingredient poedersuiker = new Ingredient(100, "gram", "poedersuiker");
    Ingredient bloem = new Ingredient(300, "gram", "bloem");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient vanilleExtract = new Ingredient(1, "theelepel", "vanille-extract");
    Ingredient speculaaskruiden = new Ingredient(3, "theelepels", "speculaaskruiden");

    public void printIngredients(){
        System.out.println(roomboter);
        System.out.println(poedersuiker);
        System.out.println(bloem);
        System.out.println(zout);
        System.out.println(vanilleExtract);
        System.out.println(speculaaskruiden);
    }

    public void printSteps(){
        mixIngredients();
        splitDough();
        letDoughRest();
        rollDough();
        combineDough();
        sliceDough();
        bakeShortbread();
    }

    public void mixIngredients(){
        System.out.println("Mix de boter en poedersuiker romig. Voeg de bloem en het zout toe en kneed tot een stevig " +
                "koekjesdeeg.");
    }

    public void splitDough(){
        System.out.println("Deel het deeg in twee delen. Door het ene deel kneed je het vanille-extract. Door het " +
                "andere deel kneed je de speculaaskruiden.");
    }

    public void letDoughRest(){
        System.out.println("Maak een bal van beide delen, wikkel in vershoudfolie en leg een uur te rusten in de " +
                "koelkast voordat je verder gaat.");
    }

    public void rollDough(){
        System.out.println("Eenmaal afgekoeld bestuif je je werkblad met bloem en rol je beide ballen deeg uit tot " +
                "ongeveer 2 – 2,5 millimeter dikte. De plakken moeten ongeveer even groot en dik zijn.");
    }

    public void combineDough(){
        System.out.println("Je gaat de plakken deeg nu op elkaar leggen, als er een verschil in grootte is dan leg je " +
                "de kleinste plak op de grootste plak. Rol het voorzichtig op en leg opnieuw een uur te rusten in de koelkast.");
    }

    public void sliceDough(){
        System.out.println("Snijd de rol deeg na het rusten in plakken van 5 mm. Leg de koekjes op een met bakpapier " +
                "beklede bakplaat.");
    }

    public void bakeShortbread(){
        System.out.println("Bak de koekjes in 14 minuten op 175 °C (boven- en onderwarmte) gaar.");
    }

}
