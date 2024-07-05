// in this we have given a target number we have to print the number of combinations which form the target number.

import java.util.ArrayList;
import java.util.List;

/**
 * DiceProblem
 */
public class DiceProblem {

    public static void main(String[] args) {
        // dice("", 4);
        System.out.println(diceList("", 4));
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6&&i<=target;i++){
            dice(p+i, target-i);
        }
    }
    // now return the list
    static List<String> diceList(String p,int target){
        if(target==0){
            ArrayList<String>ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> an=new ArrayList<>();
        for(int i=1;i<=6&&i<=target;i++){

            an.addAll(diceList(p+i, target-i));
        }
        return an;

    }
}