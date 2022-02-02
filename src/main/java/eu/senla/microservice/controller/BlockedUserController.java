package eu.senla.microservice.controller;

import eu.senla.microservice.service.IBlockedUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user-management/")
public class BlockedUserController {

    private final IBlockedUserService iBlockedUserService;

    @GetMapping("/isBlocked/{userId}")
    public Boolean isUserBlocked(@PathVariable("userId") String username) {

        return iBlockedUserService.isUserBlocked(username);
    }

    @PutMapping("/add-user/{userId}")
    public void createUser(@PathVariable("userId") String username) {

        iBlockedUserService.saveUser(username);
    }

}
