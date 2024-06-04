package ar.edu.unlp.oo2.persitencia;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UserProxy implements PersistableUser {
	private User user;
	private PostRepository postRepo;
	private UserRepository userRepo;
	
	
	public UserProxy() {
		PostRepository postRepo = new PostRepository();
		this.postRepo = postRepo;
		UserRepository userRepo = new UserRepository();
		this.userRepo = userRepo;

		
	}

	public String getUsername(){
		return this.user.getUsername();
	}
		
	public String getEmail(){
		return this.user.getEmail();
	}


	public List<Post> getPosts(){
		return this.user.getPosts();
	}
	
	
	public List<Post> findPostsByUsername(String aUsername) {
		return this.postRepo.findPostsByUsername(this.getUsername());
	}
	
	public PersistableUser findUserByUsername(String aUsername) {
		return this.userRepo.findUserByUsername(this.getUsername());
	}
	

}
