package jana60.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Degrees;
import jana60.Repository.DegreesRepository;


@Controller
@RequestMapping("/degrees")
public class DegreesController {
	
	@Autowired
	private DegreesRepository repo;
	
	@GetMapping
	public String degrees(Model model) {
		List<Degrees> degreestList = (List<Degrees>) repo.findAll();
		model.addAttribute("degreesList", degreestList);
		return "degrees";
	}

}
