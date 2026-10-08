//Pattern

import java.util.Scanner;
public class Main24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n ,i ,j ,k;

        System.out.print("\nEnter a NUMBER = ");
        n = scan.nextInt();

        System.out.println();
        if(n>0){
            for(i=1 ; i<=n ; i++){
                for(j=1 ; j<=n-i ; j++){
                    System.out.print(" ");
                }

                for(k=1 ; k<=2*i-1 ; k++){
                    if(k==1 || k==2*i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            for(i=n ; i>=1 ; i--){
                for(j=n-i ; j>=1 ; j--){
                    System.out.print(" ");
                }

                for(k=2*i-1 ; k>=1 ; k--){
                    if(k==1 || k==2*i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("Your Number should be Greater than 0.");
        }

        scan.close();
    }
}