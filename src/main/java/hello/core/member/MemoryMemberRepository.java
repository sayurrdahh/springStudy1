package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/*
* 멤버 저장소에 멤버를 저장하고 아이디로 멤버 찾기
    public interface MemberRepository
* */

@Component //memoryMemberRepository
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();

    //store 해쉬맵에 멤버 아이디와 멤버 정보(객체)저장
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    //store저장소에서 멤버 아이디 찾기
    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
