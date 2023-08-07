package ru.iooko.factoryMethod;

public class Main {

    public static void main(String[] args) {
        ConcreteCloneable originalData = new ConcreteCloneable("Original Data");

        ObjectFactory factory = new ObjectFactory(originalData);

        ConcreteCloneable copy = factory.createCopy();
    }
}
