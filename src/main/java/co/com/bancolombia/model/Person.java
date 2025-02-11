package co.com.bancolombia.model;

public class Person {
    protected String maritalStatus;
    protected int numberOfChildren;
    protected int numberOfSiblings;
    protected String nameOfTheFather;
    protected String nameOfTheMother;

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public int getNumberOfSiblings() {
        return numberOfSiblings;
    }

    public void setNumberOfSiblings(int numberOfSiblings) {
        this.numberOfSiblings = numberOfSiblings;
    }

    public String getNameOfTheFather() {
        return nameOfTheFather;
    }

    public void setNameOfTheFather(String nameOfTheFather) {
        this.nameOfTheFather = nameOfTheFather;
    }

    public String getNameOfTheMother() {
        return nameOfTheMother;
    }

    public void setNameOfTheMother(String nameOfTheMother) {
        this.nameOfTheMother = nameOfTheMother;
    }
}
