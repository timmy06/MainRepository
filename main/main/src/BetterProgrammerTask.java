
public class BetterProgrammerTask {

    public static Change getCorrectChange(int cents) {
        /*
          Please implement this method to
          take cents as a parameter
          and return an equal amount in dollars and coins using the minimum number of
          coins possible.
          For example: 164 cents = 1 dollar, 2 quarters, 1 dime and 4 cents.
          Return null if the parameter is negative.

         */
        int dollars    =    cents / 100;
        cents = cents % 100;

        int quarters   =    (cents ) / 25;
        cents = cents % 25;

        int dime    =    (cents) / 10;
        cents = cents % 10;

        int nickels    =    (cents) / 5;
        cents = cents % 5;



        return  new Change(dollars, quarters, dime, nickels, cents);
    }


    public static int countWords(String s) {
        /*
          Please implement this method to return the word count in a given String.

          The words in the parameter String can be separated from each other by any nubmer
          of whitespace symbols (Character.isWhitespace()).
         */

        String[] words = s.split(" ");

        return words.length;
    }


    public static void main(String[] args) {

        System.out.println(getCorrectChange(264));

    }


    public static double getProbability(int Y, int X) {
        /*
          If you roll Y standard six-sided dice, what’s the probability that you get at least X 4s?
          To calculate that you should divide the number of comibnations with X or more 4s
          by the total number of possible combinations.
         */
        return  0; 
    }

    // Please do not change this class
    static class Change {
        private final int _dollars;
        private final int _quarters; //25 cents
        private final int _dimes; // 10 cents
        private final int _nickels; // 5 cents
        private final int _cents; // 1 cent

        @Override
        public String toString() {
            return "Change{" +
                    "_dollars=" + _dollars +
                    ", _quarters=" + _quarters +
                    ", _dimes=" + _dimes +
                    ", _nickels=" + _nickels +
                    ", _cents=" + _cents +
                    '}';
        }

        public Change(int dollars, int quarters, int dimes, int nickels, int cents) {
            _dollars = dollars;
            _quarters = quarters;
            _dimes = dimes;
            _nickels = nickels;
            _cents = cents;
        }


        public int getDollars() {
            return _dollars;
        }


        public int getQuarters() {
            return _quarters;
        }


        public int getDimes() {
            return _dimes;
        }


        public int getNickels() {
            return _nickels;
        }


        public int getCents() {
            return _cents;
        }
    }
}