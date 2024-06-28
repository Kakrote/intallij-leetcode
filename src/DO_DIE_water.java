public class DO_DIE_water {
    public static void main(String[] args) {
        int jarA=3;
        int jarB=5;
        int jarC=4;
        mesure_4_litter(jarA, jarB, jarC);
    }
    public static void mesure_4_litter(int a,int b,int z){
        int bA=0;
        int bB=0;
        int bZ=0;
        while(true){
            System.out.printf("waterA %d waterB %d waterZ %d\n",bA,bB,bZ);
            bA=a;
            System.out.printf("waterA %d waterB %d waterZ %d\n",bA,bB,bZ);
            bB=Math.min(bA,b-bB);
            bA-=bB;
            System.out.printf("waterA %d waterB %d waterZ %d\n",bA,bB,bZ);
            bZ+=Math.min(bA,bB);
            if(bZ==z){
                bA-=bZ;
                if(bA<0){
                    bA=0;
                }
                System.out.printf("waterA %d waterB %d waterZ %d\n",bA,bB,bZ);

                break;
            }
            


        }

    }
}
