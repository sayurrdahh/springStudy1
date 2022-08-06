package hello.core.member;

//멤버 저장소에 멤버를 저장하고 아이디로 멤버 찾기
public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);

}
