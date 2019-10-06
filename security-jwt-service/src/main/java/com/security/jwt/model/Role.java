package com.security.jwt.model;

import com.security.jwt.configuration.Constants;
import com.security.jwt.enums.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Builder
@Data
@Entity
@EqualsAndHashCode(of = {"name"})
@NoArgsConstructor
@Table(schema = Constants.DATABASE_SCHEMA.EAT)
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Constants.DATABASE_SCHEMA.EAT + ".role_id_seq")
    private Integer id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private RoleEnum name;

}