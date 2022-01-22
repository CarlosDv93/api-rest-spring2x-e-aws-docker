package br.com.udemy.carlosdv93.services;

import br.com.udemy.carlosdv93.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {
    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setName("Carlos");
        person.setLastName("David");
        person.setAddress("Itaúna - MG");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setName("Name" + i);
        person.setLastName("LastName");
        person.setAddress("Brasil");
        person.setGender("Gender");
        return person;
    }
}
