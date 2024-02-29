package business;

import core.logging.BaseLogger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private BaseLogger[] baseLoggers;

    public CategoryManager(CategoryDao categoryDao, BaseLogger[] baseLoggers) {
        this.categoryDao = categoryDao;
        this.baseLoggers = baseLoggers;
    }

    public void addCategory(Category category) {
        for (Category item : categoryDao.getAllCategories()) {
            if (item.getName().equals(category.getName())) {
                throw new RuntimeException("Category name already exists.");
            }
        }

        categoryDao.addCategory(category);

        for (BaseLogger baseLogger : baseLoggers) {
            baseLogger.log("Category added : " + category.getName());
        }
    }

    public void updateCategory(Category category) {
        for (Category item : categoryDao.getAllCategories()) {
            if (item.getName().equals(category.getName())) {
                throw new RuntimeException("Category name already exists.");
            }
        }

        categoryDao.updateCategory(category);

        for (BaseLogger baseLogger : baseLoggers) {
            baseLogger.log("Category updated : " + category.getName());
        }
    }

    public void deleteCategory(Category category) {
        categoryDao.deleteCategory(category);

        for (BaseLogger baseLogger : baseLoggers) {
            baseLogger.log("Category deleted : " + category.getName());
        }
    }

    public void listCategories() {
        List<Category> categories = categoryDao.getAllCategories();

        for (Category category : categories) {
            System.out.println(category.getName());
        }

        System.out.println("Categories listed.");

        for (BaseLogger logger : baseLoggers) {
            logger.log("Categories listed.");
        }
    }

}