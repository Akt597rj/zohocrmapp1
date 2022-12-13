package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactService;



@Controller
public class BillingController {
	
	@Autowired
	private BillingService billingService;
	
	@Autowired
    private ContactService contactService;	

	
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id") long id,Model model) {
		 Contact contact = contactService.findContactById(id);
		 model.addAttribute("contact", contact);
		
		return "generate_bill";
	}
		
	@PostMapping("/saveBill")
	public String saveBilling(@ModelAttribute("billing") Billing billing) {
		
		billingService.svaeOneBilling(billing);
			
			return "generate_bill";
		}


}