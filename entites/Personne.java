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
        public void affichage() {
                String newNom = nom.toUpperCase();
                System.out.println(newNom + prenom);
        }
        public void modif (String newPrenom){
                prenom = newPrenom ;
                System.out.println(newPrenom);
                }
        public void  modificationAdresse(AdressePostale newAddres){
                adress =newAddres ;
                System.out.println(newAddres);
        }
        /*public void   retourneNom(String nom){
                return nom;*/
}









