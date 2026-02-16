package com.mony.Spring_boot.repository;

import java.util.List;

import com.mony.Spring_boot.model.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category save(Category c);

    List<Category> findAll();

    Object findById(Long id);

    void deleteById(Long id);
}
