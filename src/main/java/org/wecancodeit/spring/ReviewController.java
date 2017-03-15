package org.wecancodeit.spring;


	

	import java.util.Collection;

	import javax.annotation.Resource;


	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class ReviewController { 
		@Resource
	public ReviewRepository reviews;



		@RequestMapping("/showreviews")
		public String reviews (Model model) {
			model.addAttribute("reviews", reviews.findAll());
			return "reviews";
		}
	     @RequestMapping("/showreview")
	    public String review (@RequestParam("id")Long id, Model model) {
	        model.addAttribute("review", reviews.findOne(id));
	        return "review";
	     }

	}
