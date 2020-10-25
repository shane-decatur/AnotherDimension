import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[] arrA = { 100, 12, -56 };
    int[] arrB = {2 , 4 ,9, 1, 23};
    int[] arrC = { };

    int[][]  A  =  {  {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
                };
    int[][] B = {{100,12,-56},
                 {34, 12, 10},
                 {56,0,0},
                 {21,14,21}};


    System.out.println(ArrayOps.sum(arrA));
    System.out.println(ArrayOps.sum(arrB));
    System.out.println(ArrayOps.sum(arrC));

    System.out.println(ArrayOps.largest(arrA));
    System.out.println(ArrayOps.largest(arrB));
    System.out.println(ArrayOps.largest(arrC));

    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
    System.out.println(Arrays.toString(ArrayOps.sumRows(B)));

    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(B)));

    System.out.println(ArrayOps.sum(A));
    System.out.println(ArrayOps.sum(B));

    System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
    System.out.println(Arrays.toString(ArrayOps.sumCols(B)));

    System.out.println(ArrayOps.isRowMagic(A));
    System.out.println(ArrayOps.isRowMagic(B));



  }
}
