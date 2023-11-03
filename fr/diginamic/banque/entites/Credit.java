package fr.diginamic.banque.entites;

public class Credit extends Operation{
    public Credit(String dateOperation, double montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public String getType() {
        return "Crédit";
    }
    @Override
    public String toString() {
        return "Type: " + getType() + ", Account Number: " + dateOperation + ", Balance: " + montantOperation;
    }
}
