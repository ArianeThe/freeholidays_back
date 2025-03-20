package com.FreeHolidays.Back.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FreeHolidays.Back.Entities.Hebergement;
import com.FreeHolidays.Back.Services.HebergementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping
public class HebergementController {

    @Autowired
    private HebergementService hebergementService;

    /*Récupérer l'hébergement via l'Id */
    @GetMapping("/Entities/Hebergement/{id_auto}")
    public Hebergement getHebergementById(@PathVariable("id_auto")final Integer id_auto){
        Optional<Hebergement> hebergement = hebergementService.getHebergementById(id_auto);
        return hebergement.orElse(null);
    }
    
    
}
