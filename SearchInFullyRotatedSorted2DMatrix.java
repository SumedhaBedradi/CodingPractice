class SearchInRotatedSorted2DMatrix {
public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                if(mat[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SearchInRotatedSorted2DMatrix search = new SearchInRotatedSorted2DMatrix();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;
        boolean result = search.searchMatrix(matrix, target);
        System.out.println("Element found: " + result); // Output: Element found: true
    }
}