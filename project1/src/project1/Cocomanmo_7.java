
package project1;

public class Cocomanmo_7 {
	//�����佺�׳׽��� ü Ǯ�� ������. math.sqrt��� i�� ������ �̿���. ������ ����
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	              
	        for(int m=2; m<=n; m++) {
	            boolean flag = true;
	            for(int i=2; i*i<=m; i++) {
	                if(m%i==0) {
	                flag=false;
	                break;
	            }
	        }
	            if(flag) answer++;
	     }
	      
	        return answer;
	    }
	}
	
	

	/* �ð��ʰ� �ѳ� ����,,
	 * public int solution(int n) { int answer = 0;
	 * 
	 * for(int m=2; m<=n; m++) { boolean flag = true; for(int i=2; i<m; i++) {
	 * if(m%i==0) flag=false; } if(flag==true) { answer++; } }
	 * 
	 * 
	 * return answer; }
	 */

}

