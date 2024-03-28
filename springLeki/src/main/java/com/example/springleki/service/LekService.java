package com.example.springleki.service;



import com.example.springleki.model.Lek;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class LekService {

    public List<Lek> findAllLekTest(){
        List<Lek> lekiTest = new ArrayList<>();
        lekiTest.add(new Lek("Ibuprofen 400mg", LocalDate.of(2025, 3, 1), 100));
        lekiTest.add(new Lek("Paracetamol 500mg", LocalDate.of(2024, 12, 31), 50));
        lekiTest.add(new Lek("Amoksycylina 500mg", LocalDate.of(2024, 8, 1), 20));
        lekiTest.add(new Lek("Azitromycyna 250mg", LocalDate.of(2024, 12, 10), 20));
        lekiTest.add(new Lek("Metformina 500mg", LocalDate.of(2027, 8, 22), 20));
        lekiTest.add(new Lek("Omeprazol 20mg", LocalDate.of(2024, 1, 12), 20));
        lekiTest.add(new Lek("Lisinopryl 10mg", LocalDate.of(2024, 8, 1), 20));
        lekiTest.add(new Lek("Atenolol 50mg", LocalDate.of(2024, 7, 5), 20));
        lekiTest.add(new Lek("Simvastatin 20mg", LocalDate.of(2024, 10, 29), 20));
        lekiTest.add(new Lek("Salbutamol 100mcg/ml", LocalDate.of(2025, 4, 30), 20));

        return lekiTest;
    }
}
