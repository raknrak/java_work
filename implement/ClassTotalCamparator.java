package com.mystudy.work02.implement;

import java.util.Comparator;

class ClassTotalComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        int result = s1.ban - s2.ban; // 반을 기준으로 오름차순 정렬
        if(result==0)
            result = s2.total - s1.total; // 총점을 기준으로 내림차순 정렬
        return result;
    }
}
