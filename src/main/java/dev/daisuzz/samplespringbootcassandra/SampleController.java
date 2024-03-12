package dev.daisuzz.samplespringbootcassandra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class SampleController {

    private final UserRepository repository;

    public SampleController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<User> findUsers() {
        return repository.find();
    }

    @PostMapping
    public void createUser() {
    }
}
