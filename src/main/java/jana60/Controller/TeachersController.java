package jana60.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Teachers;
import jana60.Repository.TeachersRepository;

@Controller
@RequestMapping("/teachers")
public class TeachersController {

	@Autowired
	private TeachersRepository repo;
	
	@GetMapping
	public String teachers(Model model) {
		List<Teachers> teacherList = (List<Teachers>) repo.findAll();
		model.addAttribute("teacherList", teacherList);
		return "teachers";
	}

}