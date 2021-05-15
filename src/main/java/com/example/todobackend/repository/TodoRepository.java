package com.example.todobackend.repository;

import com.example.todobackend.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TodoRepository extends MongoRepository<Todo, String> {
    Optional<Todo> findById(String id);
}

/*
   simple data access java -> 100s line of code -> mostly generic
   spring has saved all those 100s lines of code

   MongoRepository<
     Todo -> Type of Data in DB -> Id, Text, complete
     String -> Id to find it
   >

   select id from todoTable -> findById()
   select text from todoTable -> findByText()
   select complete from todoTable -> findByComplete()
   select * where id < 5 -> findByIdWhere()

   MongoRepository -> TodoRepository(interface) -> Class TodoRepositoryImplementation -> function define
 */
