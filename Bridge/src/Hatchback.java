public class Hatchback extends Car{
    public Hatchback(Make m){
        super(m);
    }
    @Override
    void showDetails() {
        System.out.println("hatchback");
        make.setMake();
    }
}