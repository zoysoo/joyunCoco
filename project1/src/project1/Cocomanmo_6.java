
package project1;

public class Cocomanmo_6 {
	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	    	//�̷��� Ǭ ��� ��¥ �������ٸ�����...â��������  Ǯ��ͳ׿�
	        int answer = 0;
	        int[] student = new int[n+1];
	        
	        for(int i=1;i<=n;i++) {
	            student[i]=1;
	        }
	        for(int j:lost) {
	            student[j]--;
	        }
	        for(int k:reserve) {
	            student[k]++;
	        }
	        
	        for(int i=1;i<=n;i++) {
	            if(student[i]==0) {
	               if(i-1>=1&&student[i-1]==2){
	                   student[i]++;
	                   student[i-1]--;
	               }else if(i+1<=n&&student[i+1]==2) {
	                   student[i]++;
	                   student[i+1]--;
	               }
	            }
	        }
	        for(int i=1;i<=n;i++) {
	            if(student[i]>=1)
	                answer++;
	            }
	        
	        return answer;
	        
	    }
	}

}
/* true/false �̿��ؼ� ���ִ� Ǯ��. 
 * class Solution { public int solution(int n, int[] lost, int[] reserve) { int
 * answer = 0; answer = n;
 * 
 * for(int i = 0; i < lost.length; i++) { boolean rent = false; int j = 0;
 * while(!rent) { if(j == reserve.length) break; if(lost[i] == reserve[j])
 * {reserve[j] = -1; rent=true;} else if(lost[i] - reserve[j] == 1 ) {reserve[j]
 * = -1; rent=true;} else if(lost[i] - reserve[j] == -1) {reserve[j] = -1;
 * rent=true;} else {j++; } } if(!rent) answer--; } return answer; } }
=======
package project1;

public class Cocomanmo6 {
	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	    	//�̷��� Ǭ ��� ��¥ �������ٸ�����...â��������  Ǯ��ͳ׿�
	        int answer = 0;
	        int[] student = new int[n+1];
	        
	        for(int i=1;i<=n;i++) {
	            student[i]=1;
	        }
	        for(int j:lost) {
	            student[j]--;
	        }
	        for(int k:reserve) {
	            student[k]++;
	        }
	        
	        for(int i=1;i<=n;i++) {
	            if(student[i]==0) {
	               if(i-1>=1&&student[i-1]==2){
	                   student[i]++;
	                   student[i-1]--;
	               }else if(i+1<=n&&student[i+1]==2) {
	                   student[i]++;
	                   student[i+1]--;
	               }
	            }
	        }
	        for(int i=1;i<=n;i++) {
	            if(student[i]>=1)
	                answer++;
	            }
	        
	        return answer;
	        
	    }
	}

}
/* true/false �̿��ؼ� ���ִ� Ǯ��. 
 * class Solution { public int solution(int n, int[] lost, int[] reserve) { int
 * answer = 0; answer = n;
 * 
 * for(int i = 0; i < lost.length; i++) { boolean rent = false; int j = 0;
 * while(!rent) { if(j == reserve.length) break; if(lost[i] == reserve[j])
 * {reserve[j] = -1; rent=true;} else if(lost[i] - reserve[j] == 1 ) {reserve[j]
 * = -1; rent=true;} else if(lost[i] - reserve[j] == -1) {reserve[j] = -1;
 * rent=true;} else {j++; } } if(!rent) answer--; } return answer; } }
>>>>>>> refs/remotes/origin/master
=======
<<<<<<< HEAD
package project1;

public class Cocomanmo6 {
	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	    	//�̷��� Ǭ ��� ��¥ �������ٸ�����...â��������  Ǯ��ͳ׿�
	        int answer = 0;
	        int[] student = new int[n+1];
	        
	        for(int i=1;i<=n;i++) {
	            student[i]=1;
	        }
	        for(int j:lost) {
	            student[j]--;
	        }
	        for(int k:reserve) {
	            student[k]++;
	        }
	        
	        for(int i=1;i<=n;i++) {
	            if(student[i]==0) {
	               if(i-1>=1&&student[i-1]==2){
	                   student[i]++;
	                   student[i-1]--;
	               }else if(i+1<=n&&student[i+1]==2) {
	                   student[i]++;
	                   student[i+1]--;
	               }
	            }
	        }
	        for(int i=1;i<=n;i++) {
	            if(student[i]>=1)
	                answer++;
	            }
	        
	        return answer;
	        
	    }
	}

}
/* true/false �̿��ؼ� ���ִ� Ǯ��. 
 * class Solution { public int solution(int n, int[] lost, int[] reserve) { int
 * answer = 0; answer = n;
 * 
 * for(int i = 0; i < lost.length; i++) { boolean rent = false; int j = 0;
 * while(!rent) { if(j == reserve.length) break; if(lost[i] == reserve[j])
 * {reserve[j] = -1; rent=true;} else if(lost[i] - reserve[j] == 1 ) {reserve[j]
 * = -1; rent=true;} else if(lost[i] - reserve[j] == -1) {reserve[j] = -1;
 * rent=true;} else {j++; } } if(!rent) answer--; } return answer; } }
=======
package project1;

public class Cocomanmo6 {
	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	    	//�̷��� Ǭ ��� ��¥ �������ٸ�����...â��������  Ǯ��ͳ׿�
	        int answer = 0;
	        int[] student = new int[n+1];
	        
	        for(int i=1;i<=n;i++) {
	            student[i]=1;
	        }
	        for(int j:lost) {
	            student[j]--;
	        }
	        for(int k:reserve) {
	            student[k]++;
	        }
	        
	        for(int i=1;i<=n;i++) {
	            if(student[i]==0) {
	               if(i-1>=1&&student[i-1]==2){
	                   student[i]++;
	                   student[i-1]--;
	               }else if(i+1<=n&&student[i+1]==2) {
	                   student[i]++;
	                   student[i+1]--;
	               }
	            }
	        }
	        for(int i=1;i<=n;i++) {
	            if(student[i]>=1)
	                answer++;
	            }
	        
	        return answer;
	        
	    }
	}

}
/* true/false �̿��ؼ� ���ִ� Ǯ��. 
 * class Solution { public int solution(int n, int[] lost, int[] reserve) { int
 * answer = 0; answer = n;
 * 
 * for(int i = 0; i < lost.length; i++) { boolean rent = false; int j = 0;
 * while(!rent) { if(j == reserve.length) break; if(lost[i] == reserve[j])
 * {reserve[j] = -1; rent=true;} else if(lost[i] - reserve[j] == 1 ) {reserve[j]
 * = -1; rent=true;} else if(lost[i] - reserve[j] == -1) {reserve[j] = -1;
 * rent=true;} else {j++; } } if(!rent) answer--; } return answer; } }
>>>>>>> refs/remotes/origin/master
>>>>>>> branch 'master' of https://github.com/zoysoo/cocomanmo.git
 */