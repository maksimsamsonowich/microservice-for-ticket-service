package eu.senla.microservice.service.impl;

import eu.senla.microservice.entity.User;
import eu.senla.microservice.repository.impl.UserRepository;
import eu.senla.microservice.service.IBlockedUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BlockedUserService implements IBlockedUserService {

    private final UserRepository userRepository;

    @Override
    public Boolean isUserBlocked(String username) {
        return userRepository.readUser(username).getIsBlocked();
    }

    @Override
    public void saveUser(String username) {
        userRepository.createUser(username);
    }

}
