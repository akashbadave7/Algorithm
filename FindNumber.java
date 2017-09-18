import java.util.Scanner;

public class FindNumber {

	// to guess number using binary search
    public static int search(int guess,int low, int high) {

    	if ((high - low) == 1) return low;
        int mid = low + (high - low) / 2;
        System.out.print("Is it less than "+mid+"? ");
        boolean ans = false;
        if (guess<mid) 
        {
        	System.out.println(!ans);
        	return search(guess,low, mid);
        }
        else
        {
        	System.out.println(ans);
        	return search(guess,mid, high);
       	}
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    	int k = s.nextInt();
        int n = (int) Math.pow(2, k);
        System.out.println("Think of an integer between "+0+" "+(n-1));
    	System.out.println("Guess the number");
    	int guess = s.nextInt();
        int secret = search(guess,0, n);
        System.out.println("Your number is\n"+secret);
        s.close();
    }

}


