package com.mystudy.work02.implement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class CalculateClassRank {

    public static void calculateClassRank(ArrayList list) {
        //반별 오름차순 정렬
        Collections.sort(list, new ClassTotalComparator());
        int prevBan = -1; //
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();
        for (int i = 0, n = 0; i < length; i++, n++) {

            Student s = (Student) list.get(i);

            if (s.ban != prevBan) {
                prevRank = -1; // 새로운 반이 시작되면 등수 초기화
                prevTotal = -1;// 새로운 반이 시작되면 총점 초기화
                n = 0;// 등수 초기화
            }
            if (s.total == prevTotal) {
                s.classRank = prevRank;
            } else {
                //총점이 다르면 등수 증가
                s.classRank = n + 1;
            }
            //현재 반에서 등수
            prevRank = s.classRank;
            prevTotal = s.total; // 현재 총점
        }
    }

    public static void calculateSchoolRank(ArrayList list) {
        //전교 등수를 기준으로 정렬
        Collections.sort(list);
        int prevRank = -1; // 이전 전교등수
        int prevTotal = -1; // 이전 총점
        int length = list.size();
        for (int i = 0; i < length; i++) {
            Student s = (Student) list.get(i);
            if (s.total == prevTotal) {
                //총점이 같으면 이전 전교등수로 설정
                s.schoolRank = prevRank;
            } else {
                //총점이 다르면 등수 증가
                s.schoolRank = i + 1;
            }
            prevRank = s.schoolRank;
            prevTotal = s.total;
        } // for
    }

    public static void main(String[] args) {
        //학생 정보를 저장할 ArratList생성
        ArrayList list = new ArrayList();
        list.add(new Student("이자바", 2, 1, 70, 90, 70));
        list.add(new Student("안자바", 2, 2, 60, 100, 80));
        list.add(new Student("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student("김자바", 1, 2, 80, 80, 90));
        calculateSchoolRank(list);//전교 등수 계산
        calculateClassRank(list);//반 등수 계산
        Iterator it = list.iterator();//Iterator를 사용하여 리스트 순회
        while (it.hasNext())
            System.out.println(it.next());
    }
}
