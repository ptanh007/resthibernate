package me.resthibernate.model.embeddable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author tuanhpham.
 */
@Embeddable
@Getter@Setter
public class UserServiceId implements Serializable{
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "service_id")
    private Long serviceId;
}
