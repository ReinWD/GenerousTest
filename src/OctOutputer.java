public class OctOutputer {

    public static void output(int n, int base){
        if(n/base>0){
            output(n/base,base);
        }
        System.out.printf("%5d",n%base);
    }

}
