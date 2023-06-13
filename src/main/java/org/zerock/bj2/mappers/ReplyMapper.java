package org.zerock.bj2.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.zerock.bj2.dto.PageRequestDTO;
import org.zerock.bj2.dto.ReplyDTO;

public interface ReplyMapper {

    int insert(ReplyDTO ReplyDTO); // 댓글

    int updateGno(Long rno); // gno 값을 rno값으로 변경

    int insertChild(ReplyDTO replyDTO); // 대댓글

    // limit 은 PageRequestDTO 처리 tno =100 -> tno를 처리하기위해 파라미터 한개 더 받기
    List<ReplyDTO> selectList(@Param("tno")Long tno , @Param("pr")PageRequestDTO pageRequestDTO); 

    ReplyDTO selectOne(Long rno);

    @Select("select count(rno) from tbl_reply2 where tno = #{tno}")
    int getTnoCount(Long tno);

    
}
