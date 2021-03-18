import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        if(grades.get(0) < 1 || grades.get(0) > 60 || grades.size()-1 > 60 || grades.size()-1 < 1 || grades.get(0) != grades.size()-1){
            System.out.println("fyi: The actual or given number of students is either out of the possible range 1-60 or they do not match with each other.");
            return new ArrayList<>();
        }

        List<Integer> manipulatedgrades = new ArrayList<>();

        for(int i = 1; i < grades.size(); i++){

            if(grades.get(i) < 0 || grades.get(i) > 100){
                System.out.println("There is an invalid entry on position " + i + " with the value " + grades.get(i) + " and will therefore not be calculated. Please modify your entry for the next time.");
                manipulatedgrades.add(null);
            }
            else if(grades.get(i) >= 38){
                if(((grades.get(i)+1) % 5) == 0)
                    manipulatedgrades.add(grades.get(i)+1);

                else if(((grades.get(i)+2) % 5) ==0)
                    manipulatedgrades.add(grades.get(i)+2);

                else manipulatedgrades.add(grades.get(i));
            }
            else manipulatedgrades.add(grades.get(i));
        }

        return manipulatedgrades;
    }
}
