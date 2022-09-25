package com.romannumeral.roman.controller;

import com.romannumeral.roman.service.RomanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/arabic2roman")
@AllArgsConstructor
public class RomanRestController {

    private final RomanService romanService;

    @GetMapping
    public String convertArabic2Roman(@PathParam("arabicNumber") Integer arabicNumber){
        return romanService.convertArabic2Roman(arabicNumber);
    }

}
