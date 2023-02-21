package com.afriland.cbsobjects.rest;


import com.afriland.cbsobjects.responses.CustomerResponse;
import com.afriland.cbsobjects.responses.DataResponse;
import com.afriland.cbsobjects.responses.cbs.ClientResponse;
import com.afriland.cbsobjects.services.ICustomerServices;
import com.afriland.cbsobjects.services.ITokenServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author yves_labo
 *
 */
@RestController
@RequestMapping("/rest/api/cbs/customer")
@Tag(name = "Customer Services")
public class CustomerRestController {

	@Autowired
	private ICustomerServices customerService;


	@Operation(description = "Obtenir le detail des informaitons d'un client", summary = "Obtenir le detail des informaitons d'un client")
	@GetMapping("/getcustomerdetail/{codeclient}")
	public ResponseEntity<ClientResponse> getCustomerDetail(@PathVariable String codeclient){
		return customerService.getCustomerDetail(codeclient);
	}

}