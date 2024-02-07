public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Expression ex = context.evaluate("1+2+3");
        System.out.println(ex.interpret());
    }
}