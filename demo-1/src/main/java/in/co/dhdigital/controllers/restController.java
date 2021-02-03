package in.co.dhdigital.controllers;

import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.dhdigital.models.RetriveOnlineStatementRequest;
import in.co.dhdigital.models.RetriveOnlineStatementResponce;

@RestController
@RequestMapping("/api")
public class restController {

	@GetMapping("/{name}")
	public String sayhi(@PathVariable String name)
	{
		String msg;
		msg="Hello "+name+"....!";		
		return msg;
		
	}
	
	
	@GetMapping("/RetrieveOnlineStatement")
	public RetriveOnlineStatementResponce retriveOnlineStatement(@RequestBody RetriveOnlineStatementRequest req )
	{
		RetriveOnlineStatementResponce res = new RetriveOnlineStatementResponce();
		
		if (req.getAccountNumber().isEmpty()||req.getExemptCharge().isEmpty()||req.getFromDate().isEmpty()||req.getRestartAmount().isEmpty()||req.getRestartRecNo().isEmpty()||req.getToDate().isEmpty())
		{
			res.setSuccess("FAIL");
			res.setFault("902 : Invalid Inputs");
		}
		else
		{
			res.setSuccess("SUCCESS");
			res.setFault("NULL");
		}
			
			
		return res;
		
	}
	
}
