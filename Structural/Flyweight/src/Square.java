public class Square implements Shape{
    @Override
    public void draw(int x, int y) {
        int side = 10;
        System.out.println("("+x+","+y+")" + "side = " + side);
    }
}
