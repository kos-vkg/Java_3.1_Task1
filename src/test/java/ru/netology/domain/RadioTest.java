package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    public static final int MAX_CHANNEL = 20; // количество каналов

    Radio radio = new Radio(MAX_CHANNEL);

    ////////////Channel////////////////
    @Test
    public void showDefaultMaxChannel() {
        Radio radio = new Radio(); // проверка каналов по умолчанию
        assertEquals(10, radio.getMaxChannel());
    }

    @Test
    public void showSetExtremChannel() {
        radio.setCurrentChannel(MAX_CHANNEL);
        assertEquals(MAX_CHANNEL, radio.getCurrentChannel());
        radio.setCurrentChannel(0);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void showSetExhaledChannel() {
        int beforeChange = radio.getCurrentChannel();
        radio.setCurrentChannel(MAX_CHANNEL+1);
        assertEquals(beforeChange, radio.getCurrentChannel());
        radio.setCurrentChannel(-1);
        assertEquals(beforeChange, radio.getCurrentChannel());
    }

    @Test
    public void showIncChannel() {
        radio.setCurrentChannel(MAX_CHANNEL-1);
        radio.incCurrentChannel();
        assertEquals(MAX_CHANNEL, radio.getCurrentChannel());
        //radio.setCurrentChannel(MAX_CHANNEL);
        radio.incCurrentChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void showDecChannel() {
        radio.setCurrentChannel(MAX_CHANNEL);
        radio.decCurrentChannel();
        assertEquals(MAX_CHANNEL-1, radio.getCurrentChannel());
        radio.setCurrentChannel(0);
        radio.decCurrentChannel();
        assertEquals(MAX_CHANNEL, radio.getCurrentChannel());
    }

    ///////////// Volume/////////////
    @Test
    public void showSetExtremVolume() {
        radio.setSoundVolume(100);
        assertEquals(100, radio.getSoundVolume());
        radio.setSoundVolume(0);
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void showSetExhaledVolume() {
        int beforeChange = radio.getSoundVolume();
        radio.setSoundVolume(101);
        assertEquals(beforeChange, radio.getSoundVolume());
        radio.setSoundVolume(-1);
        assertEquals(beforeChange, radio.getSoundVolume());
    }

    @Test
    public void showIncVolume() {
        radio.setSoundVolume(5);
        radio.incSoundVolume();
        assertEquals(6, radio.getSoundVolume());
        radio.setSoundVolume(100);
        radio.incSoundVolume();
        assertEquals(100, radio.getSoundVolume());
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