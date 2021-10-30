package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetStationCentre() {
        Radio Radio0 = new Radio();
        Radio0.setStation(4);
        int actual = Radio0.getStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationOnMin() {
        Radio Radio0 = new Radio();
        Radio0.setStation(0);
        int actual = Radio0.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationOnMax() {
        Radio Radio0 = new Radio();
        Radio0.setStation(9);
        int actual = Radio0.getStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationOverMax() {
        Radio Radio0 = new Radio();
        Radio0.setStation(10);
        int actual = Radio0.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationUnderMin() {
        Radio Radio0 = new Radio();
        Radio0.setStation(-10);
        int actual = Radio0.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeInRange() {
        Radio Radio0 = new Radio();
        Radio0.setVolume(0);
        int actual = Radio0.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeOnMax() {
        Radio Radio0 = new Radio();
        Radio0.setVolume(10);
        int actual = Radio0.getVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeOnMin() {
        Radio Radio0 = new Radio();
        Radio0.setVolume(0);
        int actual = Radio0.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeOverMax() {
        Radio Radio0 = new Radio();
        Radio0.setVolume(11);
        int actual = Radio0.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeUnderMin() {
        Radio Radio0 = new Radio();
        Radio0.setVolume(-5);
        int actual = Radio0.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void shouldNextStationInRange() {
        Radio Radio0 = new Radio();
        Radio0.setStation(8);
        Radio0.nextStation();
        int actual = Radio0.getStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationOnMin() {
        Radio Radio0 = new Radio();
        Radio0.setStation(0);
        Radio0.nextStation();
        int actual = Radio0.getStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationOnMax() {
        Radio Radio0 = new Radio();
        Radio0.setStation(9);
        Radio0.nextStation();
        int actual = Radio0.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationInRange() {
        Radio Radio0 = new Radio();
        Radio0.setStation(1);
        Radio0.prevStation();
        int actual = Radio0.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationOnMin() {
        Radio Radio0 = new Radio();
        Radio0.setStation(0);
        Radio0.prevStation();
        int actual = Radio0.getStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationOnMax() {
        Radio Radio0 = new Radio();
        Radio0.setStation(9);
        Radio0.prevStation();
        int actual = Radio0.getStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeCentre() {
        Radio Radio0 = new Radio();
        Radio0.setVolume(3);
        Radio0.increaseVolume();
        int actual = Radio0.getVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOnMin() {
        Radio Radio0 = new Radio();
        Radio0.setVolume(0);
        Radio0.increaseVolume();
        int actual = Radio0.getVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOnMax() {
        Radio Radio0 = new Radio();
        Radio0.setVolume(10);
        Radio0.increaseVolume();
        int actual = Radio0.getVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeCentre() {
        Radio Radio0 = new Radio();
        Radio0.setVolume(6);
        Radio0.decreaseVolume();
        int actual = Radio0.getVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeOnMin() {
        Radio Radio0 = new Radio();
        Radio0.setVolume(0);
        Radio0.decreaseVolume();
        int actual = Radio0.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeOnMax() {
        Radio Radio0 = new Radio();
        Radio0.setVolume(10);
        Radio0.decreaseVolume();
        int actual = Radio0.getVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }
}