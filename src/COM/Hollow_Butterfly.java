package COM;

public class Hollow_Butterfly {
    public static void main(String[] args) {
int n =5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if(j == n-i ){
                    System.out.println("*");
                }
            }
            System.out.println();
        }
    }
}
