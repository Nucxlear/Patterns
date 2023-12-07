public class specificFactory2 implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new specificProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new specificProductB2();
    }
}
