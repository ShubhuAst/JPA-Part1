package com.example.jpahibernate.exercise.repos;

import com.example.jpahibernate.exercise.pojo.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location,Integer> {
}
