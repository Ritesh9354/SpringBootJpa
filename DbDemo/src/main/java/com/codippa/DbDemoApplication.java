package com.codippa;


import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.codippa.Entity.Post;
import com.codippa.Repo.PostRepo;

@SpringBootApplication
public class DbDemoApplication {

	public static void main(String[] args) {
    ApplicationContext context =SpringApplication.run(DbDemoApplication.class, args);
	
 PostRepo repo	=context.getBean(PostRepo.class);
	
       Post post1 = new Post();
       post1.setName("rahul");
       post1.setCity("mumbai");
       
       Post post2 = new Post();
       post2.setName("rohit");
       post2.setCity("up");
       
       Post post3 = new Post();
       post3.setName("kalu");
       post3.setCity("puna");
 //      save 1 0ne user at a time 
//      Post post1 = repo.save(post);
//       System.out.println(post1);
       // save All user At one time 
//       List<Post> user = List.of(post1,post2,post3);
//         Iterable<Post> saveAll = repo.saveAll(user);
//         System.out.println(saveAll);
       
       // update data 
//       Optional<Post> optional = repo.findById(3);
//               Post post =optional.get();
//               post.setName("Rohit y");
//               Post save = repo.save(post);
//               System.out.println(save);
         
       // how to fetch date from datebase
//        Iterable<Post> findAll = repo.findAll();
//        findAll.forEach(post ->System.out.println(post));
            repo.deleteById(4);
        System.out.println("Deleted");
	}

}
