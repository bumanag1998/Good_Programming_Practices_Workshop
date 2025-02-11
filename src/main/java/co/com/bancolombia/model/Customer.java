package co.com.bancolombia.model;

public class Customer extends Person {

    private int numberCardCustomer;
    private String nameCustomer;
    private String firstLastNameCustomer;
    private String secondLastNameCustomer;

    public Customer() {
    }

    public int getNumberCardCustomer() {
        return numberCardCustomer;
    }

    public void setNumberCardCustomer(int numberCardCustomer) {
        this.numberCardCustomer = numberCardCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getFirstLastNameCustomer() {
        return firstLastNameCustomer;
    }

    public void setFirstLastNameCustomer(String firstNameCustomer) {
        this.firstLastNameCustomer = firstNameCustomer;
    }

    public String getSecondLastNameCustomer() {
        return secondLastNameCustomer;
    }

    public void setSecondLastNameCustomer(String secondNameCustomer) {
        this.secondLastNameCustomer = secondNameCustomer;
    }

    public void sendCustomerInformation() {
        System.out.println("Identification number:" + this.getNumberCardCustomer());
        System.out.println("Name: " + this.getNameCustomer());
        System.out.println("First lastname: " + this.getFirstLastNameCustomer());
        System.out.println("Second lastname: " + this.getSecondLastNameCustomer() + "\n");
    }

    public void sendFamilyInformation() {
        System.out.println("Maritial status: " + this.getMaritalStatus());
        System.out.println("Number of children: " + this.getNumberOfChildren());
        System.out.println("Number of siblings: " + this.getNumberOfSiblings());
        System.out.println("Name of the father: " + this.getNameOfTheFather());
        System.out.println("Name of the mother: " + this.getNameOfTheMother() + "\n");

    }
}
