package com.anurag.RestaurentModel.repository;

import com.anurag.RestaurentModel.model.Restaurent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurentRepo {
    @Autowired
    private List<Restaurent> RestaurentList;
    public List<Restaurent> getRestaurent() {
        return RestaurentList;
    }


    public void delete(Restaurent restaurent) {
        RestaurentList.remove(restaurent);
    }
}
