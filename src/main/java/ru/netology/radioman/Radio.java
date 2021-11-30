package ru.netology.radioman;

public class Radio {
    private int Station;
    private int Volume;
    private int countOfStation = 10;
    private int maxStation = countOfStation - 1;


    public Radio() {
    }

    public Radio(int countOfStation) {
        this.countOfStation = countOfStation;
        this.maxStation = this.countOfStation - 1;
    }

    public int getStation() {
        return Station;
    }

    public int getVolume() {
        return Volume;
    }

    public void setStation(int Station) {
        if (Station > maxStation || Station < 0) {
            return;
        }
        this.Station = Station;
    }

    public void setVolume(int Volume) {
        if (Volume > 100 || Volume < 0) {
            return;
        }
        this.Volume = Volume;
    }

    public void nextStation() {
        if (Station == maxStation) {
            Station = 0;
        } else {
            Station++;
        }

    }

    public void prevStation() {
        if (Station == 0) {
            Station = maxStation;
        } else {
            Station--;
        }

    }

    public void increaseVolume() {
        if (Volume == 100) {
            return;
        } else {
            Volume++;
        }

    }

    public void decreaseVolume() {
        if (Volume == 0) {
            return;
        } else {
            Volume--;
        }

    }
}