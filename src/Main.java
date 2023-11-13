import java.sql.SQLOutput;
import java.util.*; //libraries as Scanner were imported

public class Main {
    public static void main(String[] args) {
        // System.out.println(shouldWakeUp(true,-1));
        // System.out.println(hasTeen(23, 22, 42));
        // System.out.println(isCatPlaying(true,10));


        Scanner entry = new Scanner(System.in);
        //System.out.print("first edge: ");
        //double edge1 = entry.nextDouble();
        //System.out.print("second edge: ");
        //double edge2 = entry.nextDouble();
       /* if(edge1 || edge2 == -1){
            System.out.println("edge mustn't negative");
            edge1 = entry.nextDouble();
            edge2 = entry.nextDouble();
        }
         System.out.println(area(edge1,edge2))

*/
        System.out.print("radius: ");
        double radius = entry.nextDouble();
        if( radius == -1){
            System.out.println("radius mustn't negative");
            radius = entry.nextDouble();
        }
            System.out.println(circleArea(radius));
    }

    public static boolean shouldWakeUp(boolean isBarking, int num) {
        if (num < 0 || num > 23) {
            return false;
        }

        if (isBarking) {
            if (num < 23 && num > 20 || num < 8 && num > 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int... ages) {
        int isYoung = 0;
        for (int age : ages) {

            if (age >= 13 && age <= 19) {
                isYoung += 1;
                break;
            }
        }
        if (isYoung > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isCatPlaying(boolean season, int warmth) {

        if (season) {
            if (warmth >= 25 && warmth <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            if (warmth >= 25 && warmth <= 35) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static double area(double... edges) {
        double area = 1;
        for (double edge : edges) {
            if (edge < 0) {
                return -1;
            } else {
                area = area * edge;
            }
        }
        return area;
    }

    public static double circleArea(double radius) {
        double area = 1;
        if (radius < 0) {
            return -1;
        } else {
            area = radius * radius * Math.PI;
        }
        return area;
    }
}