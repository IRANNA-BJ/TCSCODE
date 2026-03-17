import java.util.Scanner;

public class Palindromestring {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x= sc.nextLine();
        int i=0;
        int j=x.length()-1;
        
        while(i<j){
            if(x.charAt(i) != x.charAt(j)){
                System.out.println("not polindrome");
                return;

            }
            i++;
            j--;
        }
        System.out.println("polindrome");
    }
    
}
