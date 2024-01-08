public class QuoteDecorator extends Decorator{

    public QuoteDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("/");
        component.print();
        System.out.print("/");
    }
}
