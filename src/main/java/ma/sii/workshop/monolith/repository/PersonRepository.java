package ma.sii.workshop.monolith.repository;

import ma.sii.workshop.monolith.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends /*PersonRegistry, */JpaRepository<Person, Long> {
    Page<Person> findAll(Pageable pageable);
}
