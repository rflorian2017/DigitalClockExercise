package com.company.models;

// Denis Create an enum with all the days of the week named Days

public enum Days {

    Monday(2),
    Tuesday(4),
    Wednesday(8),
    Thursday(16),
    Friday(32),
    Saturday(64),
    Sunday(1);

    public int bitValue;

    private Days(int n){
        this.bitValue = n;
    }

    public int getBitValue(){
        return this.bitValue;
    }
}
