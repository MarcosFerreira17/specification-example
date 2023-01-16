package com.example.specification.services;

import com.example.specification.models.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Map;

public interface IPersonService {
    Page<Person> getList(Map<String, String> filters, Pageable pageable);
}