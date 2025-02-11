package co.com.bancolombia.control;

import co.com.bancolombia.model.Customer;
import co.com.bancolombia.model.Product;
import co.com.bancolombia.model.Purchase;

public class Control {
    public static void main(String[] args) {


        Customer objCustomer = new Customer();

        objCustomer.setNumberCardCustomer(123456789);
        objCustomer.setNameCustomer("Antonio");
        objCustomer.setFirstLastNameCustomer("Restrepo");
        objCustomer.setSecondLastNameCustomer("Zapata");
        objCustomer.setMaritalStatus("Married");
        objCustomer.setNumberOfChildren(3);
        objCustomer.setNumberOfSiblings(4);
        objCustomer.setNameOfTheFather("Jesús Zapata");
        objCustomer.setNameOfTheMother("Patricia Restrepo");

        Product objProduct1 = new Product();
        Product objProduct2 = new Product();
        Product objProduct3 = new Product();

        objProduct1.setNameProduct("Milk");
        objProduct2.setNameProduct("Eggs");
        objProduct3.setNameProduct("Meet");

        Purchase order = new Purchase();
        order.addProduct(objProduct1);
        order.addProduct(objProduct2);
        order.addProduct(objProduct3);

        System.out.println("_____CUSTOMER_INFORMATION_____");
        objCustomer.sendCustomerInformation();

        System.out.println("_____FAMILY_INFORMATION_____");
        objCustomer.sendFamilyInformation();

        System.out.println("_____PRODUCTS_PURCHASED_BY_THE_CUSTOMER_____");
        order.viewOrder();

    }
}
