package br.com.toloni.apiratingclient.controller;

import br.com.toloni.apiratingclient.dto.ClientDto;
import br.com.toloni.apiratingclient.dto.RatingDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/api/rating")
public class RatingClientController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RatingDto post(
            @RequestBody ClientDto clientDto
    ) {
        System.out.println(clientDto.toString());

        UUID uuid = UUID.randomUUID();
        Integer stars = new Random().nextInt(5);

        var dto = new RatingDto(uuid, stars);
        System.out.println(dto.toString());
        return dto;
    }
}
