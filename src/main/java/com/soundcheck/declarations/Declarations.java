package com.soundcheck.declarations;

import org.springframework.stereotype.Component;

@Component
public class Declarations {
    private int beatsPerCycle;
    private int numCycles;
    private String low;
    private String high;
    private String outFileName = "final";
    private String start = "Start";
    private double baseFrequency = 360.0;
    private int msec = 140;
    private double volume = 0.2;
    private String playFileName = "";
    private String wavFileName = "";

    public int getBeatsPerCycle() {
        return beatsPerCycle;
    }

    public void setBeatsPerCycle(int beatsPerCycle) {
        this.beatsPerCycle = beatsPerCycle;
    }

    public int getNumCycles() {
        return numCycles;
    }

    public void setNumCycles(int numCycles) {
        this.numCycles = numCycles;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getOutFileName() {
        return outFileName;
    }

    public void setOutFileName(String outFileName) {
        this.outFileName = outFileName;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public double getBaseFrequency() {
        return baseFrequency;
    }

    public void setBaseFrequency(double baseFrequency) {
        this.baseFrequency = baseFrequency;
    }

    public int getMsec() {
        return msec;
    }

    public void setMsec(int msec) {
        this.msec = msec;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getPlayFileName() {
        return playFileName;
    }

    public void setPlayFileName(String playFileName) {
        this.playFileName = playFileName;
    }

    public String getWavFileName() {
        return wavFileName;
    }

    public void setWavFileName(String wavFileName) {
        this.wavFileName = wavFileName;
    }

    @Override
    public String toString() {
        return "Declarations{" +
                "beatsPerCycle=" + beatsPerCycle +
                ", numCycles=" + numCycles +
                ", low='" + low + '\'' +
                ", high='" + high + '\'' +
                ", outFileName='" + outFileName + '\'' +
                ", start='" + start + '\'' +
                ", baseFrequency=" + baseFrequency +
                ", msec=" + msec +
                ", volume=" + volume +
                ", playFileName='" + playFileName + '\'' +
                ", wavFileName='" + wavFileName + '\'' +
                '}';
    }
}
