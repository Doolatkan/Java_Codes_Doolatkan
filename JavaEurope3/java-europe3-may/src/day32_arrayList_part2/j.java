package day32_arrayList_part2;

public class j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,3,4,3,4};
		for(int i=0; i<nums.length;i++) {
			int count = 0;
			for(int j=0; j<nums.length; j++) {
				if(nums[i]==nums[j]) {
					count++;
				}			
			}
			if(count==1) {
				System.out.println(nums[i]);
			}
		}

	}

}
