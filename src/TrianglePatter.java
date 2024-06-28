public class TrianglePatter {
    public static void main(String[] args) {
        triangle1(4, 0);
    }

    // to print inverted upside down right trinagle 
    public static void triangle(int r,int c ){
        if(r==0){
            return;

        }
        if(c<r){
            System.out.print(
                "* "
            );
            triangle(r, c+1);
        }
        else{
            System.out.println();
            triangle(r-1, 0);
        }
    }
    
    // to print the normal right angle trinagle 
    public static void triangle1(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            triangle1(r, c+1);
            System.out.print(" * ");
        }
        else{
            triangle1(r-1,0);
            System.out.println();
        }
        
        

    }
}

