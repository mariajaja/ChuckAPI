package co.grandcircus.chuck;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/jokes")
	public ModelAndView getJokes(@RequestParam("quantity") String quantity) {
		ListOfJokes jokes = rt.getForObject("http://api.icndb.com/jokes/random/" + quantity, 
				ListOfJokes.class);
		List<Joke> farts = jokes.getValue();
		// can do either to get to the list of Jokes
		// rt.getForObject("http://api.icndb.com/jokes/random/" + quantity, ListOfJokes.class).getValue();
		return new ModelAndView("random-jokes", "list", farts);
	}

}
