package com.sitemanagment.customerservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sitemanagment.customerservice.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin
@RefreshScope
public class CustomerResource {

	@Autowired
	private CustomerService customerService;
	
	
}
