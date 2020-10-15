package project1;

import java.util.*;

public class Cocomanmo_12 {
	public String solution(String s) {
        String answer = "";
        String str[] = s.split("");
        Arrays.sort(str);
        Arrays.sort(str, Collections.reverseOrder()); //배열을 뒤집는 다양한 방법이 있네욤 몰라서 이건 찾아봤어요 ㅜㅜ
        // Collections.reverse(Arrays.asList(str)); 이것도 방법중 하나 asList를 쓰면 배열을 List 형식으로 쓸 수 있음

        return String.join("",str);
    }

}
/* 이게 찐
 * public String solution(String s) { 
 * char[] array = s.toCharArray();
 * Arrays.sort(array); 
 *  return new StringBuilder(new String(array)).reverse().toString(); 
 *  }
 */