public class RowCompare
{
  public static int uniqueRows(int[][] mat) {
    int uniqueCount = 0;
    
    for (int i = 0; i < mat.length; i++) {
      if (!isRow(mat[i], mat, i)) {
        uniqueCount++;
      }
    }

    return uniqueCount;
  }

  public static boolean isRow(int[] arr, int[][] mat, int limit)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    return testing.FRQFunctions.isRow(arr, mat, limit);
  }

}
