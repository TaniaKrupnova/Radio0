package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private Radio Radio0 = new Radio();

    @Test
    public void shouldSetStationCentre() {

        Radio0.setStation(4);
        int actual = Radio0.getStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void SetStationAny() {
        Radio Radio0 = new Radio(200);
        Radio0.setStation(184);
        int actual = Radio0.getStation();
        int expected = 184;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationOnMin() {
    Radio0.setStation(0);
    int actual = Radio0.getStation();
    int expected = 0;
    assertEquals(expected, actual);
}

    @Test
    public void shouldSetStationOnMax() {

        Radio0.setStation(9);
        int actual = Radio0.getStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOverMax() {

        Radio0.setStation(10);
        int actual = Radio0.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOnMaxAny() {
        Radio Radio0 = new Radio(56);
        Radio0.setStation(55);
        int actual = Radio0.getStation();
        int expected = 55;
        assertEquals(expected, actual);
    }
    @Test
    public void SetStationOverMaxAny() {
        Radio Radio0 = new Radio(100);
        Radio0.setStation(100);
        int actual = Radio0.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void shouldSetStationUnderMin() {

        Radio0.setVolume(-10);
        int actual = Radio0.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeInRange() {

        Radio0.setVolume(50);
        int actual = Radio0.getVolume();
        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOnMax() {

        Radio0.setVolume(100);
        int actual = Radio0.getVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOnMin() {
        Radio0.setVolume(0);
        int actual = Radio0.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOverMax() {
        Radio0.setVolume(101);
        int actual = Radio0.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUnderMin() {
        Radio0.setVolume(-5);
        int actual = Radio0.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldNextStationInRange() {
        Radio0.setStation(8);
        Radio0.nextStation();
        int actual = Radio0.getStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void NextStationAny() {
        Radio Radio0 = new Radio(100);
        Radio0.setStation(98);
        Radio0.nextStation();
        int actual = Radio0.getStation();
        int expected = 99;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationOnMin() {
        Radio Radio0 = new Radio();
        Radio0.setStation(0);
        Radio0.nextStation();
        int actual = Radio0.getStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationOnMax() {
        Radio0.setStation(9);
        Radio0.nextStation();
        int actual = Radio0.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void shouldPrevStationInRange() {
        Radio Radio0 = new Radio(100);
        Radio0.setStation(99);
        Radio0.nextStation();
        int actual = Radio0.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void PrevStationInRange() {
        Radio0.setStation(1);
        Radio0.prevStation();
        int actual = Radio0.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void PrevStation() {
        Radio Radio0 = new Radio(80);
        Radio0.setStation(55);
        Radio0.prevStation();
        int actual = Radio0.getStation();
        int expected = 54;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOnMin() {
        Radio0.setStation(0);
        Radio0.prevStation();
        int actual = Radio0.getStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void PrevStationOnMinAny() {
        Radio Radio0 = new Radio(80);
        Radio0.setStation(0);
        Radio0.prevStation();
        int actual = Radio0.getStation();
        int expected = 79;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOnMax() {
        Radio0.setStation(9);
        Radio0.prevStation();
        int actual = Radio0.getStation();
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void PrevStationOnMaxAny() {
        Radio Radio0 = new Radio(80);
        Radio0.setStation(79);
        Radio0.prevStation();
        int actual = Radio0.getStation();
        int expected = 78;
        assertEquals(expected, actual);
    }
    @Test
    public void PrevStationOverMaxAny() {
        Radio Radio0 = new Radio(80);
        Radio0.setStation(80);
        Radio0.prevStation();
        int actual = Radio0.getStation();
        int expected = 79;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationMax() {
        Radio0.setStation(10);
        Radio0.prevStation();
        int actual = Radio0.getStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeCentre() {
        Radio0.setVolume(43);
        Radio0.increaseVolume();
        int actual = Radio0.getVolume();
        int expected = 44;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOnMin() {
        Radio0.setVolume(0);
        Radio0.increaseVolume();
        int actual = Radio0.getVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOnMax() {

        Radio0.setVolume(100);
        Radio0.increaseVolume();
        int actual = Radio0.getVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeCentre() {
        Radio0.setVolume(6);
        Radio0.decreaseVolume();
        int actual = Radio0.getVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOnMin() {
        Radio0.setVolume(0);
        Radio0.decreaseVolume();
        int actual = Radio0.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOnMax() {
        Radio0.setVolume(10);
        Radio0.decreaseVolume();
        int actual = Radio0.getVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }
}