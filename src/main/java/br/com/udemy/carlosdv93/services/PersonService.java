package br.com.udemy.carlosdv93.services;

import br.com.udemy.carlosdv93.converter.DozerConverter;
import br.com.udemy.carlosdv93.data.model.Person;
import br.com.udemy.carlosdv93.data.vo.PersonVO;
import br.com.udemy.carlosdv93.exceptions.ResourceNotFoundException;
import br.com.udemy.carlosdv93.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public PersonVO create(PersonVO person){
        var entity = DozerConverter.parseObject(person, Person.class);
        var vo = DozerConverter.parseObject(personRepository.save(entity), PersonVO.class);
        return vo;
    }

    public List<PersonVO> findAll() {
        return DozerConverter.parseListObjects(personRepository.findAll(), PersonVO.class);
    }


    public PersonVO findById(Long id) {
        var entity = personRepository.findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("No records found for this ID"));

        return DozerConverter.parseObject(entity, PersonVO.class);
    }

    public PersonVO update(PersonVO p){

        var entity = personRepository.findById(p.getId())
                .orElseThrow( () -> new ResourceNotFoundException("No records found for this ID"));

        entity.setName(p.getName());
        entity.setLastName(p.getLastName());
        entity.setAddress(p.getAddress());
        entity.setGender(p.getGender());

        var vo = DozerConverter.parseObject(personRepository.save(entity), PersonVO.class);
        return vo;
    }

    public void delete(Long id){
        Person entity = personRepository.findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("No records found for this ID"));

        personRepository.delete(entity);
    }


}
