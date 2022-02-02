package eu.senla.microservice.repository;

import eu.senla.microservice.entity.User;

public interface IUserRepository {

    void createUser(String username);

    User readUser(String username);

    User updateUser(User userInfo);

    void deleteUser(String username);

}
