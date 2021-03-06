package fr.mpush.respository;

import fr.mpush.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Person repository
 *
 * @author abdourhamane
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByLoginAndActiveIsTrue(String login);

    User findByIdAndActiveIsTrue(Long id);

    List<User> findAll();

}
