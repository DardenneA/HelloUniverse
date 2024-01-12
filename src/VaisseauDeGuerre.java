public class VaisseauDeGuerre extends Vaisseau{

    //for chasseurs, frégates et croiseurs
    boolean armesDesactivees = false;


    VaisseauDeGuerre(String type){
        this.type = type;
        switch (type) {
            case "CHASSEUR":
                this.tonnageMax = 0;
                break;
            case "FREGATE":
                this.tonnageMax = 50;
                break;
            case "CROISEUR":
                this.tonnageMax = 100;
                break;
        }

    }

    void attaque(Vaisseau vaisseauAAttaquer,String armeUtilisé,int dureeAttaque){
        if(armesDesactivees){
            System.out.println("Attaque impossible, l'armement est désactivé");
            return;
        }
        System.out.println(" Un vaisseau de type " + this.type + "attaque un vaisseau de type " + vaisseauAAttaquer.type + " en utilisant l'arme " + armeUtilisé + " pendant " + dureeAttaque + " minutes.");
        vaisseauAAttaquer.resistanceDuBouclier = 0;
        vaisseauAAttaquer.blindage = vaisseauAAttaquer.blindage / 2;
    }

    void desactiverArmes(){
        System.out.println("Désactivation des armes d'un vaisseau de type "+this.type);
        armesDesactivees = true;
    }

    void activerBouclier(){
        this.desactiverArmes();
        super.activerBouclier();
    }

    @Override
    int emporterCargaison(int cargaison) {
       if(type.equals("CHASSEUR")){
           return cargaison;
       }
       else{
           if(nbPassagers<12){
               return cargaison;
           }
           else{
               int tonnagePassagers = nbPassagers*2;
               int tonnageRestant = tonnageMax - tonnageActuel;
               int tonnageAConsiderer = (tonnagePassagers<tonnageRestant ?tonnagePassagers: tonnageRestant);
               if(cargaison>tonnageAConsiderer){
                   tonnageActuel=tonnageMax;
                   return cargaison-tonnageAConsiderer;
               }else{
                   tonnageActuel=tonnageActuel+cargaison;
                   return 0;
               }
           }
       }
    }
}
