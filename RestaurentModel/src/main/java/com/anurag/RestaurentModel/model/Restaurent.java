package com.anurag.RestaurentModel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurent {

    private Integer restaurentId;

    private String restaurentName;

    private String restaurentAddress;

    private String restaurentNumber;

    private String restaurentSpeciality;

    private Integer restaurentTotalStaff;
}
