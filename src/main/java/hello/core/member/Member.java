package hello.core.member;

//멤버 정보는 고객의 아이디, 이름, 등급이 들어간다. private 이니까 게터세터를 사용해주자.
public class Member {

    private Long id;
    private String name;
    private Grade grade;

    //생성자 : ctrl enter
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
