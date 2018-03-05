import javax.print.DocFlavor.STRING;
public class FizzBuzz {
    // convert Interger
        public String fizzBuzz(Integer number){
            // fizzbuzz logic here
            if(number %3 ==0){
                return "Fizz";
            }else if(number %5 ==0){
                return "Buzz";
            }else if(number %3 ==0 && number %5 ==0 ){
                return "FizzBuzz";
            }else{
                // valueOf Turns the para into a string
               return String.valueOf(number);
            }

        } 

    }
