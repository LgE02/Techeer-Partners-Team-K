package noticboard.notic.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component//스프링 설정 정보
@RequiredArgsConstructor//final이 붙은 필드의 생성자를 자동생성
public class MemberServiceImpl implements MemberService { //멤버 서비스의 구현체
    //구현 클래스 / 역할(추상화)-MemberService에 구체화(MemberServiceImpl)가 의존

    private final MemberRepository memberRepository;
    //회원 정보를 얻기 위해서는 멤버 리포지토리 인터페이스가 필요
    //인터페이스만 가지고 있다면 널값을 불러오기에 구현객체(현재 impl페이지)를 입력해야함

    @Override
    public void join(Member member){ // 회원 저장 구현
        memberRepository.save(member);
        // save를 통해 MemoryMemberRepository 내부의 save가 호출
    }

    @Override
    public Member findMember(Long memberId) { //아이디로 회원 찾기 구현(로그인)
        return memberRepository.findById(memberId);
        //멤버 아이디를 통해 저장소에서 멤버 찾기
    }

}
