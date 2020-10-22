public class Tester{
  public static void main(String[] args){
    int[] arrA = { 100, 12, -56 };
    int[] arrB = {2 , 4 ,9, 1, 23};
    int[] arrC = { };

    System.out.println(ArrayOps.sum(arrA));
    System.out.println(ArrayOps.sum(arrB));
    System.out.println(ArrayOps.sum(arrC));

    System.out.println(ArrayOps.largest(arrA));
    System.out.println(ArrayOps.largest(arrB));
    System.out.println(ArrayOps.largest(arrC));
  }
}
