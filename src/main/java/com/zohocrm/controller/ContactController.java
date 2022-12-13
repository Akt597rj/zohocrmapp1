package com.zohocrm.controller;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
//import com.zohocrm.entities.Lead;
//import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactService;

@Controller
public class ContactController {
	
	//@Autowired
    private ContactService contactService;	
	
	 public ContactController(ContactService contactService) {
		
		this.contactService = contactService;
	}

		//http://localhost:8080/zohocrmapp/listAllContact
		@GetMapping("/listAllContact")
		public String listAllContact(Model model) {
			
		  List<Contact> contacts = contactService.getAllContact();
		  model.addAttribute("contacts", contacts);
					
			  return "list_contacts";
		}
		
		@RequestMapping("/contactInfo")
		public String contactInfo(@RequestParam("id") long id,Model model) {
			 Contact contact = contactService.findContactById(id);
			 model.addAttribute("contact", contact);
			
			return "contact_info";
			
		}
		
		
	
	

}
