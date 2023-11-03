package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private float tauxRemuneration;

    public CompteTaux(String nbCompte, double soldeComte, float tauxRemuneration) {
        super(nbCompte, soldeComte);
        this.tauxRemuneration = tauxRemuneration;
    }

    public CompteTaux(float tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
    public String toString(){
        String resultat = super.toString();
        return resultat;
    }
}
