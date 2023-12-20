package noticboard.notic.member;

public interface MemberService {//2가지 기능이 있어야 함 (회원 가입, 회원 조회)
    void join(Member member);  //회원 가입
    Member findMember(Long memberId);  //회원 조회(로그린)
}
