package br.com.udemy.carlosdv93.controllers;

import br.com.udemy.carlosdv93.data.vo.PersonVO;
import br.com.udemy.carlosdv93.data.vo.v2.PersonVOV2;
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
    public PersonVO findById(@PathVariable Long id) throws Exception {
        return personService.findById(id);
    }

    @GetMapping
    public List<PersonVO> findAll() throws Exception {
        return personService.findAll();
    }

    @PostMapping
    public PersonVO createPerson(@RequestBody PersonVO person) throws Exception {
        return personService.create(person);
    }

    @PostMapping("/v2")
    public PersonVOV2 createPersonV2(@RequestBody PersonVOV2 person) throws Exception {
        return personService.createV2(person);
    }

    @PutMapping
    public PersonVO updatePerson(@RequestBody PersonVO person) throws Exception {
        return personService.create(person);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) throws Exception {
        personService.delete(id);
        return ResponseEntity.ok().build();
    }
}
