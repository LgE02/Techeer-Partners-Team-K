package noticboard.notic.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository{ //인터페이스 멤버 리포지토리를 인플리먼트(구체,구현)
    //구현 클래스 / 역할(추상화)-MemberRepository에 구체화(MemoryMemberRepository)가 의존
    private static Map<Long, Member> store = new HashMap<>();
    //store맵을 멤버저장소로 사용

    @Override //멤버 추가
    public void save(Member member){
        store.put(member.getId(), member);
    }

    @Override //멤버를 조회
    public Member findById(Long memberId){
        return store.get(memberId);
    }

}
