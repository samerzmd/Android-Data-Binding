package com.bignerdranch.android.android_data_binding;

/**
 * Created by SamerGigaByte on 17/06/2016.
 */
public class User {
    private final String firstName;
    private final String lastName;
    public boolean isFriend=true;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}
