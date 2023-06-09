package com.example.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.bean.FileBoardVO;

@Mapper
public interface FileBoardMapper {
	
	List<FileBoardVO> getFileBoardList(); // 게시글 리스트 출력
	FileBoardVO fileBoardDetail(int b_no); // 게시글 세부내용 보기
	int fileBoardInsert(FileBoardVO fileBoard); // 게시글 작성
	int fileBoardUpdate(FileBoardVO fileBoard); // 게시글 수정
	int fileBoardDelete(int bno); // 게시글 삭제
}
