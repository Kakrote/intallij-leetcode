import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        // subseq("abc", " ");
        System.out.println(subseqlist("abc", ""));
    }
    static void subseq(String str,String ans){// str is the original string and ans will contain the subseq of the original string.
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch=str.charAt(0);
        subseq(str.substring(1),ans+ch);// this will return the function with adding (left part of the tree)
        subseq(str.substring(1),ans);// this will return the function with ingoring (right part of the tree)
    }

    static ArrayList<String> subseqlist(String str,String ans){
        if(str.isEmpty()){
            ArrayList <String>list=new ArrayList<>();
            list.add(ans);
            return list;

        }
        char ch=str.charAt(0);
        ArrayList<String>left=subseqlist(str.substring(1), ans+ch);// this will have the taking left hand part
        ArrayList<String>right=subseqlist(str.substring(1), ans);// this will have the ingnoring right hand part.
        
        left.addAll(right);
        return left;
    }
}
