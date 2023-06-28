# Restaurant Model




## Language and Framework 

```bash
 Java and SpringBoot
```

## Data Flow

 1. Controller (RestaurentController.java)

```bash
  getAllRestaurent()
  getRestaurentById()
  addRestaurent()
  DeleteRestaurentById()
  UpdateRestaurent()
```
2. Service  (RestroService.java)

```bash
 DeleteRestaurent()
 getAllRestaurent()
 createRestaurent()
 getRestaurentById()
 updateRestaurentSpecialty()
```
3. model  (Restaurent.java)

```bash
Restaurent()
```
4. Repository  (RestaurentRepo.java)

```bash
 getRestaurent()
 delete()
```
5. Configuration  (Beanmanager.java)

```bash
getInitializedList()
```




## Data Structure Used

```bash
 List, ArrayList
```



## Project Summary

Restaurant Model is a model in which we can get all restaurent by endpoints/api. 
 
 #### Features

- you can Add/Create Restaurant.
- you can Get all Restaurant details.
- you can Get specific Restaurant details() by Restaurent id.
- you can Update specific Restaurant Speciality by Restaurent id.
- you can Delete/Remove specific Restaurant details by Restaurent id.
