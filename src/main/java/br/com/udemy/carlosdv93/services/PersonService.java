package br.com.udemy.carlosdv93.services;

import br.com.udemy.carlosdv93.data.model.Person;
import br.com.udemy.carlosdv93.exceptions.ResourceNotFoundException;
import br.com.udemy.carlosdv93.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Person create(Person person){
        return personRepository.save(person);
    }

    public Person update(Person p){

        Person entity = personRepository.findById(p.getId())
                .orElseThrow( () -> new ResourceNotFoundException("No records found for this ID"));

        entity.setName(p.getName());
        entity.setLastName(p.getLastName());
        entity.setAddress(p.getAddress());
        entity.setGender(p.getGender());

        personRepository.save(entity);
        return entity;
    }

    public void delete(Long id){
        Person entity = personRepository.findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("No records found for this ID"));

        personRepository.delete(entity);
    }

    public Person findById(Long id) {
        return personRepository.findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("No records found for this ID"));
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

}
