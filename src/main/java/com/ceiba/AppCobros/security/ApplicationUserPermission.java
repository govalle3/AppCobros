package com.ceiba.AppCobros.security;

public enum ApplicationUserPermission {
    DEBTOR_READ("debtor:read"),
    DEBTOR_WRITE("debtor:write"),
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
