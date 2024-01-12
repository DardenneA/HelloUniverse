public abstract class Vaisseau {
    int nbPassagers;
    String type;

    int blindage;
    int resistanceDuBouclier; //nombre de min de resistance

    int tonnageMax;
    int tonnageActuel;

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type +"+this.type);
    }
    void desactiverBouclier(){
        System.out.println("Désactivation du bouclier d'un vaisseau de type "+this.type);
    }

    abstract int emporterCargaison(int cargaison);

}
