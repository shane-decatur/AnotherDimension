public class ArrayOps{
  public static int sum(int[] arr){
    int sum = 0;
    for (int i = 0; i< arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr){
    int maxValue = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] > maxValue) maxValue = arr[i];
    }
    return maxValue;
  }

  public static int[] sumRows(int[][] matrix){
    int[] sums = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++){
      sums[i] = sum(matrix[i]);
    }
    return sums;
  }

  public static int[] largestInRows(int[][] matrix){
    int[] bigVals = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++){
      bigVals[i] = largest(matrix[i]);
    }
    return bigVals;
  }

  public static int sum(int[][] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      sum += sum(arr[i]);
    }
    return sum;
  }

  public static int[] sumCols(int[][] matrix){
    int[] totalSum = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length; i++){
      int tempSum = 0;
      for (int j = 0; j < matrix.length; j++){
        tempSum += matrix[j][i];
      }
      totalSum[i] = tempSum;
    }
    return totalSum;
  }

  public static boolean isRowMagic(int[][] matrix){
    int[] magicRows = sumRows(matrix);
    for (int i = 1; i < magicRows.length; i++){
      if (magicRows[i] != magicRows[i-1]){
        return false;
      }
    }
    return true;
  }



}
