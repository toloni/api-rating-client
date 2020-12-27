package br.com.toloni.apiratingclient.controller;

import br.com.toloni.apiratingclient.dto.ClientDto;
import br.com.toloni.apiratingclient.dto.RateDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/api/rating")
public class RatingClientController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RateDto post(
            @RequestBody ClientDto clientDto
    ) {
        UUID uuid = UUID.randomUUID();
        Integer stars = new Random().nextInt(5);

        return new RateDto(uuid, stars);
    }
}
