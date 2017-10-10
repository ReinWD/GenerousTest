import java.util.Random;

/**
 * Created by ZW on 2017/6/15.
 */
public class MinecraftTest {
    static class RandomTest{
        public static void main(String[] args) {
            int[] counts=new int[10];
            int temp;
            for (int i = 0; i < 1000; i++) {
                temp = new Random().nextInt(10 - 1 + 1) + 1;
                counts[temp-1]++;
            }
            for (int i = 0; i < 10; i++){
                System.out.println(i+1+":"+counts[i]);
            }
        }
    }
}
