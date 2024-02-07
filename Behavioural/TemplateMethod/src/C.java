abstract class C {
    void templateMethod(){
        System.out.println("1");
        differ();
        System.out.println("3");
    }
    abstract void differ();
}
