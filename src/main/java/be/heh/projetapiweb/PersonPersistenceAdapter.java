package be.heh.projetapiweb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class PersonPersistenceAdapter implements AllPersonUseCase{

    private final PersonRepository personRepository;

    @Override
    public Map<String, Object> getPersons() {
        List<PersonJpaEntity> personJpaList = personRepository.findAll();
        //mapper
        List<Person> personList = new ArrayList<>();
        Map<String,Object> mapPers = new HashMap<>();

        for (PersonJpaEntity pers: personJpaList) {
            personList.add(new Person(pers.getIdPerson(),pers.getFirstName(),pers.getLastName(),pers.getAge()));
        }
        //---
        mapPers.put("personnes",personList);
        return mapPers;
    }
}
