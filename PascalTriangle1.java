//We are given the row number r and the column number c, and we need to find out the element at position (r,c). 

package Pascal_Triagle;

import java.util.*;
public class PascalTriangle1{
    public static long nCr(int n, int r){
        long result =1;
        for(int i =0; i<r ; i++){
            result = result * (n-i);
            result = result / (i+1);
        }
        return result;
    }
    public static int Pascaltriangle(int r, int c){
        int element = (int) nCr (r-1,c-1);
        return element;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the row number");
        int r = sc.nextInt();

        System.out.println("Enter the column number");
        int c = sc.nextInt();

        int element = Pascaltriangle(r, c);
        System.out.println("The number you want to retrieve is : " + element);
    }
}
    
