package com.mony.Spring_boot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mony.Spring_boot.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    com.mony.Spring_boot.model.entity.Category save(com.mony.Spring_boot.model.entity.Category c);

    List<Category> findAll();

    Optional findById(Long id);

    void deleteById(Long id);

}
