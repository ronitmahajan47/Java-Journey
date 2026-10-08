//Pattern

import java.util.Scanner;
public class Main21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n ,i ,j ,k;

        System.out.print("\nEnter a NUMBER = ");
        n = scan.nextInt();
        
        System.out.println();
        if(n<=9 && n>0){
            for(i=1 ; i<=n ; i++){
                for(j=1 ; j<=n-i ; j++){
                    System.out.print(" ");
                }

                for(k=1 ; k<=2*i-1 ; k++){
                    System.out.print(i);
                }
                System.out.println();
            }
        }else{
            System.out.println("Your Number should be Smaller than 9 but Greater than 0.");
        }

        scan.close();
    }
}