package me.resthibernate.model;

import lombok.Getter;
import lombok.Setter;
import me.resthibernate.common.type.LikeType;
import me.resthibernate.model.embeddable.UserServiceId;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author tuanhpham.
 */
@Entity
@Getter@Setter
public class ServiceUser implements Serializable{

    @EmbeddedId
    private UserServiceId userServiceId;

    @Enumerated(EnumType.STRING)
    @Column(name = "like_status", length = 20, nullable = false)
    private LikeType likeStatus;
}
