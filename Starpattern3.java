import java.util.Scanner;

public class Starpattern3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==(n/2)+1 || j==(n/2)+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  "); //2 white or  System.out.print("o ");
                }
            }
            System.out.println();
        }
    }
    
}
