package jana60.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Departments;
import jana60.Repository.DepartmentsRepository;

@Controller
@RequestMapping("/")
public class DepartmentsController {

	@Autowired
	private DepartmentsRepository repo;

	@GetMapping
	public String homepage(Model model) {
		return "homepage";
	}

	@GetMapping("/departments")
	public String departments(Model model) {
		List<Departments> departmentList = (List<Departments>) repo.findAll();
		model.addAttribute("departmentList", departmentList);
		return "departments";
	}

	@GetMapping("/{id}")
	public String currentDepartment(Model model, @PathVariable(name = "departmentId") Integer departmentPrimaryKey) {

		Departments currentDepartment = repo.findById(departmentPrimaryKey).get();

		model.addAttribute("departments", currentDepartment);
		return "DepartmentDetails";

	}

}
