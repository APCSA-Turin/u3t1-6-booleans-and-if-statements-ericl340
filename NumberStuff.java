public class NumberStuff {

   public NumberStuff() { }

   public String positiveZeroOrNegative(int num) {
    return num > 0 ? num + " is a positive number" : num == 0 ? "0 isn't positive or negative" : num + " is a negative number";
   }
}