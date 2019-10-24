 
/******************************************************************************
 *  Purpose: To create a  Common File class which holds all the 
 *           static references which can be used in user Service
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   24-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.fundoo.note.utility;

public class CommonFiles {
	
	//userService related message
	public static final String ADD_NOTE_SUCCESS="Note added successful";
	public static final String ADD_NOTE_FAILED="Adding note failed";
	public static final String DELETE_NOTE_SUCCESS="delete note successfully";
	public static final String UPDATE_NOTE_SUCCESS=" note updated successfully";
	public static final String UPDATE_NOTE_FAILED=" note updation failed";
	public static final String GET_NOTE_SUCCESS="Notes fetched successfully";
	public static final String PIN_SUCCESS="Pin operation has been done successfull";
	public static final String ARCHIVE_SUCCESS="Archive operation has been done successfull";
	public static final String TRASH_SUCCESS="Trash operation has been done successfull";
	

	
	//Email Subject messages
	public static final String EMAIL_SUBJECT_SETPASSWORD="Link For resetting password";
	public static final String EMAIL_SUBJECT_VERIFY="Verification mail for user Authorization";
	
	//token key message
	public static final String TOKEN_KEY="secretKey";
	
	
	//url message for different functionality of user service
	public static final String VERIFY_URL="http://localhost:8080/user/verify/";	
	public static final String SET_PASSWORD_URL="http://localhost:8080/user/setpassword/";

	
	//User service Methods messages
	public static final String SERVICE_LOGIN_METHOD="Login service method";
	public static final String SERVICE_FORGOTPASSWORD_METHOD="Forgot Password service method";
	public static final String SERVICE_SETPASSWORD_METHOD="Set password service method";
	public static final String SERVICE_REGISTER_METHOD="Register service method";
	public static final String SERVICE_ISVERIFIED_METHOD="Is verified service method";
	public static final String SERVICE_SENDMAIL_METHOD="Send mail service method";
	
	
	
	//User controller messages
	public static final String CONTROLLER_LOGIN_METHOD="Login controller method";
	public static final String CONTROLLER_FORGOTPASSWORD_METHOD="Forgot Password controller method";
	public static final String CONTROLLER_SETPASSWORD_METHOD="Set password controller method";
	public static final String CONTROLLER_REGISTER_METHOD="Register controller method";
	public static final String CONTROLLER_ISVERIFIED_METHOD="Is verified controller method";
	
	

}
