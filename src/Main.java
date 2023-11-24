public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.equals(s2));
        ////////////
        Person person = new PersonBuilder().setAge(22).setFirstName("Andrew").build();
    }
}