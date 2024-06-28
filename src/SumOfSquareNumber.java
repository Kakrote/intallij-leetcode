public class SumOfSquareNumber {
    public static void main(String[] args) {
        SumOfSquareNumber sc=new SumOfSquareNumber();
        System.out.println(sc.judgeSquareSum(2));
    }
    public boolean judgeSquareSum(int c) {

        if(c==0){
            return true;
        }

        for(int i=0;i<=(int)Math.sqrt(c);i++){
            for(int j=(int)Math.sqrt(c);j>=0;j--){
                if((i*i)+(j*j)==c){
                    return true;
                }
            }
        }
        return false;

    }

}
