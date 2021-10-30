package ru.netology.radioman;

public class Radio {
    private int Station;
    private int Volume;

    public int getStation() {
        return Station;
    }

    public int getVolume() {
        return Volume;
    }

    public void setStation(int Station) {
        if (Station > 9 || Station < 0) {
            return;
        }
        this.Station = Station;
    }

    public void setVolume(int Volume) {
        if (Volume > 10 || Volume < 0) {
            return;
        }
        this.Volume = Volume;
    }

    public void nextStation() {
        if (Station == 9) {
            Station = 0;
        } else {
            Station++;
        }

    }

    public void prevStation() {
        if (Station == 0) {
            Station = 9;
        } else {
            Station--;
        }

    }

    public void increaseVolume() {
        if (Volume == 10) {
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