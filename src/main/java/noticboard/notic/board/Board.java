package noticboard.notic.board;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class Board {

    private Long num; //게시판 번호;
    private String title; //글 제목
    private String content; // 글 내용
    private String writer; //작성자
    private Date date; //등록일
}
