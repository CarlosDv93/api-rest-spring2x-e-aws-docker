package br.com.udemy.carlosdv93.repository;

import br.com.udemy.carlosdv93.data.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
