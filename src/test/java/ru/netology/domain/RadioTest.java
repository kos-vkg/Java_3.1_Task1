package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    ////////////Channel////////////////
    @Test
    public void showSetExtremChannel() {
        radio.setCurrentChannel(9);
        assertEquals(9, radio.getCurrentChannel());
        radio.setCurrentChannel(0);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void showSetExhaledChannel() {
        int beforeChange = radio.getCurrentChannel();
        radio.setCurrentChannel(10);
        assertEquals(beforeChange, radio.getCurrentChannel());
        radio.setCurrentChannel(-1);
        assertEquals(beforeChange, radio.getCurrentChannel());
    }

    @Test
    public void showIncChannel() {
        radio.setCurrentChannel(5);
        radio.incCurrentChannel();
        assertEquals(6, radio.getCurrentChannel());
        radio.setCurrentChannel(9);
        radio.incCurrentChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void showDecChannel() {
        radio.setCurrentChannel(5);
        radio.decCurrentChannel();
        assertEquals(4, radio.getCurrentChannel());
        radio.setCurrentChannel(0);
        radio.decCurrentChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    ///////////// Volume/////////////
    @Test
    public void showSetExtremVolume() {
        radio.setSoundVolume(10);
        assertEquals(10, radio.getSoundVolume());
        radio.setSoundVolume(0);
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void showSetExhaledVolume() {
        int beforeChange = radio.getSoundVolume();
        radio.setSoundVolume(11);
        assertEquals(beforeChange, radio.getSoundVolume());
        radio.setSoundVolume(-1);
        assertEquals(beforeChange, radio.getSoundVolume());
    }

    @Test
    public void showIncVolume() {
        radio.setSoundVolume(5);
        radio.incSoundVolume();
        assertEquals(6, radio.getSoundVolume());
        radio.setSoundVolume(10);
        radio.incSoundVolume();
        assertEquals(10, radio.getSoundVolume());
    }

    @Test
    public void showDecVolume() {
        radio.setSoundVolume(5);
        radio.decSoundVolume();
        assertEquals(4, radio.getSoundVolume());
        radio.setSoundVolume(0);
        radio.decSoundVolume();
        assertEquals(0, radio.getSoundVolume());
    }

}