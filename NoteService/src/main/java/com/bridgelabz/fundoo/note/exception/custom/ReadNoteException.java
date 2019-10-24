/******************************************************************************
 
 *  Purpose: To create a custom exception handler for ReadNote API of 
 *           UserService.
 *  		
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   24-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.fundoo.note.exception.custom;


public class ReadNoteException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	
	

	
	/**
	 *Purpose: To create a custom exception handler for ForgotPassword
	 *         API of UserService. 
	 * @param  message containing custom exception String.
	 */
	public ReadNoteException(String message ) {
		super(message);
	}

}
