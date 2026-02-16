package com.mony.Spring_boot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mony.Spring_boot.model.entity.Category;
import com.mony.Spring_boot.model.request.CategoryRequest;
import com.mony.Spring_boot.repository.CategoryRepository;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category create(CategoryRequest req) {
        Category c = new Category();
        c.setName(req.getName());
        c.setGender(req.getGender());
        return repository.save(c);
    }

    public List<Category> getAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Category getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    public Category update(Long id, CategoryRequest req) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}
