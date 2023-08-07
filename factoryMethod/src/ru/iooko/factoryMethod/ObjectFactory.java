package ru.iooko.factoryMethod;

public class ObjectFactory {

    private ConcreteCloneable prototype;

    public ObjectFactory(ConcreteCloneable prototype) {
        this.prototype = prototype;
    }

    public ConcreteCloneable createCopy() {
        return (ConcreteCloneable) prototype.makeCopy();
    }
}
