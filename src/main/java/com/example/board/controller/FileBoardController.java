package com.example.board.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.board.bean.FileBoardVO;
import com.example.board.service.FileBoardService;

@Controller
@RequestMapping("/fileBoard")
public class FileBoardController {

	@Autowired
	FileBoardService fboardService;
	
	@RequestMapping("/list")
	private String fileBoardList (Model model, HttpServletRequest request) {
		
	List<FileBoardVO> testList = new ArrayList<>();
	testList = fboardService.getFileBoardList();
	model. addAttribute("testlist", testList);
	return "/fileBoard/list";
	}
	
	@RequestMapping("/detail/{b_no}")
	private String fileBoardDetail(@PathVariable("b_no") int b_no, Model model) {
	model.addAttribute("detail", fboardService.fileBoardDatail(b_no));
	return "fileBoard/detail";
	}
	
	@RequestMapping("/insert")
	private String fileBoardInsertForm(@ModelAttribute FileBoardVO board) {
	return "fileBoard/insert";
	}
	
	@RequestMapping ("/insertProc")
	private String fileBoardInsertProc(@ModelAttribute FileBoardVO board, HttpServletRequest request) {
	fboardService.fileBoardInsert (board) ;
	return "forward:/fileBoard/list";
	}
	
	@RequestMapping("update/{b_no)")
	private String fileBoardUpdateForm(@PathVariable("b_no") int b_no, Model model) {
	model.addAttribute("detail",fboardService.fileBoardDatail(b_no));
	return "fileBoard/update";
	}		
			
	@RequestMapping ("/updateProc")
	private String fileBoardUpdateProc(@ModelAttribute FileBoardVO board) {
		
	fboardService. fileBoardUpdate (board);
	int bno = board.getB_no();
	String b_no = Integer.toString(bno) ;
	return "redirect:/fileBoard/detail/"+b_no;
	}
	
	@RequestMapping ("/delete/{b_no)")
	private String fileBoardDelete(@PathVariable("b_no") int b_no) {
		fboardService.fileBoardDelete(b_no);
		return "redirect:/fileBoard/list";
	}
}
