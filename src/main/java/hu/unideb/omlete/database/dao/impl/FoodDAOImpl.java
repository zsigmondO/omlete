package hu.unideb.omlete.database.dao.impl;

import hu.unideb.omlete.database.EmfHelper;
import hu.unideb.omlete.database.dao.FoodDAO;
import hu.unideb.omlete.database.entity.Food;

import javax.persistence.*;
import java.util.List;

public class FoodDAOImpl implements FoodDAO {

    private EntityManager em = EmfHelper.getEntityManager();

    @Override
    public List<Food> findAllByCategoryId(Long id) {
        TypedQuery<Food> typedQuery = em.createQuery("SELECT f FROM Food f WHERE f.category.id = :id", Food.class);
        typedQuery.setParameter("id", id);

        System.out.println("Printing by id: " + id);
        return typedQuery.getResultList();
    }
}