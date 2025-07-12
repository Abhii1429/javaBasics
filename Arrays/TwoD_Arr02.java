package Arrays;
public class TwoD_Arr02 {
    public static void main(String[] args) {
        // 2-D Array 
        // int nums[][] = new int[3][2];
        // nums[0][0] = 5;
        // nums[0][1] = 2;
        // nums[1][0] = 8;
        // nums[1][1] = 2;
        // nums[2][0] = 9;
        // nums[2][1] = 4;
        
        int nums [][] = {
                           {5,2},
                           {8,3},
                           {9,4}
                        };
                         
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(nums[i][j] +" ");
            }
            System.out.println();
        }
    }
}
