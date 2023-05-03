package com.example.board.service;

import java.util.List;

import com.example.board.bean.FileBoardVO;

public interface FileBoardService {
	List<FileBoardVO> getFileBoardList();
	FileBoardVO fileBoardDatail(int b_no);
	int fileBoardInsert(FileBoardVO fileBoard);
	int fileBoardUpdate(FileBoardVO fileBoard);
	int fileBoardDelete(int bno);
}
