package com.anurag.RestaurentModel.configuration;

import com.anurag.RestaurentModel.model.Restaurent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
class BeanManager {

    @Bean
    public List<Restaurent> getInitializedList()
    {
        Restaurent initRestaurent = new Restaurent(0,"demoRestaurant","demoAddress","8787878","demo dish",25);
        List<Restaurent> initList = new ArrayList<>();
        initList.add(initRestaurent);

        return initList;
    }
}
