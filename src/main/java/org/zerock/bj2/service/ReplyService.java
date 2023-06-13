package org.zerock.bj2.service;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.bj2.dto.PageRequestDTO;
import org.zerock.bj2.dto.PageResponseDTO;
import org.zerock.bj2.dto.ReplyDTO;

@Transactional //메소드 > 클래스 > 인터페이스 순으로 찾아감
public interface ReplyService {
    
    Long register(ReplyDTO replyDTO);

    PageResponseDTO<ReplyDTO> getList(Long tno, PageRequestDTO pageRequestDTO);
    
    ReplyDTO getOne(Long tno);
    
}
