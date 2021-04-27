package com.spring.CodeBlog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.CodeBlog.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long  >{
	
	
	
	

}
