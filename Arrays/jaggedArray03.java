package Arrays;

public class jaggedArray03 {
    public static void main(String[] args){
        
        // int nums[][]  = new int[3][];
        // nums[0] = new int[4];
        // nums[1] = new int[2];
        // nums[2] = new int[3];
        
        // nums[0][0] = 5;
        // nums[0][1] = 2;
        // nums[0][2] = 3;
        // nums[0][3] = 6;
        // nums[1][0] = 8;
        // nums[1][1] = 2;
        // nums[2][0] = 9;
        // nums[2][1] = 4;
        // nums[2][2] = 8;

           int nums[][] = {
                           {5,2,3,6},
                           {8,3},
                           {9,4,8}
                        };
                         
        //  
        //Enhanced for loop
        // int nums[] = {5,4,7,8};

        // for (int n : nums) {
        //     System.out.println(n);
        // }

        for(int a[] : nums)
        {
            for(int b : a ){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
