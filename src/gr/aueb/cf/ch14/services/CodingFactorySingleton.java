package gr.aueb.cf.ch14.services;

public class CodingFactorySingleton {

    private static final CodingFactorySingleton INSTANCE = new CodingFactorySingleton();

    private CodingFactorySingleton() {

    }

    public static CodingFactorySingleton getInstance() {
        return INSTANCE;
    }

    public void satHello() {
        System.out.println("Hello");
    }
}
