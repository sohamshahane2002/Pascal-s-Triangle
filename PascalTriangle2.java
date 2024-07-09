//When we are given the row number n. Print the n-th row of Pascal’s triangle.
package Pascal_Triagle;

public class PascalTriangle2 {
    public static void pascaltriangle(int n){
        long ans = 1;
        System.out.print(ans+" ");   // printed 1
        for(int i = 1; i < n ; i++){
            ans = ans * (n-i);
            ans = ans / i;
            System.out.print(ans + " "); 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        pascaltriangle(5);
    }
    
}
