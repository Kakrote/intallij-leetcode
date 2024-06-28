public class WaterJug {
    public static void main(String[] args) {
        
    }
    // to check if the jugs can fill the target is to check the hcf of the x and y
    public boolean canMeasureWater(int x, int y, int target) {
        int h=gcd(x, y);
        //case1 x==y==target 
        if(x==y && y==target){
            return true;
        }
        // case 2 x==y y!=target
        if(x==y && y!=target){
            return false;
        }
        // case 3 this is the standard case
        if(target%h==0){
            return true;
        }


        return false;
    }
    public int gcd(int x,int y){
        while(y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return x;
    }
}
