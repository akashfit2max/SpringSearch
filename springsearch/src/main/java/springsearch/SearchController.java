package springsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

//	uri hainding using pathvariable

	@RequestMapping("user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
		System.out.println("name = " + userName);
		System.out.println("id = " + userId);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
//		processing form area
//	making an exception

		System.out.println("this is home view....");
		String s = null;
		System.out.println(s.length());
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
	public String formHandler(@ModelAttribute("student") Student student, BindingResult result) {

		if (result.hasErrors()) {
			return "complexform";
		}

		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}

	@ExceptionHandler({NullPointerException.class})
	public String exceptionHandler() {
		return "error_page";
	}
}
