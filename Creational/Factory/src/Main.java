public class Main {
    public static void main(String[] args) {
        ProductA someproductA = new specificProductA1();
        ProductB someproductB = new specificProductB1();
        AbstractFactory fact = new specificFactory1();
        fact.createProductA();

    }
}


