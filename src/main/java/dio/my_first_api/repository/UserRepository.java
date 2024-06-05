package dio.my_first_api.repository;

import dio.my_first_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Override
    void deleteById(Integer id);

    @Override
    Optional<User> findById(Integer id);

    List<User> findByLogin(String login);


}
