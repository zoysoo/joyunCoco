package project1;

import java.util.HashMap;
/*
���� ����
������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.
   String [] participant ={"mislav", "stanko", "mislav", "ana"};
	String [] completion = {"stanko", "ana", "mislav"};
	    
	String [] participant =[marina, josipa, nikola, vinko, filipa]
	String [] completion = [josipa, filipa, marina, nikola]
*/
public class Cocomanmo_1 {
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        int val = 0;
	        
	        HashMap<String, Integer> map = new HashMap<>();
	        
	        for(String parti : participant) {
	            if(map.get(parti)==null) {
	                map.put(parti,1);
	            }else {
	                val=map.get(parti) + 1;
	                map.put(parti,val);
	                
	            }
	        }
	        for(String comp : completion) {
	            val=map.get(comp) - 1;
	            map.put(comp,val);
	        }
	        for(String key : map.keySet()) {
	            if(map.get(key) == 1) answer = key;
	        }
	        
	        return answer;
	    }
	}

}
