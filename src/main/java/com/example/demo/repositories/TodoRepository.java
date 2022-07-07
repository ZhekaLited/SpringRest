package com.example.demo.repositories;

import com.example.demo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository <Todo, Long> {
}
