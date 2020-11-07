package project1;

public class Cocomanmo13 {
	class Solution {
	    public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        long ys = x;
	        for(int i=0;i<n;i++) {
	            answer[i]=ys*(i+1);
	        }
	        return answer;
	    }
	}

}
