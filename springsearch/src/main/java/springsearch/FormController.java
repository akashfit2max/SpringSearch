package springsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	@RequestMapping("/form")
	public String complexform() {
		String a = null;
		System.out.println(a.length());
		return "complexform";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student, BindingResult result) {

		if (result.hasErrors()) {
			return "complexform";
		}

		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}

}
