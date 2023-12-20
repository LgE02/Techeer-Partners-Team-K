package noticboard.notic.board;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Component
public class MemoryBoardRepository {
    private static final Map<Long,Board> store = new HashMap<>();
    //실제 게시글을 저장하는 Map. 게시글의 ID를 키로 하고, 게시글 객체를 값으로 하는 맵
    private static long sequence = 0L;
    //게시글의 번호를 생성하기 위한 시퀀스 값

    public Board save(Board board){ // 게시판 저장
        board.setNum(++sequence); // 게시판 번호 할당
        store.put(board.getNum(), board); //맵에 게시글 저장
        return board; //저장된 게시글 반환
    }

    public Board findByNum(Long num){ //특정 번호의 게시글의 조회하는 메서드
        return store.get(num);  //해당 번호를 키로 게시글을 맵에서 조회
    }



}
