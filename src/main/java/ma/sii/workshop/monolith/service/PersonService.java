package ma.sii.workshop.monolith.service;

import ma.sii.workshop.monolith.domain.Person;
import org.springframework.data.domain.Page;

public interface PersonService {

    Page<Person> fetchPersonsByPages(Integer page, Integer size);

    Person getPersonById(Long id);

    Person addPerson(Person person);

    Person updatePerson(Long id, Person person);

    void deletePerson(Long id);
}
