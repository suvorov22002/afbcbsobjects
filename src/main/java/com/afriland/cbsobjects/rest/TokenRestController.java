package com.afriland.cbsobjects.rest;


import com.afriland.cbsobjects.responses.DataResponse;
import com.afriland.cbsobjects.services.ITokenServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author yves_labo
 *
 */
@RestController
@RequestMapping("/rest/api/cbs/token")
@Tag(name = "Token Services")
public class TokenRestController  {

	@Autowired
	private ITokenServices tokenService;


	@Operation(description = "Obtenir le token pour l'appel de services du CBS", summary = "Obtenir le token pour l'appel de services du CBS")
	@GetMapping("/tokencbs")
	public ResponseEntity<DataResponse> getToken(){
		return tokenService.getToken();
	}

}