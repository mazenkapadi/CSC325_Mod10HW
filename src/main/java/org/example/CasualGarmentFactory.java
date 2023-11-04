package org.example;

public class CasualGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Pants createPants() {
        return new CasualPants(); // Implement createPants
    }

    @Override
    public Shoes createShoes() {
        return new CasualShoes(); // Implement createShoes
    }
}