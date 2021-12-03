package com.changejp.yang.Calculator;

import javax.servlet.http.HttpSession;
import javax.swing.text.Document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class CalclatorController {
	
	
	@RequestMapping(value = {"/calculate"}, method = {RequestMethod.POST})
	public String excute(
			Model model, 
			HttpSession session) {
		session.setAttribute("result", )
		double result = 
		model.addAttribute("result", );
		
		return"redirect:/";
		
	}
	
	
	/*
	@RequestMapping(value = {"1"}, method = {RequestMethod.POST})
	public String index(
			//@RequestParam(name = "but1", required = false, defaultValue = "1") String entering,
			Model model, 
			HttpSession session
			) {	
		
		session.setAttribute("numberEntering", true);
		session.setAttribute("result", entering);
		
		model.addAttribute("display", entering);
		
		return "redirect:/";
		
	}
	
	@RequestMapping(value = {"+"}, method = {RequestMethod.POST})
	public String index(
			@RequestParam(name = "but+", required = false, defaultValue = "+") String entering,
			Model model, 
			HttpSession session
			) {
		
		double savedNumber = session.getAttribute("savedNumber");
		Calculator calculator = new Calculator(entering, savedNumber, numberEntering, operator, result);
		
		session.setAttribute("numberEntering", numberEntering);
		
		return "redirect:/";
	}
	*/
	
	
	/*
	@RequestMapping(value = {"/"}, method = {RequestMethod.GET})
	public String index(Model model, HttpSession session) {
		
		int result;
		
		if(session.getAttribute("result") != null) {
	    	result = Integer.parseInt((String) session.getAttribute("result")); 
	    }else {
	    	result = 0;
	    };
		
		model.addAttribute("result", Integer.toString(result));
		
		return "calculator";
		
	}
	

	@RequestMapping(value = {"/calculate"}, method = {RequestMethod.POST})
	public String calculator(
			@RequestParam(name = "currentNumber", required = false, defaultValue = "0") int currentNumber,
			HttpSession session,
			Model model
			) {

		//計算
		//セッションに保存された前回の計算結果を取り出す
		int savedNumber;
		int result;
		
	    if(session.getAttribute("result") != null) {
	    	savedNumber = Integer.parseInt((String) session.getAttribute("result")); 
	    }else {
	    	savedNumber = 0;
	    };
	    
		result = savedNumber +currentNumber;
		
		//セッションに計算結果を保存
		session.setAttribute("result", Integer.toString(result));
		
		//計算結果をフロントに渡す
		
		System.out.println("saved" + savedNumber);
		System.out.println("current" + currentNumber);
		System.out.println("result" + result);

		return "redirect:/";
		
	}
	
	@RequestMapping(value = {"/clear"}, method = RequestMethod.GET)
	public String MemoryCleaner(HttpSession session){
		
		//セッションの中身をクリア
		session.removeAttribute("result");
		
		return "redirect:/";
	}
	*/
	
			
}
	
