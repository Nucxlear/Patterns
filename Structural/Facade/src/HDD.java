public class HDD {
    void copyFromDVD(DVDRom dvd){
        if (dvd.hasData()){
            System.out.println("Происходит копирование ланных с диска");
        }
        else{
            System.out.println("Вставьте диск");
        }
    }
}
