public class Sedan extends Car{
    public Sedan(Make m){
        super(m);
    }
    @Override
    void showDetails() {
        System.out.println("sedan");
        make.setMake();
    }
}
