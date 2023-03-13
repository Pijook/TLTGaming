package pl.pijok.TLTGaming.backend.user;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pijok.TLTGaming.backend.BaseController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping( "/users")
@RequiredArgsConstructor
public class UsersController extends BaseController {

    private final Logger logger;

    @GetMapping("/get-all-users")
    public ResponseEntity<List<UserResponse>> getAllUsers(){
        logger.info("Hello world!");

        ArrayList<UserResponse> list = new ArrayList<>();
        list.add(new UserResponse("Adam"));


        return ResponseEntity.of(Optional.of(list));
    }

}
