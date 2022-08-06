package hello.core.member;

//멤버 서비스는 가입 기능과 아이디로 멤버 찾기 기능
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);

}
