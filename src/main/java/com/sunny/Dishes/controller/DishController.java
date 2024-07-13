package com.sunny.Dishes.controller;


import com.sunny.Dishes.model.Dish;
import com.sunny.Dishes.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dishes")
public class DishController {

    @Autowired
    private DishService dishService;

    @Autowired
    private SimpMessagingTemplate template;

    @GetMapping
    public List<Dish> getAllDishes(){
        return dishService.getAllDishes();
    }

    @PostMapping("{dishId}/toggle")
    public Dish toggleDishPublishedStatus(@PathVariable int dishId){
        Dish updatedDish = dishService.toggleDishPublishedStatus(dishId);
        template.convertAndSend("/topic/dishes", updatedDish);
        return updatedDish;

    }


}
