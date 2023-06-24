import java.util.Arrays;
 
interface NthBiggest {
    public int Nth(int[] tmp, int x);
}
 
public class nthLargest {
 
    public static void main(String[] args) {
 
        
        int[] numArray = { 34, 21, 45, 75, 62, 98, 13, 49 };
        System.out.println("The given array numbers are here");
        System.out.print("[");
 
       
        dispArray(numArray);
 
        NthBiggest Nb = ((numArr, pos) -> {
            Arrays.sort(numArr);
            return numArr[numArr.length - pos];
        });
        System.out.println("NthLargest number in the Array is=" + Nb.Nth(numArray, 2));
    }
 
    private static void dispArray(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }
        System.out.println("]");
    }
}