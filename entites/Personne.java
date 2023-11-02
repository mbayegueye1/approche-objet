package entites;

public class Personne {

        AdressePostale adress;
        String nom;
        String prenom;

        public Personne(AdressePostale adress, String nom, String prenom) {
                this.adress = adress;
                this.nom = nom;
                this.prenom = prenom;
        }
}
