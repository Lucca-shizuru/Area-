package application;
import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the measures of triangle X: ");
        double xa = sc.nextDouble();
        double xb = sc.nextDouble();
        double xc = sc.nextDouble();
        System.out.println( "Enter the measures of triangle  Y:" );
        double ya = sc.nextDouble();
        double yb = sc.nextDouble();
        double yc = sc.nextDouble();

        double p = ((xa + xb + xc) / 2 );
        double areaX = Math.sqrt( p * (p - xa ) * (p - xb ) * (p - xc ));
        p = ((ya + yb + yc) / 2 );
        double areaY = Math.sqrt( p * (p - ya ) * (p - yb ) * (p - yc ));
        System.out.println( " Triangle X area: " + areaX);
        System.out.println("  Triangle Y area: " + areaY);
            if ( areaX > areaY){
                System.out.println(" Larger area: X ");
            }
            else {
                System.out.println("Larger area: Y ");
            }


            sc.close();

    }


}
