package com.TMDT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TMDT.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
