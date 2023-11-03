package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {

       Compte compteNormal = new Compte("123456", 1000.0);
       Compte compteTaux = new Compte("12", 10.0) ;
       Compte [] tableau = new Compte[2];
       tableau[0]=compteNormal;
       tableau[1]=compteTaux;



        System.out.println("le compte Normal"+tableau[0]);
        System.out.println("le taux"+ tableau[1]);

    }
}
