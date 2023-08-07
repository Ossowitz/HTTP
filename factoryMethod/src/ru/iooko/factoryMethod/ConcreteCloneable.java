package ru.iooko.factoryMethod;

public class ConcreteCloneable implements Cloneable {

    private String data;

    public ConcreteCloneable(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public Cloneable makeCopy() {
        return new ConcreteCloneable(this.data);
    }
}
