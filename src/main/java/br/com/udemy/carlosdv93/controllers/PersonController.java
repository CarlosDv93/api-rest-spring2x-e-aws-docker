package br.com.udemy.carlosdv93.controllers;

import br.com.udemy.carlosdv93.data.vo.v1.PersonVO;
import br.com.udemy.carlosdv93.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person/v1")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(produces = { "application/json", "application/xml", "application/x-yaml"})
    public List<PersonVO> findAll() throws Exception {
        return personService.findAll();
    }

    @GetMapping(value = "{id}", produces = { "application/json", "application/xml", "application/x-yaml"})
    public PersonVO findById(@PathVariable Long id) throws Exception {
        return personService.findById(id);
    }

    @PostMapping(produces = { "application/json", "application/xml", "application/x-yaml"},
            consumes = { "application/json", "application/xml", "application/x-yaml"})
    public PersonVO createPerson(@RequestBody PersonVO person) throws Exception {
        return personService.create(person);
    }

    @PutMapping(produces = { "application/json", "application/xml", "application/x-yaml"},
            consumes = { "application/json", "application/xml", "application/x-yaml"})
    public PersonVO updatePerson(@RequestBody PersonVO person) throws Exception {
        return personService.create(person);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) throws Exception {
        personService.delete(id);
        return ResponseEntity.ok().build();
    }
}
