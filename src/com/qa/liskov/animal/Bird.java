package com.qa.liskov.animal;

public abstract class Bird {
	
    private int altitude;
    
    public abstract void fly() throws Exception;

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
