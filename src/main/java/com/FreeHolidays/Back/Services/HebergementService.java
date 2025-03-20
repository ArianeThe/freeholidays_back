package com.FreeHolidays.Back.Services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.FreeHolidays.Back.Entities.Hebergement;
import com.FreeHolidays.Back.Repositories.HebergementRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Service
@Slf4j
public class HebergementService {
    @Autowired
    private HebergementRepository hebergementRepository;

    public Optional<Hebergement> getHebergementById (final Integer id_auto) {
        return hebergementRepository.findById(id_auto);
    }

    public Iterable<Hebergement> getHebergemnt(){
        return hebergementRepository.findAll();
    }


}
