package be.heh.projetapiweb;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class AllPerson implements AllPersonUseCase{
    @Override
    public Map<String, Object> getPersons() {
        Person pers1 = new Person(1L,"Toto","titi",12);
        Person pers2 = new Person(1L,"Toto1","titi1",22);
        Person pers3 = new Person(3L,"Toto2","titi2",32);
        List<Person> pers = new ArrayList<>();
        pers.add(pers1);
        pers.add(pers2);
        pers.add(pers3);
        Map<String, Object> persons = new LinkedHashMap<>();
        persons.put("persons",pers);
        return persons;
    }
}
