// FoodService.java
package com.example.demo.service;

import com.example.demo.model.Food;
import com.example.demo.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    public Food getFoodById(int id) {
        return foodRepository.findById(id).orElse(null);
    }

    public Food updateFood(int id, Food food) {
        // Xử lý cập nhật food với id tương ứng
        // ...
        return foodRepository.save(food);
    }

    public Food addFood(Food food) {
        return foodRepository.save(food);
    }

    public void deleteFood(int id) {
        foodRepository.deleteById(id);
    }
}
