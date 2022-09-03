package day25overriding;

public class Runner {
    public static void main(String[] args) {
        CreditCard ccn1 = new CreditCard();
        ccn1.getCcn();
        System.out.println(ccn1.getCcn());

        String ccn = ccn1.getCcn();
        ccn1.setCcn("*************"+ ccn.substring((ccn.length()-4)));
        System.out.println(ccn1.getCcn());

        ccn1.setCcn("Not visible");
        System.out.println(ccn1.getCcn());

    }
}
