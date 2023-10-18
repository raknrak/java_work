package org.study.run.exam06;
// import 길어지면 *로 처리해서 코드 짧게 하기
import java.util.*;


public class HashMapEx {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();
        // 객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95); // "홍길동"키 값이 같기 때문에 마지막만 저장됨
        System.out.println("총 Entry 수: " + map.size()); //3
        System.out.println();
        // 키를 입력하여 값 출력
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();
        // 키 Set 컬렉션을 얻고, 반복해서 키와 값 얻기
        // keySet은 모든 키를 Set 객체에 담아 리턴
        Set<String> keySet = map.keySet();
        //iterator : 배열이나 유사한 자료 구조의 내부 요소를 순회
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();
        // 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        // 키와 값을 묶음이 엔트리
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()) {
            //엔트리를 반복
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k+ " : " + v);
        }
        System.out.println();
        // 키로 엔트리 삭제
        map.remove("홍길동");
        System.out.println("총 entry 수: " + map.size()); //2
        System.out.println();

    }
}
