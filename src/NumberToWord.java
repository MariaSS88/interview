public class NumberToWord
{
    static String one[] = {"", "one ", "two ", "three ", "four ",
            "five ", "six ", "seven ", "eight ",
            "nine ", "ten ", "eleven ", "twelve ",
            "thirteen ", "fourteen ", "fifteen ",
            "sixteen ", "seventeen ", "eighteen ",
            "nineteen "
    };

    static String ten[] = {"", "", "twenty ", "thirty ", "forty ",
            "fifty ", "sixty ", "seventy ", "eighty ",
            "ninety "
    };

    // n is 1- or 2-digit number
    static String numToWords(int n, String s) {
        String str = "";
        // if n is more than 19, divide it
        if (n > 19) {
            if (n > 99){
                str += one[n / 100] + "hundred ";
            }
            str += ten[(n / 10) % 10] + one[n % 10];
        } else {
            str += one[n];
        }
        // if n is non-zero
        if (n != 0) {
            str += s;
        }
        return str;
    }

    // Function to print a given number in words
    static String convertToWords(long n) {
        // stores word representation of given number n
        String out = "";
        out += numToWords((int) (n / 1000000000), "billion ");

        // handles digits at ten millions and hundred
        // millions places (if any)
        out += numToWords((int) ((n / 1000000)%1000), "million ");

        // handles digits at thousands and tens thousands
        // places (if any)
        out += numToWords((int) ((n / 1000) % 1000), "thousand ");

        // handles digits at ones and tens places (if any)
        out += numToWords((int) (n % 1000), "");

        return out;
    }

    public static void main(String[] args) {
        long n = 1234237764;
        System.out.printf(convertToWords(n));
    }
}
