package ghl_guide;

public class SingleNumber {


    public static void main(String[] args) {
        int[] nums = {2, 2, 1};


        int count = 0;
        int singleNum = 0;

        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    count += 1;
                }
            }
            if (count == 1){
                singleNum = nums[i];
                break;
            }
            count = 0;
        }

        System.out.println(singleNum);
    }
}
