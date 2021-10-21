package be.heh.projetapiweb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PersonRepository extends JpaRepository<PersonJpaEntity,Long> {

}
