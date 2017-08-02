package me.resthibernate.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import me.resthibernate.common.type.ServiceType;

/**
 * @author tuanhpham
 */
@Entity
@Getter@Setter
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "entry_type")
    @Enumerated(EnumType.STRING)
    private ServiceType entryType;

    @Column(name = "summary")
    private String summary;

    @Column(name = "name")
    private String name;

    //All  can track like/dislike
    @Transient
    private Long likeNumber;

    @Transient
    private Long dislikeNumber;

    /*@Transient
    @Enumerated(EnumType.STRING)
    private LikeStatus currentUserLikeStatus;*/
}
