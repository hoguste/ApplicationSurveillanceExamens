package com.exam.myapp.controller;

@Controller
@RequestMapping(value = "/enseignant")
public class SalleController {

	@Autowired
	private SalleService salService;

	public SalleService getSalService() {
		return salService;
	}

	public void setSalService(SalleService salService) {
		this.salService = salService;
	}

	@RequestMapping(value = "/ajout", method = RequestMethod.POST)
	public String ajout(Salle salle) {

		salService.ajout(salle);

		return "redirect:findAll";
	}

	@RequestMapping(value = "/suppr", method = RequestMethod.DELETE)
	public String suppr(Long id) {

		salService.suppr(id);

		return "redirect:findAll";
	}

	@RequestMapping(value = "/modif", method = RequestMethod.POST)
	public String modif(Salle salle) {

		salService.modif(salle);

		return "redirect:findAll";
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String find(Long id, ModelMap model) {

		model.addAttribute("findSalle", salService.find());

		return "salle";
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public String findAll(ModelMap model) {

		model.addAttribute("allSalle", salService.findAll());

		return "salle";

	}

}
