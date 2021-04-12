package com.gaf.coursemanageapp.utils;

import org.springframework.stereotype.Indexed;

public class Role {

    private String role;

    public Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
