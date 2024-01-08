public class DVDRom {
    private boolean data = false;
    public boolean hasData(){
        return data;
    }
    void load(){
        System.out.println("DVD is loaded");
        data = true;
    }
    void unload(){
        System.out.println("DVD is unload");
        data = true;
    }
}
