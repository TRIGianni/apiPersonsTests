package be.heh.projetapiweb;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "personnes")
@Data
public class PersonJpaEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idperson")
    private Long idPerson;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private int age;
}
