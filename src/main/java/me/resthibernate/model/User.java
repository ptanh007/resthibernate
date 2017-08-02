package me.resthibernate.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tuanhpham on 5/31/16.
 */
@Entity
@Table(name = "user")
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter@Setter
    @Column(name = "first_name")
    private String firstName;

    @Getter@Setter
    @Column(name = "last_name")
    private String lastName;

    @Getter@Setter
    @Column(name = "social_id")
    private String socialId;
}
