public class Main {
    public static void main(String[] args) {
        PrinterInterface printer = new QuoteDecorator(new LeftBracketDecorator(new
                RightBracketDecorator(new Printer("hello"))));
        printer.print();
    }
}