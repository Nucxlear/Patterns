public class Circle implements Shape{
    @Override
    public void draw(int x, int y) {
        int rad = 5;
        System.out.println("("+x+","+y+")" + "radius = " + rad);
    }
}
