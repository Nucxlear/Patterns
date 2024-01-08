public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle = new Circle();

        Shape circle2 = new Circle();
        Shape triangle3 = new Triangle();

        Composite composite = new Composite();
        Composite dComposite1 = new Composite();
        Composite dComposite2 = new Composite();

        dComposite1.addComponent(triangle);
        dComposite1.addComponent(triangle2);
        dComposite1.addComponent(circle);

        dComposite2.addComponent(circle2);
        dComposite2.addComponent(triangle3);

        composite.addComponent(dComposite1);
        composite.addComponent(dComposite2);

        composite.draw();
    }
}