import java.util.Random;

/**
 * Created by KPS on 7/10/2020.
 */
public class Main {
    public static void main(String[] args) {
        int n1 ,n2;
        Random random = new Random();
        while (true){
            n1 = random.nextInt(76);
            if (n1>=25 && n1 <= 75)break;
        }
        while (true){
            n2 = random.nextInt(76);
            if (n2>=25 && n2 <= 75)break;
        }
        int i=0;
        int j = 0;
        int[] sumN1 = new int[10];
        int[] sumN2 = new int[10];
        while (n1>0 && n2>0){
            sumN1[i++]=n1%10;
            n1= n1/10;
            sumN2[j++] = n2%10;
            n2 = n2/10;
        }
        boolean result = true;
     for (int g = 0 ; g < sumN1.length-1;g++){
            if (sumN1[g]== sumN2[g]){
                result = true;
            }else
            {result = false;}

     }
        System.out.println(result);
    }

}
