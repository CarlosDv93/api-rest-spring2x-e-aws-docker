package br.com.udemy.carlosdv93.services;

import br.com.udemy.carlosdv93.model.Person;
import org.springframework.stereotype.Service;

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
}
