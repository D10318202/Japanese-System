package com.Japanese.Project.Japanese.Test.System.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Japanese.Project.Japanese.Test.System.entity.DifficultQuestion;
import com.Japanese.Project.Japanese.Test.System.repository.DifficultQuestionDao;

@Controller
public class backDifficultQuestionListController {
	
	@Autowired
	private DifficultQuestionDao difficultQuestionDao;
	
	@GetMapping(value = "/backDifficultQuestion")
	public String backDifficultQuestionList(Model model,
			                                HttpSession session) {
		
	   List<DifficultQuestion> difficultQuestion = difficultQuestionDao.findAll();												
	   model.addAttribute("difficultQuess", difficultQuestion);
	   return "backDifficultQuestionList";		
	}
	

}
