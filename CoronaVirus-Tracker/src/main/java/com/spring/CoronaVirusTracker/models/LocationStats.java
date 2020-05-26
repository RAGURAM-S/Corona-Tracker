package com.spring.CoronaVirusTracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int latestCaseCount;
    private int delta;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestCaseCount() {
        return latestCaseCount;
    }

    public void setLatestCaseCount(int latestCaseCount) {
        this.latestCaseCount = latestCaseCount;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestCaseCount=" + latestCaseCount +
                ", delta=" + delta +
                '}';
    }
}
