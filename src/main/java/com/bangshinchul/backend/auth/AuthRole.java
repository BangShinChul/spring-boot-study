package com.bangshinchul.backend.auth;


import com.bangshinchul.backend.common.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(uniqueConstraints =
@UniqueConstraint(columnNames =  {"auth_id", "role_id"})
)
public class AuthRole extends BaseEntity {

    @Column(name = "auth_id")
    private Long authId;

    @Column(name = "role_id")
    private Long roleId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id", insertable = false, updatable = false)
    private Role role;

    public Role getRole() {
        return this.role;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setAuthId(Long authId) {
        this.authId = authId;
    }
}
