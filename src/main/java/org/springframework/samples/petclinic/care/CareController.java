package org.springframework.samples.petclinic.care;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CareController {
	
	@Autowired
	private CareService careService;
	
	
	private static final String VIEWS_CARE_CREATE_OR_UPDATE_FORM= "createOrUpdateProvidedCareForm.jsp";
	
	@GetMapping(path ="/visit/{visitId}/care/create")
	 public String InitCreationForm(ModelMap modelmap){
		String view = VIEWS_CARE_CREATE_OR_UPDATE_FORM;
		//modelmap.addAttribute("providedCare", new ProvidedCare());
		modelmap.addAttribute("cares", careService.getAllCaresProvided());
		return view;
	 }
    
}
