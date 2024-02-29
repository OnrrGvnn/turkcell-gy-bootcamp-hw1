package dataAccess;

import entities.Category;

import java.util.List;

public interface CategoryDao {
    void addCategory(Category category);

    void updateCategory(Category category);

    void deleteCategory(Category category);

    List<Category> getAllCategories();
}