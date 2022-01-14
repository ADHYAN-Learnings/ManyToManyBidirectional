package com.org.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.InterfService.InterfaceAddressService;
import com.org.modal.Address;
import com.org.modal.CoachingInstitute;

@Controller
@RequestMapping("/address")
public class addressController {
	
	@Autowired
	InterfaceAddressService addressService;
	
	
	@GetMapping("/totalDetails")
	public String getAllDetails(Model model) {
		model.addAttribute("address", addressService.getAllDetails());
		return "address";
	}

}
