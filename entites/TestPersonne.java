package entites;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adress = new AdressePostale(20,"collina",34000,"Montpellier");
        Personne p1 = new Personne(adress,"Ndiaye","Madibo");
        Personne p2 = new Personne(adress,"Ndiaye","Madibo");

        p2.modif("Mame");


    }

}
