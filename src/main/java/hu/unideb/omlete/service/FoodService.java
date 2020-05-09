package hu.unideb.omlete.service;

import hu.unideb.omlete.database.dao.FoodDAO;
import hu.unideb.omlete.database.dao.impl.FoodDAOImpl;
import hu.unideb.omlete.database.entity.Food;

import java.util.List;

public class FoodService {

    private FoodDAO foodDao = new FoodDAOImpl();


    public List<Food> findAllByCategoryId(Long id) {
        return foodDao.findAllByCategoryId(id);
    }
}