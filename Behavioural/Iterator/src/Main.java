public class Main {
    public static void main(String[] args) {
        Tasks c = new Tasks();
        Iterator it = c.getIterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
}