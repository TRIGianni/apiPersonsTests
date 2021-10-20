package be.heh.projetapiweb;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

@RequiredArgsConstructor
public class Person {

    @Getter
    private final String firstName;
    @Getter
    private final String lastName;
    @Getter
    private final int age;

    public int getBirthYear() {
        int annee = LocalDate.now().getYear() - this.age;
        return annee ;
    }

}
