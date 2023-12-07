public class specificFactory1 implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new specificProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new specificProductB1();
    }
}
