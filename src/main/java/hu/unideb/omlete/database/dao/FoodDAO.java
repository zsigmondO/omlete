package hu.unideb.omlete.database.dao;

import hu.unideb.omlete.database.entity.Food;

import java.util.List;

public interface FoodDAO {
    List<Food> findAllByCategoryId(Long id);
}
