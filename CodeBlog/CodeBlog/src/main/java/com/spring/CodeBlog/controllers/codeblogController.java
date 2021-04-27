package com.spring.CodeBlog.controllers;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.spring.CodeBlog.models.Post;

import com.spring.CodeBlog.services.PostService;

@Controller
public class codeblogController {

	@Autowired
	 PostService postrepository;
	
	@GetMapping("/Post")
	public ModelAndView getPost() {
		
		List<Post> posts = postrepository.FindAll();
		ModelAndView mv = new ModelAndView("posts");
		mv.addObject("posts",posts);
		return mv;
		
	}
	
	
	@GetMapping("/Post/{id}")
	public ModelAndView postByid (@PathVariable("id")Long id)
	{
		
		ModelAndView mv = new ModelAndView("postbyid");
		Post post = postrepository.FindById(id);
		mv.addObject("post", post);
		return mv;
		
		
		
	}
	
	
	
	@RequestMapping(value="/newpost", method=RequestMethod.GET)
    public String getPostForm(){
        return "postform";
    }
	
	@RequestMapping(value="/newpost", method=RequestMethod.POST)
    public String savePost( Post post){
		post.setData(LocalDate.now());
        postrepository.save(post);
        return "redirect:/Post";
	}
	
	
	
	@GetMapping("/Ola")
	  public ModelAndView olaMundo(){
		
		  String teste = "olaMundo";
		  ModelAndView mv = new ModelAndView("ola");
		  mv.addObject("teste",teste);
		  return mv;
	
		
		
	}
	
	
	
	 
		

	
	
}