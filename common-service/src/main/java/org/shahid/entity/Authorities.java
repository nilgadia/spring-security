package org.shahid.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "AUTHORITIES")
@Getter
@Setter
public class Authorities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = true, length = 50)
    private String authority;

}
