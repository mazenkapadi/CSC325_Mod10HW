package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        testFactory(new ProfessionalGarmentFactory(), "Professional");
        testFactory(new CasualGarmentFactory(), "Casual");
        testFactory(new PartyGarmentFactory(), "Party");
    }

    public static void testFactory(GarmentFactory factory, String familyName) {
        System.out.println("Creating matching garments for the " + familyName + " family:");

        Top top = factory.createTop();
        top.createTop();

        Pants pants = factory.createPants();
        pants.createPants();

        Shoes shoes = factory.createShoes();
        shoes.createShoes();

        System.out.println();
    }
}