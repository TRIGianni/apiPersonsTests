package be.heh.projetapiweb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.jdbc.Sql;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import({PersonPersistenceAdapter.class})
public class PersonPersistenceAdapterTests {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonPersistenceAdapter personPersistenceAdapter;

    @Test
    @Sql("PersonPersistenceAdapterTests.sql")
    void getAllPersons(){

        Map<String, Object> map = new HashMap<>();
        ArrayList<Person> pers;

        map = personPersistenceAdapter.getPersons();

        pers = (ArrayList<Person>)map.get("personnes");


        //System.out.println(pers.get(1).getFirstName());

        assertEquals("tata1",pers.get(1).getFirstName());
        assertEquals("tutu1",pers.get(1).getLastName());
        assertEquals(21,pers.get(1).getAge());

    }
}
