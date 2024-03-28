package com.example.springleki.controller;

import com.example.springleki.model.Lek;
import com.example.springleki.service.LekService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LekiController {

    private final LekService lekService;


    public LekiController(LekService lekService) {
        this.lekService = lekService;
    }

    @GetMapping("/leki")
    public ResponseEntity<List<Lek>> getLeki() {
        return ResponseEntity.ok(lekService.findAllLekTest());
    }

}
