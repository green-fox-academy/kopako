package com.seadog.todosh2.repository;


import com.seadog.todosh2.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
