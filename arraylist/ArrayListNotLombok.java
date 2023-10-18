package org.study.run.exam06;


import java.util.ArrayList;
import java.util.List;

public class ArrayListNotLombok {
    public static void main(String[] args) {
        //ArrayList 컬렉션 생성
        //ArrayList를 List에 보냄
        List<Board> list = new ArrayList<>();
        //객체 추가(add)
        list.add(new Board("제목1", "내용1","글쓴이1"));
        list.add(new Board("제목2", "내용2","글쓴이2"));
        list.add(new Board("제목3", "내용3","글쓴이3"));
        list.add(new Board("제목4", "내용4","글쓴이4"));
        list.add(new Board("제목5", "내용5","글쓴이5"));
        // 저장된 총 객체 수 출력하기
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();
        //특정 인덱스(0부터 시작)의 객체 출력하기
        //상세보기
        Board board = list.get(2); // 2번 인덱스는 3번째
        System.out.println(board.getSubject() + "\t" + board.getContent()
        + "\t" + board.getWriter());
        System.out.println();
        // 모든 객체를 하나씩 가져오기
        for(int i=0; i< list.size(); i++){
            Board b = list.get(i);
            System.out.println(b.getSubject()+"\t" + b.getContent()
                    +"\t" + b.getWriter());
        }
        System.out.println();
        // 2번 인덱스를 삭제하여
        // 3번 인덱스가 2번으로 변경
        list.remove(2);
        // 2번 인덱스를 한 번더 삭제
        // 4번 인덱스가 2번으로 변경
        list.remove(2);
        //for 문 실행
        for(Board b : list) {
            //2번 인덱스가 2번 지워져서 원래 인덱스의 0,1,4번 인덱스 출력
            System.out.println(b.getSubject() + "\t" + b.getContent()
                    + "\t" + b.getWriter());
        }

    }
}
