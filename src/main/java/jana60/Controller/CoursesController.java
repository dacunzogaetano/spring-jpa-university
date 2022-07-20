package jana60.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.Repository.CoursesRepository;
import jana60.model.Courses;

@Controller
@RequestMapping("/courses")
public class CoursesController {

	@Autowired
	private CoursesRepository repo;

	
	
	@GetMapping
	public String courses(Model model) {
		List<Courses> coursesList = (List<Courses>) repo.findAll();
		model.addAttribute("coursesList", coursesList);
		return "courses";
	}
}