package entites;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adress = new AdressePostale(20,"collina",34000,"Montpellier");
        Personne name = new Personne(adress,"Ndiaye","Madibo");
        name.nom ="Ndiaye";
        name.prenom ="Madibo";
        name.adress = adress;
    }
}
