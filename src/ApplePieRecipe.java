public class ApplePieRecipe {

    Ingredient roomboter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient basterdsuiker = new Ingredient(200, "gram", "witte basterdsuiker");
    Ingredient bakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient ei = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanillesuiker = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient appels = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient kristalsuiker = new Ingredient(75, "gram", "kristalsuiker");
    Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
    Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");

   public void printIngredients(){
       System.out.println(roomboter);
       System.out.println(basterdsuiker);
       System.out.println(bakmeel);
       System.out.println(ei);
       System.out.println(vanillesuiker);
       System.out.println(zout);
       System.out.println(appels);
       System.out.println(kristalsuiker);
       System.out.println(kaneel);
       System.out.println(paneermeel);
   }

    public void printSteps(){
       preheatOven();
       whiskEgg();
       makeDough();
       sliceApples();
       greaseSpringform();
       assemblePie();
       addApples();
       sliceDough();
       finishPie();
       bakePie();
    }

   public void preheatOven(){
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).");
    }

    public void whiskEgg(){
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere " +
                "deel is voor het bestrijken van de appeltaart.");
    }

    public void makeDough(){
        System.out.println("Meng de boter, basterdsuiker, zelfrijzend bakmeel, een helft van het ei, vanillesuiker " +
                "en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void sliceApples(){
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void greaseSpringform(){
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void assemblePie(){
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van " +
                "het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede " +
                "vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void addApples(){
        System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel " +
                "overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze " +
                "in de vorm.");
    }

    public void sliceDough(){
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void finishPie(){
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand " +
                "rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void bakePie(){
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden " +
                "Celsius (boven- en onderwarmte) gaar en goudbruin.");
    }
}
