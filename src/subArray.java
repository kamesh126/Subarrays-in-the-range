import java.util.ArrayList;
import java.util.Scanner;


public class subArray {
    public static ArrayList<Integer> Range(int[] array,int B,int C)
    {
        ArrayList<Integer> subArray = new ArrayList<>();
        for(int i=B;i<=C;i++)
        {
            subArray.add(array[i]);
        }
        return subArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int C = sc.nextInt();
        ArrayList<Integer> list = Range(array,B,C);
        System.out.println(list);
    }

}