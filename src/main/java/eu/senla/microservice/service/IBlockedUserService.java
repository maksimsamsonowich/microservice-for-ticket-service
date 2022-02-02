package eu.senla.microservice.service;

public interface IBlockedUserService {

    Boolean isUserBlocked(String username);

    void saveUser(String username);

}
