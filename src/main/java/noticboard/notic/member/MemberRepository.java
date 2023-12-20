package noticboard.notic.member;

public interface MemberRepository {
    void save(Member member); //회원 저장
    Member findById(Long memberId); //아이디로 회원 찾는 기능
}
