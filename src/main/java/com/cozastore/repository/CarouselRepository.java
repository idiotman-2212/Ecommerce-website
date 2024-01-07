package com.cozastore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cozastore.entity.CarouselEntity;
@Repository
public interface CarouselRepository extends JpaRepository<CarouselEntity, Integer>{

}
