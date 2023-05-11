package com.embosoft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.embosoft.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
