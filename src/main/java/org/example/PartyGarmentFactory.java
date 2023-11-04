package org.example;


public class PartyGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new PartyTop();
    }

    @Override
    public Pants createPants() {
        return new PartyPants(); // Implement createPants
    }

    @Override
    public Shoes createShoes() {
        return new PartyShoes(); // Implement createShoes
    }
}