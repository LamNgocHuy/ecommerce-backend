package com.nh7.ecommerce.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="role")
public class Role extends BaseEntity {

    @Column
    private String roleName;
    @ManyToMany
    @JoinTable(name="role_permission",
               joinColumns = @JoinColumn(name="role_id"),
               inverseJoinColumns = @JoinColumn(name="permission_id")
    )
    private List<Permission> permissions=new ArrayList<>();
    @ManyToMany(mappedBy = "roles")
    private List<User> users=new ArrayList<>();


    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
