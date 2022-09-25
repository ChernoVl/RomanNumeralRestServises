package com.romannumeral.roman.service.impl;

import com.romannumeral.roman.model.ArabicToRomanConverter;
import com.romannumeral.roman.service.RomanService;
import org.springframework.stereotype.Service;

@Service
public class RomanServiceImpl implements RomanService {

    @Override
    public String convertArabic2Roman(int arabicNumber) {
        return ArabicToRomanConverter.convertArabic2Roman(arabicNumber);
    }

}
