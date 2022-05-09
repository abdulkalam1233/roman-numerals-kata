public class RomanNumberGenerator {

    public RomanNumberGenerator() {
    }

    public String generateRomanNumber(int decimal) {
        String result = "";
        for (RomanToDecimal romanToDecimal: RomanToDecimal.values()) {
            while (decimal >= romanToDecimal.decimal) {
                result += romanToDecimal.roman;
                decimal -= romanToDecimal.decimal;
            }
        }
        for(int i = 0; i < decimal; i ++ ) {
            result += "I";
        }
        return result;
    }

    enum RomanToDecimal {
        THOUSAND("M", 1000),
        NINE_HUNDRED("CM", 900),
        FIVE_HUNDRED("D", 500),
        FOUR_HUNDRED("CD", 400),
        HUNDRED("C", 100),
        NINETY("XC", 90),
        FIFTY("L", 50),
        FORTY("XL", 40),
        TEN("X", 10),
        NINE("IX", 9),
        FIVE("V", 5),
        FOUR("IV", 4),
        ONE("I", 1);

        private final String roman;
        private final int decimal;

        RomanToDecimal(String roman, int decimal) {
            this.roman = roman;
            this.decimal = decimal;
        }
    }
}
