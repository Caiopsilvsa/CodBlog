package com.spring.CodeBlog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


import com.spring.CodeBlog.models.Post;
import com.spring.CodeBlog.repositories.PostRepository;



@Service
@Transactional
public class PostService {

	@Autowired
	PostRepository postrepository;
	
	public List <Post> FindAll(){
		
     return postrepository.findAll();
		
	}
	
   
   public Post FindById(Long id) {
    	
    	return postrepository.findById(id).get();
    	
    	
    }
	
   @Transactional
   public Post save (Post post) {
	   
	  Post result = postrepository.saveAndFlush(post);
	   return result;
	   
   }
    
    
    
    
    
    
    
    
    
    
    
    
}
