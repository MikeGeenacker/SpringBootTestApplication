package com.mike.don.SpringDbTest.dto;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;

@Entity
@Table(name="Players")
public class Player {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;

    @Column(name="name")
    private String name;

    @Column(name="nickname")
    private String nickname;

    @Column(name="telephoneno")
    private String telephoneno;

}
