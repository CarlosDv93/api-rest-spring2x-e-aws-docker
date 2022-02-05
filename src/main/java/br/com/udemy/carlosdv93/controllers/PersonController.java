package br.com.udemy.carlosdv93.controllers;

import br.com.udemy.carlosdv93.model.Person;
import br.com.udemy.carlosdv93.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "{id}")
    public Person findById(@PathVariable Long id) throws Exception {
        return personService.findById(id);
    }

    @GetMapping
    public List<Person> findAll() throws Exception {
        return personService.findAll();
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) throws Exception {
        return personService.create(person);
    }

    @PutMapping
    public Person updatePerson(@RequestBody Person person) throws Exception {
        return personService.create(person);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) throws Exception {
        personService.delete(id);
        return ResponseEntity.ok().build();
    }
}
