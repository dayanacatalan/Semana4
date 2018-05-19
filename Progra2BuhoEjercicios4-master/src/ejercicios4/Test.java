
package ejercicios4;

import java.util.ArrayList;

public class Test {

    
    public static void main(String[] args) {
        ArrayList<Integer> i1 = new ArrayList<>();
        i1.add(20);
        i1.add(10);
        i1.add(30);
        
        ArrayList<Integer> i2 = new ArrayList<>();
        i2.add(5);
        i2.add(2);
        i2.add(7);
        i2.add(1);
        
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("X");
        s1.add("Y");
        s1.add("Z");
        
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("uno");
        s2.add("dos");
        s2.add("tres");
        
        System.out.print("getSum:\t");
        if (Exercises.getSum(i1) == 60 && Exercises.getSum(i2) == 15) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        System.out.print("exists:\t");
        if (Exercises.exists(s1,"X") && !Exercises.exists(s1,"M") && Exercises.exists(s1,"Z")
                && Exercises.exists(s2,"uno") && !Exercises.exists(s1,"diez") && !Exercises.exists(s1,"nueve")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        ArrayList<Integer> sorted1 = Exercises.sort(i1);
        ArrayList<Integer> sorted2 = Exercises.sort(i2);
        
        System.out.print("sort:\t");
        if (sorted1.size()==3 && sorted2.size()==4
                && sorted1.get(0)==10
                && sorted1.get(1)==20
                && sorted1.get(2)==30
                && sorted2.get(0)==1
                && sorted2.get(1)==2
                && sorted2.get(2)==5
                && sorted2.get(3)==7
                ) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
