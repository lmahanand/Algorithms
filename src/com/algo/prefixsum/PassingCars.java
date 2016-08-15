package com.algo.prefixsum;

/*Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1*/

public class PassingCars {

	public static void main(String[] args) {
		//int [] A ={0,1,0,1,1};
		int [] A ={1,1,1,1,1,1};
		System.out.println(passingCars(A));
	}
	
	public static int passingCars(int[] A) {
        long count =0;
        long CNT_LIMIT= 1000000000L;
        long increaseBy =0;
        boolean flag=true;
        for (int i = 0; i < A.length; i++) {
        	if(A[i]== 1 && flag){
        		continue;
        	}else
			if(A[i]==0){
				flag=false;
				increaseBy++;
			}else if(A[i]==1){
				count+=increaseBy;
			}
		}
        if(count>CNT_LIMIT) count=-1;
        return (int)count;
    }
	

}
