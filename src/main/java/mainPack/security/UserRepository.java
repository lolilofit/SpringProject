package mainPack.security;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserAut, Long> {
    UserAut findByUsername(String username);
}
