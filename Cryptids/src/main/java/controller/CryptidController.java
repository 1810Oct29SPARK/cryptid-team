package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import beans.Cryptid;

import service.CryptidService;

@Controller
@RequestMapping(value="/cryptid")
public class CryptidController {

	@Autowired
	private CryptidService cryptidService;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	@ResponseBody //return just data
	public ResponseEntity<List<Cryptid>> getAllcryptids(){
		return new ResponseEntity<>(cryptidService.getAllCryptids(), HttpStatus.OK);
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Cryptid> getCryptidById(@PathVariable int id){
		Cryptid c = cryptidService.getCryptidsById(id);
		if (c == null) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(c, HttpStatus.OK);
		}
	}
	
	@PostMapping(value="/add")
	@ResponseBody
	public ResponseEntity<String> addcryptid(@RequestBody Cryptid cryptid){
		ResponseEntity<String> resp = null;
		try {
			cryptidService.addCryptid(cryptid);
			resp = new ResponseEntity<>("cryptid CREATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE cryptid", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
}