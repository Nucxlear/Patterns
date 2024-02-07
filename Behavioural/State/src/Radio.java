//context
public class Radio {
    Station station;
    void setStation(Station st){
        station = st;
    }
    void nextStation(){
        if(station instanceof Radio1){
            setStation(new Radio2());
        } else if (station instanceof Radio2) {
            setStation(new Radio3());
        } else if (station instanceof Radio3) {
            setStation(new Radio1());
        }
    }

    void play(){
        station.play();
    }

}
