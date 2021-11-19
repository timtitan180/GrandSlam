package com.application.grandslam.database.repositories;

import com.application.grandslam.database.entities.Stats;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatsRepository extends CrudRepository<Stats,Integer> {

    public void deleteById(Integer statsId);

//
//    @Query(value= "SELECT s FROM Stats s WHERE s.name LIKE CONCAT('%',:username,'%')")
//    public List<Stats> search(@Param("keyword") String keyword);


}
