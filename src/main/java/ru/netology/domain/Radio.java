package ru.netology.domain;

public class Radio {

    public static final int DEFAULT_MAX_CHANNEL = 10;
    public static final int MIN_CHANNEL = 0;
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;

    private int maxChannel = DEFAULT_MAX_CHANNEL;     //
    private int currentChannel; // канал 0..MAX_CHANNEL по кругу
    private int soundVolume;  // громкость 0..MAX_VOLUME c ограничением

    public Radio() {
    }

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }


    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        if (currentChannel < MIN_CHANNEL) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void incCurrentChannel() {
        if (currentChannel < maxChannel) {
            ++currentChannel;
        } else {
            currentChannel = MIN_CHANNEL;
        }
    }

    public void decCurrentChannel() {
        if (currentChannel > MIN_CHANNEL) {
            --currentChannel;
        } else {
            currentChannel = maxChannel;
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
        if (soundVolume > MAX_VOLUME) return;
        if (soundVolume < MIN_VOLUME) return;
        this.soundVolume = soundVolume;
    }

}
