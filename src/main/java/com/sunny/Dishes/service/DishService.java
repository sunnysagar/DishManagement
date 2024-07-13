package com.sunny.Dishes.service;

import com.sunny.Dishes.model.Dish;
import com.sunny.Dishes.repository.DishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {

    private final DishRepository dishRepository;

    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    public List<Dish> getAllDishes(){
        return dishRepository.findAll();
    }

    public Dish toggleDishPublishedStatus(int dishId){
        Dish dish = dishRepository.findById(dishId).orElseThrow();
        dish.setPublished(!dish.isPublished());
        return dishRepository.save(dish);
    }
}
