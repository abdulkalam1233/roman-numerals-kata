import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberGeneratorShould {

    @Test
    void generate_a_roman_number_for_given_decimal_number() {
        RomanNumberGenerator romanNumberGenerator = new RomanNumberGenerator();

        assertThat(romanNumberGenerator.generateRomanNumber(1)).isEqualTo("I");
        assertThat(romanNumberGenerator.generateRomanNumber(2)).isEqualTo("II");
        assertThat(romanNumberGenerator.generateRomanNumber(3)).isEqualTo("III");

        assertThat(romanNumberGenerator.generateRomanNumber(4)).isEqualTo("IV");
        assertThat(romanNumberGenerator.generateRomanNumber(5)).isEqualTo("V");
        assertThat(romanNumberGenerator.generateRomanNumber(6)).isEqualTo("VI");

        assertThat(romanNumberGenerator.generateRomanNumber(9)).isEqualTo("IX");
        assertThat(romanNumberGenerator.generateRomanNumber(10)).isEqualTo("X");
        assertThat(romanNumberGenerator.generateRomanNumber(11)).isEqualTo("XI");
        assertThat(romanNumberGenerator.generateRomanNumber(12)).isEqualTo( "XII");


        assertThat(romanNumberGenerator.generateRomanNumber(20)).isEqualTo("XX");
        assertThat(romanNumberGenerator.generateRomanNumber(29)).isEqualTo("XXIX");

        assertThat(romanNumberGenerator.generateRomanNumber(40)).isEqualTo("XL");
        assertThat(romanNumberGenerator.generateRomanNumber(45)).isEqualTo("XLV");

        assertThat(romanNumberGenerator.generateRomanNumber(50)).isEqualTo("L");
        assertThat(romanNumberGenerator.generateRomanNumber(55)).isEqualTo("LV");

        assertThat(romanNumberGenerator.generateRomanNumber(800)).isEqualTo("DCCC");
        assertThat(romanNumberGenerator.generateRomanNumber(900)).isEqualTo("CM");
        assertThat(romanNumberGenerator.generateRomanNumber(1000)).isEqualTo("M");

        assertThat(romanNumberGenerator.generateRomanNumber(1999)).isEqualTo("MCMXCIX");


    }
}
