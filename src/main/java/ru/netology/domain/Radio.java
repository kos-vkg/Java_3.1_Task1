package ru.netology.domain;

public class Radio {

    private int currentChannel; // канал 0..9 по кругу
    private int soundVolume;  // громкость 0..10 c ограничением

    public static final int MAX_CHANNEL = 9;
    public static final int MIN_CHANNEL = 0;
    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > MAX_CHANNEL) {
            return;
        }
        if (currentChannel < MIN_CHANNEL) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void incCurrentChannel() {
        if (currentChannel < MAX_CHANNEL) {
            ++currentChannel;
        } else {
            currentChannel = MIN_CHANNEL;
        }
    }

    public void decCurrentChannel() {
        if (currentChannel > MIN_CHANNEL) {
            --currentChannel;
        } else {
            currentChannel = MAX_CHANNEL;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void incSoundVolume() {
        if (soundVolume < MAX_VOLUME) {
            ++soundVolume;
        }
    }

    public void decSoundVolume() {
        if (soundVolume > MIN_VOLUME) {
            --soundVolume;
        }
    }

    // setSoundVolume в задаче не требовалось, но удобно
    public void setSoundVolume(int soundVolume) {
        if (soundVolume > 10) return;
        if (soundVolume < 0) return;
        this.soundVolume = soundVolume;
    }

}
