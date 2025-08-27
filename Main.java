public class Main
{
    public static void fizzBuzzBang(){
        
        //Write a function that print the numbers from 1 to 50, but for multiples of 3, print "Fizz".
        //For multiples of 5, print "Buzz".
        //For multiples of 3 and 5, print "FizzBuzz".
        //For multiples of 7, print "Bang".
    
        String word;
        for(int i = 1; i <= 50; i++){
            word = "";
            if(i % 3 == 0)
                word += "Fizz";
            if(i % 5 == 0)
                word += "Buzz";
            if(i % 7 == 0)
                word += "Bang";
            
            if(word.equals("")){
                word = Integer.toString(i);
            }
            System.out.println(word);
        }
    }
    
    public static boolean isPalindrome(String input){
        
        //Write a function that checks if a word is a palindrome.
        
        input = input.replaceAll("\\s", "").toLowerCase();
        StringBuilder reverse = new StringBuilder(input).reverse();
        return reverse.toString().equals(input);
    }
    
    public static int secondLargest(int[] a){
        
        //Write a method that takes an array of integers and returns
        //the second largest number in the array.
        
        int first = 0, second = 0;
        
        if(a.length >= 2){
            for (int i = 0; i < a.length; i++) {
                if (a[i] > first) {
                    second = first;
                    first = a[i];
                } else if (a[i] > second && a[i] != first) {
                    second = a[i];
                }
            }
            return second;
        } else {
            System.out.println("Array too small");
            return -1;
        }
    }
    
	public static void main(String[] args) {
		fizzBuzzBang();
		System.out.println(isPalindrome("Race car"));
		int[] testList = {10, 4, 7, 10, 8};
		System.out.println(secondLargest(testList));
	}
}
