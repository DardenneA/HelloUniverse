public class PlaneteTellurique extends Planete implements Habitable{
    int totalVisiteurs=0;
    Vaisseau vaisseauAccoste;

    PlaneteTellurique(String nom){
        super(nom);
    }


    @Override
    public void accueillirVaisseau(int nbHumains) {
        totalVisiteurs+=nbHumains;
    }

    @Override
    public void accueillirVaisseau(String typeVaisseau) {
        int ajout=0;
        switch (typeVaisseau){
            case "CHASSEUR":
                ajout = 3;
                break;
            case "FREGATE":
                ajout=12;
                break;
            case "CROISEUR":
                ajout=50;
                break;
            default:
                ajout=0;
        }
        totalVisiteurs=totalVisiteurs+ajout;
    }

    @Override
    public Vaisseau accueillirVaisseau(Vaisseau nouveauVaisseau) {
        if(nouveauVaisseau instanceof VaisseauDeGuerre){
            ((VaisseauDeGuerre) nouveauVaisseau).desactiverArmes();
        }
        this.totalVisiteurs = this.totalVisiteurs + nouveauVaisseau.nbPassagers;
        if (this.vaisseauAccoste==null){
            System.out.println("Aucun nouveauVaisseau ne s'en va.");
        }
        else{
            System.out.printf("Un nouveauVaisseau de type %s doit s'en aller.\n",this.vaisseauAccoste.type);
        }
        Vaisseau vaisseauPrecedent = this.vaisseauAccoste;
        this.vaisseauAccoste = nouveauVaisseau;
        System.out.printf("Un nouveauVaisseau de type %s s'accoste.\n",this.vaisseauAccoste.type);
        return vaisseauPrecedent;
    }
}
