package com.FreeHolidays.Back.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.FreeHolidays.Back.Entities.Hebergement;

@Repository
public interface HebergementRepository extends CrudRepository<Hebergement, Integer> {
    
    
}
