import java.util.HashMap;

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
    
    public static void wordCounter(String input) {
    	
    	//Write a method that takes a string of text and counts how many times each word appears.
    	
    	//Lowercase everything and get rid of punctuation.
    	String text = input.toLowerCase().replaceAll("[^a-z ]", "");
    	
    	//Put words into an array.
    	String[] words = text.split("\\s+");
    	
    	//Initialize hashmap
    	HashMap<String,Integer> counts = new HashMap<>();
    	
    	//Start looping through words
    	for(int i = 0; i < words.length; i++) {
    		if (words[i].isEmpty()) continue; // skip blanks
            if (counts.containsKey(words[i])) {
                counts.put(words[i], counts.get(words[i]) + 1);
            } else {
                counts.put(words[i], 1);
            }
    	}
    	
    	//Now give it to me straight doc
    	for (String word : counts.keySet()) {
            System.out.println(word + " -> " + counts.get(word));
        }
    }
    
    public static void squareMatrixDiagSum(int[][] matrix) {
    	int counter = 0;
    	boolean flag = true;
    	//to make sure the matrix is square, each row must contain the same length as the columns
    	while(true) {
    		if (counter == matrix.length){
    			break;
    		} else if(matrix[counter].length != matrix.length) {
    			flag = false;
    			break;
    		}
    		counter++;
    	}
    	
    	if(!flag) {
    		System.out.println("Matrix not square");
    		return;
    	}
    	
    	int sum = 0, j;
    	for(int i = 0; i < matrix.length; i++) {
    		j = matrix.length - (i + 1);
    		if(i != j) {
    			sum += matrix[i][i] + matrix[i][j];
    		} else {
    			sum += matrix[i][i];
    		}
    	}
    	System.out.println(sum);
    }
    
	public static void main(String[] args) {
		//fizzBuzzBang();
		//System.out.println(isPalindrome("Race car"));
		//int[] testList = {10, 4, 7, 10, 8};
		//System.out.println(secondLargest(testList));
    	//wordCounter("Hello, hello world! This is a world of code. Hello again.");
		int[][] test = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		squareMatrixDiagSum(test);
	}
}
