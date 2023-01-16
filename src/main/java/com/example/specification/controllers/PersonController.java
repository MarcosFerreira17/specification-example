package com.example.specification.controllers;

import com.example.specification.models.Person;
import com.example.specification.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/specifications/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public Page<Person> getList(@RequestParam(required = false) Map<String, String> filters,
                                Pageable page) {
        return personService.getList(filters, page);
    }
}
