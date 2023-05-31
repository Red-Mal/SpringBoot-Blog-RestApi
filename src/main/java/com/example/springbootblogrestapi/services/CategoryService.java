package com.example.springbootblogrestapi.services;

import com.example.springbootblogrestapi.payload.CategoryDto;

import java.util.List;

/**
 * The interface Category service.
 */
public interface CategoryService {
    /**
     * Add category category dto.
     *
     * @param categoryDto the category dto
     * @return the category dto
     */
    CategoryDto addCategory(CategoryDto categoryDto);

    /**
     * Gets category.
     *
     * @param categoryId the category id
     * @return the category
     */
    CategoryDto getCategory(Long categoryId);

    /**
     * Gets all categories.
     *
     * @return the all categories
     */
    List<CategoryDto> getAllCategories();

    /**
     * Update category category dto.
     *
     * @param categoryDto the category dto
     * @param categoryId  the category id
     * @return the category dto
     */
    CategoryDto updateCategory(CategoryDto categoryDto, Long categoryId);

    /**
     * Delete category.
     *
     * @param categoryId the category id
     */
    void deleteCategory(Long categoryId);
}