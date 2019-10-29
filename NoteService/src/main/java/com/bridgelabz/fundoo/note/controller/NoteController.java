/******************************************************************************
 
 *  Purpose: A  Class implemented for handling the request coming from the user
 *           and Controlling it through RestController annotation using spring 
 *           boot that will handle all the request related to that user.
 *  		
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   24-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.fundoo.note.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.fundoo.note.dto.NoteDTO;
import com.bridgelabz.fundoo.note.dto.NoteUpdateDTO;

import com.bridgelabz.fundoo.note.response.Response;
import com.bridgelabz.fundoo.note.service.INoteService;


@RestController
@RequestMapping("/user/note")
public class NoteController {
	
	
	@Autowired
	private INoteService noteService;
	
	public static final Logger LOG = LoggerFactory.getLogger(NoteController.class);
	
	
	/**
	 * Purpose: Creating a addNote controller which will fetch the request body
	 * and send it to the service.
	 * @param noteDTO object containing user addNote details
	 * @param token containing user details 
	 * @return ResponseEntity containing Response which contains status code,
	 *         message and object
	 * 
	 */
	@PostMapping("/")
	public ResponseEntity<Response> add(@RequestBody NoteDTO noteDTO ,@RequestHeader String token) {
		
		return new ResponseEntity<>(noteService.add(noteDTO ,token),HttpStatus.OK);
	}
	
	
	/**
	 * Purpose: Creating a getNote controller which will fetch the header
	 * and send it to the service.
	 * @param userId  containing user id.
	 * @return ResponseEntity containing Response which contains status code,
	 *         message and object
	 * 
	 */
	@GetMapping("/")
	public ResponseEntity<Response> get(@RequestHeader(name="user") String user){
		return new ResponseEntity<>(noteService.get(user),HttpStatus.OK);
	}
	
	
	/**
	 *  Purpose: Creating a updateNote controller which will fetch the request body
	 * @param updateDTO containing new update data for a particular note 
	 * @return ResponseEntity containing Response which contains status code,
	 *         message and object
	 * 
	 */
	@PutMapping("/")
	public ResponseEntity<Response> update(@RequestBody NoteUpdateDTO updateDTO) {
		
		return new ResponseEntity<>(noteService.update(updateDTO),HttpStatus.OK);
	}
	

	/**
	 *  Purpose: Creating a deleteNote controller which will fetch the header
	 * @param id of a particular note
	 * @return ResponseEntity containing Response which contains status code,
	 *         message and object
	 */
	@DeleteMapping("/")
	public ResponseEntity<Response> delete(@RequestHeader int id){
		return new ResponseEntity<>(noteService.delete(id),HttpStatus.OK);
	}
	

	/**
	 *  Purpose: Creating a pin controller which will fetch the header
	 * @param id of a particular note
	 * @return ResponseEntity containing Response which contains status code,
	 *         message and object
	 */
	@PutMapping("/pin")
	public ResponseEntity<Response> pin(@RequestHeader int id){
		return new ResponseEntity<>(noteService.pin(id),HttpStatus.OK);
	}
	

	/**
	 *  Purpose: Creating a archive controller which will fetch the header
	 * @param id of a particular note
	 * @return ResponseEntity containing Response which contains status code,
	 *         message and object
	 */
	@PutMapping("/archive")
	public ResponseEntity<Response> archive(@RequestHeader int id){
		return new ResponseEntity<>(noteService.archive(id),HttpStatus.OK);
	}
	
	
	
	/**
	 *  Purpose: Creating a trash controller which will fetch the header
	 * @param id of a particular note
	 * @return ResponseEntity containing Response which contains status code,
	 *         message and object
	 */
	@PutMapping("/trash")
	public ResponseEntity<Response> trash(@RequestHeader int id){
		return new ResponseEntity<>(noteService.trash(id),HttpStatus.OK);
	}
	
	
	/**
	 *  Purpose: Creating sortDate controller which fetch the header
	 * @param user unique detail of a particular user 
	 * @return ResponseEntity containing Response which contains status code,
	 *         message and object
	 */
	@GetMapping("/date")
	public ResponseEntity<Response> sortDate(@RequestHeader(name="user") String user){
		return new ResponseEntity<>(noteService.sortDate(user),HttpStatus.OK);
	}
	
	/**
	 *  Purpose: Creating sortName controller which fetch the header
	 * @param user user unique detail of a particular user
	 * @return ResponseEntity containing Response which contains status code,
	 *         message and object
	 */
	@GetMapping("/name")
	public ResponseEntity<Response> sortName(@RequestHeader (name="user") String user){
		return new ResponseEntity<>(noteService.sortName(user),HttpStatus.OK);
	}

}
