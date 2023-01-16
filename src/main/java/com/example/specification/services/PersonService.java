package com.example.specification.services;

import com.example.specification.models.Person;
import com.example.specification.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Map;

import static com.example.specification.specifications.PersonSpecification.filterWithOptions;

@Service
public class PersonService implements IPersonService {
    @Autowired private PersonRepository personRepository;

    @Override
    public Page<Person> getList(Map<String, String> filters, Pageable pageable) {
        return personRepository.findAll(filterWithOptions(filters), pageable);
    }
}
