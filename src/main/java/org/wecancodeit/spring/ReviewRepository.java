package org.wecancodeit.spring;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class ReviewRepository {
	 private Map<Long, Reviews> reviews = new HashMap<Long, Reviews>();
	public ReviewRepository() {
      long id = 1;
   
	 Reviews review = new Reviews(1L, "Drone", " A solid product, and arrived just as described!", "/images/dronepic.jpg", "Grown-Up Toys");
	 reviews.put(id, review);
	
	 reviews.put(2L, new Reviews(2L,"Codeapillar"," My three year old grandson really enjoys it.","/images/codeapillar.jpg","Kid's Learning Toys"));
	 reviews.put(3L, new Reviews(3L, "Electronic Keyboard", "Good sound, easy to use really and keys are large enough as to be able to play chords, etc.", "/images/ke.jpg", "musical toys"));
	
	 
	
	
	}
       public Collection<Reviews> findAll(){
    	   Collection<Reviews> reviewMap = reviews.values();
		 return reviewMap;
		 
	 }

	     public Reviews findOne(Long id){
	    	 Reviews reviewId  =  reviews.get(id);
		 return reviewId;
	
	}	
}

