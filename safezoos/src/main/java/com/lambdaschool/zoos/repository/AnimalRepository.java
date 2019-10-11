package com.lambdaschool.zoos.repository;

import com.lambdaschool.zoos.model.Animal;
import com.lambdaschool.zoos.view.AnimalCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.ArrayList;
import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
    Animal findByAnimaltype(String type);

 @Query(value="select a.animaltype, count(z.zooid) as animalCount FROM animal a LEFT JOIN zooanimals z ON z.animalid = a.animalid GROUP BY a.animalid, a.animaltype",
  nativeQuery = true)
    List<AnimalCount> findAnimalsAndZoos();

}
