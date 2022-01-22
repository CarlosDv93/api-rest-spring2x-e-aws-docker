package br.com.udemy.carlosdv93.controllers;

import br.com.udemy.carlosdv93.model.Person;
import br.com.udemy.carlosdv93.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable String id) throws Exception {
        return personService.findById(id);
    }

    @GetMapping
    public List<Person> findAll() throws Exception {
        return personService.findAll();
    }
}
