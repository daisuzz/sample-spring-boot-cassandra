package dev.daisuzz.samplespringbootcassandra;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT * from users")
    List<User> find();

    @Query("SELECT * from users where user_id in(?0)")
    User findByIdIn(long id);

    @Query("SELECT * from users where username like ?0")
    User findByUsername(String username);
}
