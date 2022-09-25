package com.romannumeral.roman;

import com.romannumeral.roman.model.ArabicToRomanConverter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
class RomanApplicationTests {

    @Test
    void convertInt2RomanAndPrint100Num() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "\t =\t " +
                    ArabicToRomanConverter.convertArabic2Roman(i));
        }
    }

    @Test
    void convertInt2RomanNum1() {
        assertThat(ArabicToRomanConverter.convertArabic2Roman(1)).isEqualTo("I");
    }

    @Test
    void convertInt2RomanNum14() {
        assertThat(ArabicToRomanConverter.convertArabic2Roman(14)).isEqualTo("XIV");
    }

    @Test
    void convertInt2RomanNum16() {
        assertThat(ArabicToRomanConverter.convertArabic2Roman(16)).isEqualTo("XVI");
    }

    @Test
    void convertInt2RomanNum176() {
        assertThat(ArabicToRomanConverter.convertArabic2Roman(176)).isEqualTo("CLXXVI");
    }

    @Test
    void convertInt2RomanNumIllegalArgumentException400() {
        int testingNumber = 4000;
        assertThatThrownBy(() -> {
            ArabicToRomanConverter.convertArabic2Roman(testingNumber);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Range for converting arabic to roman numbers from 1 to 3999, was requested: " + testingNumber);
    }

    @Test
    void convertInt2RomanNumIllegalArgumentException0() {
        int testingNumber = 0;
        assertThatThrownBy(() -> {
            ArabicToRomanConverter.convertArabic2Roman(testingNumber);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Range for converting arabic to roman numbers from 1 to 3999, was requested: " + testingNumber);
    }

}
