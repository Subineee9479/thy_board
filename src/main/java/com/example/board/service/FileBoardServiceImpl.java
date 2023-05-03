package com.example.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.bean.FileBoardVO;
import com.example.board.mapper.FileBoardMapper;

@Service
public class FileBoardServiceImpl implements FileBoardService{

	@Autowired
	FileBoardMapper fileboardmapper;

	@Override
	public List<FileBoardVO> getFileBoardList() {
		return fileboardmapper.getFileBoardList();
	}

	@Override
	public FileBoardVO fileBoardDatail(int b_no) {
		return fileboardmapper.fileBoardDetail(b_no);
	}

	@Override
	public int fileBoardInsert(FileBoardVO fileBoard) {
		return fileboardmapper.fileBoardInsert(fileBoard);
	}

	@Override
	public int fileBoardUpdate(FileBoardVO fileBoard) {
		return fileboardmapper.fileBoardUpdate(fileBoard);
	}

	@Override
	public int fileBoardDelete(int bno) {
		return fileboardmapper.fileBoardDelete(bno);
	}
	
	
	
}
