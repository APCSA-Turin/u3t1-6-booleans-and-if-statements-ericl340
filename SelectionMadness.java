public class SelectionMadness {

    // no instance variables //
    
    public SelectionMadness() { }
  
    /* Returns 1 of 5 randomly generated fortunes as a string;
       you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
      switch((int)(Math.random() * 5)){
         case 0:
            return "you will have a great day";
         case 1:
            return "your code will run first try";
         case 2:
            return "there won't be homework today";
         case 3:
            return "You will have a fun adventure";
         default:
            return "You'll see a cat";
       }
    }
  
    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
       return num1 > num2 ? num1 > num3 ? num1 : num3 : num2 > num3 ? num2 : num3;
    }
  }