import java.util.ArrayList;

public class FindingAllIndex {
    public static void main(String[] args) {
        int []arr={1,2,3,4,4,5,6,7,8};
        System.out.println(findingAllindexs(arr, 4, 0));
    }
    public static ArrayList<Integer> findingAllindexs(int []arr,int target,int index){
        // as we cant pass the arrayList in the argument so we have to create a list inside the function call.
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);

        }
        ArrayList<Integer> ansFromBellow=findingAllindexs(arr, target, index+1); // this will have the answers from the bellow when calling backword
        list.addAll(ansFromBellow);// this will add all the elements in the ansFromBellow into a single list

        return list;
    }
}
