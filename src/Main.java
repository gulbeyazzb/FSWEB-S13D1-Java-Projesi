public class Main {
    public static void main(String[] args) {
       // System.out.println(shouldWakeUp(true,-1));
      // System.out.println(hasTeen(23, 22, 42));
    }

    public static boolean shouldWakeUp(boolean isBarking, int num) {
        if (num < 0 || num > 23) {
            return false;
        }

         if (isBarking) {
            if (num < 23 && num > 20 || num < 8 && num > 0) {
                return true;
            }else{
                return false;
            }
        }
         else {
             return false;
         }
    }
    public static boolean hasTeen(int... ages){
        int isYoung=0;
        for(int age: ages){

          if(age >= 13 && age <= 19){
              isYoung += 1;
              break;
          }
        }
        if(isYoung > 0 ){
            return true;
        }
        else{
            return false;
        }
    }
}