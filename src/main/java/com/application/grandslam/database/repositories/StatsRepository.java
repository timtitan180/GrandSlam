package com.application.grandslam.database.repositories;

import com.application.grandslam.database.entities.Stats;
import com.application.grandslam.database.services.StatService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StatsRepository extends CrudRepository<Stats,Integer> {
//
//    @Query(value= "SELECT s FROM Stats s WHERE s.name LIKE CONCAT('%',:username,'%')")
//    public List<Stats> search(@Param("keyword") String keyword);


}
