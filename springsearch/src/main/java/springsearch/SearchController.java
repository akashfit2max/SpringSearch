package springsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

//	uri hainding using pathvariable

	@RequestMapping("user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
		System.out.println("name = " + userName);
		System.out.println("id = " + userId);

//		for number format exception

//		Integer.parseInt(userName);

		return "home";
	}

	@RequestMapping("/home")
	public String home() {
//		processing form area
//	making an exception

		System.out.println("this is home view....");
//		String s = null;
//		System.out.println(s.length());
		return "home";
	}

	@RequestMapping("dosearch")
	public RedirectView search(@RequestParam("query") String q) {
		String url = "https://www.google.com/search?q=" + q;

		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}

//	handling exception in spring mvc

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ NullPointerException.class })
	public String exceptionHandler(Model model) {
		model.addAttribute("msg", "Null pointer exception has occured");
		return "error_page";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ NumberFormatException.class })
	public String exceptionHandlerNumberFormat(Model model) {
		model.addAttribute("msg", "Number format exception has occured");
		return "error_page";
	}

//	generic exception handling

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ Exception.class })
	public String exceptionHandlerGeneric(Model model) {
		model.addAttribute("msg", "exception has occured");
		return "error_page";
	}

}
