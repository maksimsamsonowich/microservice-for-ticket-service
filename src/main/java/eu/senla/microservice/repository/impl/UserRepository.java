package eu.senla.microservice.repository.impl;

import eu.senla.microservice.entity.User;
import eu.senla.microservice.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class UserRepository implements IUserRepository {

    private final MongoTemplate mongoTemplate;

    @Override
    public void createUser(String username) {
        mongoTemplate.save(new User()
                .setUsername(username)
                .setIsBlocked(false));
    }

    @Override
    public User readUser(String username) {
        return mongoTemplate.findById(username, User.class);
    }

    @Override
    public User updateUser(User userInfo) {
        mongoTemplate.save(userInfo);

        return userInfo;
    }

    @Override
    public void deleteUser(String username) {
        mongoTemplate.remove(this.readUser(username));
    }
}
