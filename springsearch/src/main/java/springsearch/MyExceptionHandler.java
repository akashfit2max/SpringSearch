package springsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

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
