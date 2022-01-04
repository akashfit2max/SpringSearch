package springsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("this is home view....");
		return "home";
	}

	@RequestMapping("dosearch")
	public RedirectView search(@RequestParam("query") String q) {
		String url = "https://www.google.com/search?q=" + q;

		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}

	@RequestMapping("/form")
	public String complexform() {
		return "complexform";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student) {
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}
}
