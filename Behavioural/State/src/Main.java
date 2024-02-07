public class Main {
    public static void main(String[] args) {
        Station radio1 = new Radio1();
        Radio radio = new Radio();

        radio.setStation(radio1);

        for (int i = 0; i < 12; i++){
            radio.play();
            radio.nextStation();
        }
    }
}