package com.anurag.RestaurentModel.service;

import com.anurag.RestaurentModel.model.Restaurent;
import com.anurag.RestaurentModel.repository.RestaurentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurentService {
    @Autowired

    RestaurentRepo restaurentRepo;
    private Integer restaurentId;

    public  String DeleteRestaurent(Integer restaurentId) {
        for(Restaurent restaurent : getAllRestaurent())
        {
            if(restaurent.getRestaurentId().equals(restaurentId))
            {

                restaurentRepo.delete(restaurent);

                return "user removed for userID:" + restaurentId;
            }
        }
        return  "User"+ restaurentId+ " is not deleted as it doesn't exist" ;
    }

    public List<Restaurent> getAllRestaurent() {

        return restaurentRepo.getRestaurent();
    }


    public String createRestaurent(Restaurent restaurent) {
        List<Restaurent> originalList = getAllRestaurent();
        originalList.add(restaurent);
        return "New restaurent added";
    }


    public Restaurent getRestaurentById(Integer restaurentId) {
        this.restaurentId = restaurentId;

        for(Restaurent restaurent : restaurentRepo.getRestaurent())
        {
            if(restaurent.getRestaurentId().equals(restaurentId))
            {
                return restaurent;
            }
        }
        throw new IllegalStateException("Restaurent not found");
    }


    public String updateRestaurentSpeciality(Integer restaurentId, String restaurentSpeciality) {

        for(Restaurent restaurent: restaurentRepo.getRestaurent())
        {
            if(restaurent.getRestaurentId().equals(restaurentId))
            {
                restaurent.setRestaurentSpeciality(restaurentSpeciality);
                return "Restaurent Speciality updated for restaurent ID:" + restaurentId;
            }
        }

        return "Restaurent not found for restaurent ID: " + restaurentId;
    }
}
