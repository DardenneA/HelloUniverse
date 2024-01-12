public abstract class Planete {
    public String nom;
    int diametre;
    Atmosphere atmosphere;
    static String forme="Sphérique";
    static int nbPlanetesDecouvertes;

    Planete(){
        nbPlanetesDecouvertes++;
    }

    Planete(String nom){
        this.nom = nom;
        nbPlanetesDecouvertes++;
    }

    void rotation(){
        System.out.printf("Je suis la planète %s et je tourne autour de mon étoile.\n",nom);
    }

    void revolution(){
        System.out.printf("Je suis la planète %s et je tourne sur moi-même.\n",nom);
    }

    int rotation(int angle){
        int tourNbr = angle/360;
        System.out.printf("%s a effectué %d tours complets sur elle-même.\n ",nom,tourNbr);
        return tourNbr;
    }

    int revolution(int angle){
        int tourNbr = angle/360;
        System.out.printf("%s a effectué %d tours complets autour de son étoile.\n ",nom,tourNbr);
        return tourNbr;
    }

    static String expansion(double distance){
        if (distance<14d){
            return "Oh la la mais c'est super rapide !";
        }
        else{
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }
    }
}
