public class MazeAllPaths {
    public static void main(String[] args) {
        boolean [][] bord={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        pathsObsticals("", bord, 0, 0);
    }
    static void pathsObsticals(String p,boolean [][]maze,int r,int c){
        if(r==maze.length-1&&c==maze[0].length-1){//maze.lenght will give the rows and the maze[0].length will give the column length 
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){ // will check for the obsticals in the matrix 
            return;
        }
        maze[r][c]=false;   // this is when we have visited the path 
        if(r<maze.length-1){
            pathsObsticals(p+'D',maze, r+1, c); // go down 
        }
        if(r>0){
            pathsObsticals(p+'U', maze, r-1, c);// go up
        }
        if(c>0){
            pathsObsticals(p+'L', maze, r, c-1); // go left
        }
        if(c<maze[0].length-1){
            pathsObsticals(p+'R',maze, r, c+1); // go right.
        }
        maze[r][c]=true; // this will make the maze at its original condition of before the recursion call.
        // this process of converting the maze at the original condition while going back in recursion call(returing function) is called Backtracking.
    }
}
