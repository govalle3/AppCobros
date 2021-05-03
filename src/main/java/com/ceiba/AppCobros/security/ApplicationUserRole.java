package com.ceiba.AppCobros.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.ceiba.AppCobros.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    DEBTOR(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, DEBTOR_READ, DEBTOR_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
