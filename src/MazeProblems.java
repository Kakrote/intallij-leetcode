public class MazeProblems {
    public static void main(String[] args) {
        System.out.println(countWays(3, 3));
    }
    static int countWays(int r,int c){
        if(r==1 || c==1){
            return 1;

        }
        int down=countWays(r-1, c);
        int right=countWays(r, c-1);
//        int f=down+right;
        return down+right;
    }
}
