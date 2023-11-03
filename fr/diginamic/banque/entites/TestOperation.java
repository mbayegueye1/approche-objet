package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {
        Debit compteDebit1 = new Debit("12042023", 1000.0);
        Debit compteDebit2 = new Debit("12032022", 15023423.0) ;
        Credit compteCredit1 = new Credit("12032006", 10034340.0);
        Credit compteCredit2 = new Credit("12052022", 1534310.0) ;
        Debit[] tableau = new Debit[4];
        Credit [] tableau1 = new Credit[2];
        tableau[0]=compteDebit1;
        tableau[1]=compteDebit2;
        tableau1[0]=compteCredit1;
        tableau1[1]=compteCredit2;
        System.out.println("Operation Debit1"+compteDebit1 );
        System.out.println("Operation Debit2"+compteDebit2 );
        System.out.println("Operation Credit1"+ compteCredit1);
        System.out.println("Operation Credit2"+ compteCredit2);





    }

}
