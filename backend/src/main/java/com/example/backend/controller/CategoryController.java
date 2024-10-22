package com.example.backend.controller;

import com.example.backend.exceptions.CategoryNotFoundException;
import com.example.backend.model.Category;
import com.example.backend.repository.CategoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    private final CategoryRepository repository;

    CategoryController(CategoryRepository repository){
        this.repository = repository;
    }

    @GetMapping("/categories")
    List<Category> all(){
        return repository.findAll();
    }

    @PostMapping("/categories")
    Category newCategory(@RequestBody Category newCategory){
        return (Category) repository.save(newCategory);
    }

    @GetMapping("/categories/{id}")
    Category one(@PathVariable int id) throws Throwable {
        return (Category) repository.findById(id).orElseThrow(()-> new CategoryNotFoundException(id));

    }

    @DeleteMapping("/categories/{id}")
    void deleteEmployee(@PathVariable int id) {
        repository.deleteById(id);
    }
}
