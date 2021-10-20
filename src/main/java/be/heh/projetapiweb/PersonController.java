package be.heh.projetapiweb;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path="/api", produces="application/json")
@CrossOrigin(origins="*")
@RequiredArgsConstructor

public class PersonController {
    private final AllPersonUseCase allPersonUseCase;

    @GetMapping("/persons")
        public Map<String, Object> getPersons() {
            return allPersonUseCase.getPersons();
    }

}
