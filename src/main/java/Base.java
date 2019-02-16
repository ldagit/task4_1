import java.util.Random;
/**
 * @author Литвинцова Юлия
 */

public class Base {

    public static void main(String[] args) {
        int []randomNumber;
        randomNumber = new int[20];
        initRandomArray(randomNumber);

        //поиск максимального отрицательного
        int maxNegativeNumber = 0;
        int maxNegative = -10;

        for (int i = 0; i < 20; i++){
            if (randomNumber[i] < 0) {
                if (randomNumber[i] > maxNegative) {
                    maxNegative = randomNumber[i];
                    maxNegativeNumber = i;
                }
            }
            else{
             continue;
            }
        }
        //поиск минимального положительного
        int minPositiveNumber = 0;
        int minPositive = 10;


        for (int i = 0; i < 20; i++){
            if (randomNumber[i] >= 0) {
                if (randomNumber[i] < minPositive) {
                    minPositive = randomNumber[i];
                    minPositiveNumber = i;
                }
            }
            else{
                continue;
            }
        }
        //меняем местами максимальное отрицательное число и минимальное положительное
        int intermediateNum = randomNumber[maxNegativeNumber];
        randomNumber[maxNegativeNumber] = randomNumber[minPositiveNumber];
        randomNumber[minPositiveNumber] = intermediateNum;
        System.out.println();

        for (int i = 0; i<20; i++){
            System.out.print(randomNumber[i] + " ");
        }
    }

    private static void initRandomArray (int[] args){
        Random random = new Random();
        System.out.println("Массив случайных чисел в диапазоне [-10, 10]:");
        for (int i = 0; i<20; i++){
            boolean sign = random.nextBoolean();
            args[i] = sign ? random.nextInt(11) : (-1*random.nextInt(11));
            System.out.print(args[i] + " ");
        }
    }

}
