package fr.diginamic.banque.entites;

public class Compte {
    public String nbCompte;
    public double soldeComte;

    public Compte(String nbCompte, double soldeComte) {
        this.nbCompte = nbCompte;
        this.soldeComte = soldeComte;
    }
    public String getSbComte(){
        return nbCompte;}
    public double getSoldeComte(){
            return soldeComte;

        }
    public String toString() {
        return "Numéro de compte : " + nbCompte + "\nSolde du compte : " + soldeComte;
    }

}
