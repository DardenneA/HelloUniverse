import java.util.*;

public class HelloUniverse {

    public static final String AMANDINE = "Amandine";
    public static final String AURÉLIE = "Aurélie";
    public static final String DAMIEN = "Damien";

    public static void main(String[] args) {
        //planeteTP();

        //1.tableau : liste ordonnée et numérotée d'éléments de meme type. Pour gérer un nombre fixe d'éléments
        int[] cupsOfCoffeePerDayOftheWeek; //je déclare
        cupsOfCoffeePerDayOftheWeek = new int[7]; //j'instancie par defaut chaque case contient 0;
        cupsOfCoffeePerDayOftheWeek[4] = 3;
        System.out.println(cupsOfCoffeePerDayOftheWeek[4]);

        cupsOfCoffeePerDayOftheWeek=new int[]{6,2,3,7,3,4,1}; //accéder + définir + remplacer une valeur existante

        String[][] myTheatreSeats= new String[30][12];
        myTheatreSeats[9][5]="James Logan";

        //2. Liste : liste ordonnée. à utiliser si le nombre d'éléments dans la lite n'est pas fixe. Si on veut ajouter des éléments en mileu de liste.
        List<Integer> myList = new ArrayList<Integer>(); //on peut accéder (get), ajouter (add), insérer (set), supprimer(remove)
        myList.add(7); // -> [7]
        myList.add(5); //-> [7, 5]
        System.out.println(myList);
        myList.add(1,12); //-> [7, 12, 5]
        System.out.println(myList);
        myList.set(0,4); // -> [4, 12, 5]
        System.out.println(myList);
        myList.remove(1); // removed 12 -> [4, 5]
        System.out.println(myList);
        System.out.println("taille = "+myList.size());

        List<VaisseauDeGuerre> listOfVaisseau = Arrays.asList(new VaisseauDeGuerre("CHASSEUR"), new VaisseauDeGuerre("FREGATE"), new VaisseauDeGuerre("CROISEUR"));

        //3. Set : collection d'élément UNIQUE non ordonnés
        Set<String> ingredients = new HashSet<>(); //on peut ajouter, supprimer, compter...> accéder ??? compliqué car pas ordonné
        ingredients.add("eggs");
        ingredients.add("sugar");
        ingredients.add("salt");
        ingredients.remove("salt");
        Set<String> ingredients2 = Set.of("eggs", "sugar", "floor", "butter","salt");
        System.out.println(ingredients2.size());

        //4. Dictionnaire ou map : liste d'éléments organisés en fonction d'une clé (key<>value)
        Map<String,Integer> friends = new HashMap<String,Integer>();
        friends.put(AMANDINE,31);
        friends.put(AURÉLIE,34);
        friends.put(DAMIEN,37);
        System.out.println("friends : "+friends);
        System.out.println("Damien : "+friends.get("Damien"));

        List<String> list = Arrays.asList("first","two","three");
        Collections.replaceAll(list,"two","four");
        System.out.println(list);


    }

    public static void planeteTP(){
        /*        int nbPlanetes=0;
        String phrase = "En %d, les planètes du système solaire étaient au nombre de : %d";
        short date = 2005;

        if (date > 1600 && date <= 2020){
            if (date < 1700){
                nbPlanetes = 7;
            }
            else if (date < 1800){
                nbPlanetes = 8;
            }
            else if (date < 2006){
                nbPlanetes = 9;
            }
            else{
                nbPlanetes = 8;
            }
        }
        else{
            phrase = "Le programme ne peut pas fournir de résultat pour l'année %d";
        }
        System.out.printf(phrase,date,nbPlanetes);


        int nbPlanetes=7;
        switch (nbPlanetes){
            case 7:
                System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                break;
            case 8:
                System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                break;
            case 9:
                System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                break;
            default:
                System.out.printf("Le programme ne peut pas fournir de résultat pour %d", nbPlanetes);
        }
        */

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre=4880;

        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre=12100;

        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12759;

        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;

        PlaneteGazeuse saturne = new PlaneteGazeuse("saturne");
        saturne.diametre = 120536;

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        /*
        //rotation vs revolution
        neptune.revolution();
        mars.rotation();
        neptune.revolution(-3542);
        mars.rotation(-684);
        venus.rotation(1250);

        //accoster des humains sur les planètes
        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("FREGATE");
        System.out.printf("Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d.\n",mars.nom, mars.totalVisiteurs);

        //atmosphere uranus
        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.pourcentageHydrogene=83f;
        atmosphereUranus.pourcentageHelium=15f;
        atmosphereUranus.pourcentageMethane=2.5f;
        uranus.atmosphere=atmosphereUranus;

        System.out.println("L'atmosphère de "+uranus.nom+" est composée :\n" +
                "        A "+ uranus.atmosphere.pourcentageHydrogene +"% d'hydrogène\n" +
                "\n" +
                "        A "+uranus.atmosphere.pourcentageArgon+"% d'argon\n" +
                "\n" +
                "        A "+uranus.atmosphere.pourcentageDioxydeCarbone+"% de dioxyde de carbone\n" +
                "\n" +
                "        A "+uranus.atmosphere.pourcentageAzote+"% d'azote\n" +
                "\n" +
                "        A "+uranus.atmosphere.pourcentageHelium+"% d'hélium\n" +
                "\n" +
                "        A "+uranus.atmosphere.pourcentageMethane+"% de méthane\n" +
                "\n" +
                "        A "+uranus.atmosphere.pourcentageSodium+"% de sodium");

        //
        Vaisseau fregate = new Vaisseau();
        fregate.nbPassagers=9;
        fregate.type="FREGATE";
        Vaisseau enPartance = mars.accueillirVaisseau(fregate);
        Vaisseau croiseur = new Vaisseau();
        croiseur.nbPassagers=42;
        croiseur.type="CROISEUR";
        enPartance =  mars.accueillirVaisseau(croiseur);
        System.out.printf("Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d.\n",mars.nom, mars.totalVisiteurs);

        System.out.println("La forme d'une planète est : "+Planete.forme);
        System.out.println("La forme de "+mars.nom + " est "+mars.forme);

        System.out.println(Planete.expansion(10.5d));
        System.out.println(Planete.expansion(14.2d));



        //System.out.println("Il y a " + Planete.nbPlanetesDecouvertes + " planètes découvertes");
        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.type="CHASSEUR";
        chasseur.nbPassagers=42;
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;

        VaisseauCivil vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.type="VAISSEAU-MONDE";
        vaisseauMonde.nbPassagers=4000;
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;

        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();

        chasseur.attaque(vaisseauMonde,"lasers photoniques",3);
        vaisseauMonde.desactiverBouclier();

        System.out.println("Le Vaisseau-Monde dispose encore de "+vaisseauMonde.resistanceDuBouclier+" minutes de protection grâce à son bouclier.");
        System.out.println("Le Vaisseau-Monde dispose encore d'un blindage de valeur "+vaisseauMonde.blindage+".");

       Vaisseau enPartanceDeMars= mars.accueillirVaisseau(vaisseauMonde);
        System.out.printf("Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d.\n",mars.nom, mars.totalVisiteurs);

        //Vaisseau enPartanceDeJupiter=jupiter.accueillirVaisseau(chasseur);
        enPartanceDeMars = mars.accueillirVaisseau(chasseur);
        System.out.printf("Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d.\n",mars.nom, mars.totalVisiteurs);
        */

        //polymorphisme
        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;

        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;

        chasseur.activerBouclier();
        ((VaisseauDeGuerre)chasseur).attaque(vaisseauMonde, "laser photonique", 3);

        //abstract
        VaisseauDeGuerre newChasseur = new VaisseauDeGuerre("CHASSEUR");
        terre.accueillirVaisseau(newChasseur);
        System.out.println("quantité refusée pour "+newChasseur.type+" : "+newChasseur.emporterCargaison(20));

        VaisseauDeGuerre newFregate = new VaisseauDeGuerre("FREGATE");
        newFregate.nbPassagers=100;
        terre.accueillirVaisseau(newFregate);
        System.out.println("quantité refusée pour "+newFregate.type+" : "+newFregate.emporterCargaison(45)); //0
        System.out.println("quantité refusée pour "+newFregate.type+" : "+newFregate.emporterCargaison(12)); //7

        VaisseauDeGuerre newFregate2 = new VaisseauDeGuerre("FREGATE");
        newFregate2.nbPassagers=14;
        terre.accueillirVaisseau(newFregate2);
        System.out.println("quantité refusée pour "+newFregate2.type+" : "+newFregate2.emporterCargaison(30)); //2 --> NON

        VaisseauCivil newVaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        terre.accueillirVaisseau(newVaisseauMonde);
        System.out.println("quantité refusée pour "+newVaisseauMonde.type+" : "+newVaisseauMonde.emporterCargaison(1560)); //0
        System.out.println("quantité refusée pour "+newVaisseauMonde.type+" : "+newVaisseauMonde.emporterCargaison(600)); //160


    }
}