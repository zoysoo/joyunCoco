package project1;

import java.util.*;

public class Cocomanmo_12 {
	public String solution(String s) {
        String answer = "";
        String str[] = s.split("");
        Arrays.sort(str);
        Arrays.sort(str, Collections.reverseOrder()); //�迭�� ������ �پ��� ����� �ֳ׿� ���� �̰� ã�ƺþ�� �̤�
        // Collections.reverse(Arrays.asList(str)); �̰͵� ����� �ϳ� asList�� ���� �迭�� List �������� �� �� ����

        return String.join("",str);
    }

}
/* �̰� ��
 * public String solution(String s) { 
 * char[] array = s.toCharArray();
 * Arrays.sort(array); 
 *  return new StringBuilder(new String(array)).reverse().toString(); 
 *  }
 */