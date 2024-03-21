public class RowCompare
{
  public static boolean isRow(int[] arr, int[][] mat, int limit) {
    if (limit < 0 || limit > mat.length) {
      return false;
    }

    for (int i = 0; i < limit; i++) {
      if (mat[i].length == arr.length) {
        boolean rowMatch = true;
        for (int j = 0; j < arr.length; j++) {
          if (mat[i][j] != arr[j]) {
            rowMatch = false;
            break;
          }
        }
        
        if (rowMatch) {
          return true;
        }
      }
    }
    
    return false;
  }
}