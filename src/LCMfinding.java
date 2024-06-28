public class LCMfinding {
    public static void main(String[] args) {
        int lcm=findinglcm(12, 18);
        System.out.println(lcm);
    }
    static public int findinglcm(int x,int y){
        int h=gcd(x, y);
        if(h==1){
            return x*y;
        }
        int l=((x/h)*(y/h))*h;

        return l;
    }
    static public int gcd(int x,int y){
        while(y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return x;
    }
}
