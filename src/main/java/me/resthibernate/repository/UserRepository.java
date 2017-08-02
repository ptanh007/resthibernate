package me.resthibernate.repository;

import me.resthibernate.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
/**
 * @author tuanhpham
 */
@Transactional
public interface UserRepository extends CrudRepository<User, Long>{
    User findBySocialId(String socialid);
}
