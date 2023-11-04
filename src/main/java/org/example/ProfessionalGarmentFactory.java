package org.example;

public class ProfessionalGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }

    @Override
    public Pants createPants() {
        return new ProfessionalPants(); // Implement createPants
    }

    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes(); // Implement createShoes
    }
}