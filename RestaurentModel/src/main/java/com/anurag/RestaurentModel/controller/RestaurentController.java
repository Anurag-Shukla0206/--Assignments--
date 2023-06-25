package com.anurag.RestaurentModel.controller;

import com.anurag.RestaurentModel.model.Restaurent;
import com.anurag.RestaurentModel.service.RestaurentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurentController {
    @Autowired
    RestaurentService restaurentService;



    @GetMapping(value = "restaurent")
    public List<Restaurent> getAllRestaurent()
    {
        return restaurentService.getAllRestaurent();
    }

    @GetMapping("restaurent/search/{restaurentId}")
    public Restaurent getRestaurentByid(@PathVariable Integer restaurentId){
        return restaurentService.getRestaurentById(restaurentId);
    }

    @PostMapping("restaurent") // add user
    public String addRestaurent(@RequestBody Restaurent restaurent)
    {
        return restaurentService.createRestaurent(restaurent);
    }

    @DeleteMapping("restaurent/delete/{restaurentId}")

    public String DeleteRestaurent (@PathVariable Integer restaurentId ){

        return restaurentService.DeleteRestaurent(restaurentId);
    }

    @PutMapping("Restaurent/{restaurentId}/Speciality/{restaurentSpeciality}")
    public String UpdateRestaurent(@PathVariable Integer restaurentId,@PathVariable String restaurentSpeciality)
    {
        return restaurentService.updateRestaurentSpeciality(restaurentId,restaurentSpeciality);
    }


}
