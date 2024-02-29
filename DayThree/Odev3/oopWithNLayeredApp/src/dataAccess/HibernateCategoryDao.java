package dataAccess;

import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements CategoryDao {
    private List<Category> categories = new ArrayList<>();

    @Override
    public void addCategory(Category category) {
        categories.add(category);
        System.out.println("Category added to the database by Hibernate : " + category.getName());
    }

    @Override
    public void updateCategory(Category category) {
        System.out.println("Category update in the database by Hibernate : " + category.getName());
    }

    @Override
    public void deleteCategory(Category category) {
        System.out.println("Category delete from the database by Hibernate : " + category.getName());
    }

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }
}