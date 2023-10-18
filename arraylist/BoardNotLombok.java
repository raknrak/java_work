package org.study.run.exam06;
//롬복을 사용하지 않고 해보기
public class BoardNotLombok {
    private String subject;
    private String content;
    private String writer;

    public BoardNotLombok(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
    // 주제를 반환하는 메소드
    public String getSubject() {
        return subject;
    }
    // 주제를 설정하는 메소드
    public void setSubject(String subject) {
        this.subject = subject;
    }
    // 내용을 반환하는 메소드
    public String getContent() {
        return content;
    }
    // 내용을 설정하는 메소드
    public void setContent(String content) {
        this.content = content;
    }
    // 글쓴이를 반환하는 메소드
    public String getWriter() {
        return writer;
    }
    // 글쓴이를 설정하는 메소드
    public void setWriter(String writer) {
        this.writer = writer;
    }
}
