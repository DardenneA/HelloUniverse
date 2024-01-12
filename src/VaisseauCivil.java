public class VaisseauCivil extends Vaisseau{
    VaisseauCivil(String type){
        this.type = type;
        switch (type){
            case "CARGO":
                this.tonnageMax=500;
                break;
            case "VAISSEAU-MONDE":
                this.tonnageMax=2000;
                break;
        }
    }
    @Override
    int emporterCargaison(int cargaison) {
        int tonnageRestant = tonnageMax - tonnageActuel;
        if(cargaison>tonnageRestant){
            tonnageActuel = tonnageMax;
            return cargaison-tonnageRestant;
        }else{
            tonnageActuel = tonnageActuel + cargaison;
            return 0;
        }
    }
    //for Cargo ou le Vaisseau-Monde
}
