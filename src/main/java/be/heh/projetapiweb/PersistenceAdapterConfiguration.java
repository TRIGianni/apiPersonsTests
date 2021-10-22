package be.heh.projetapiweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories
public class PersistenceAdapterConfiguration {
    @Autowired
    private PersonRepository personRepository;
    @Bean
    AllPersonUseCase getAllPersonUseCase(){
        return new PersonPersistenceAdapter(personRepository);
       }
}
