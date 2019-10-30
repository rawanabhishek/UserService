/******************************************************************************
 
 *  Purpose: This is interface of Note Service class  it handles  all the 
 *           request coming from controller and  then process   in service 
 *           implementation class where all the method of this service is 
 *           implemented .
 *  		 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   24-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.fundoo.note.service;



import com.bridgelabz.fundoo.note.dto.NoteDTO;
import com.bridgelabz.fundoo.note.dto.NoteUpdateDTO;

import com.bridgelabz.fundoo.note.response.Response;

public interface INoteService {
	

	/**
	 * Purpose: Method for adding new note for user 
	 * @param noteDTO containing note data which will  be later map to the note 
	 *        model .
	 * @param token containing user details for which the particular note will
	 *        be created . To read the data of the token we are parsing the 
	 *        token and getting the user data.
	 * @return Response object containing status code , message 
	 *         and object .
	 */
	public Response add(NoteDTO noteDTO , String token) ;
	
	/**
	 * Purpose: Method for getting all the note of a given user
	 * @param emailIdToken token containing email id 
	 * @return Response object containing status code , message 
	 *         and object .
	 */
	public Response get(String emailIdToken);
	
	/**
	 * Purpose: Method for updating notes of a particular user 
	 * @param updateDTO containing the updated data for a particular note
	 *        and setting its value to model and saving it to the
	 *        database.
	 * @param noteIdToken token containing note id 
	 * @return Response object containing status code , message 
	 *         and object .
	 */
	public Response update(NoteUpdateDTO updateDTO , String noteIdToken) ;
	
	/**
	 * Purpose:Method for deleting notes of a particular user 
	 * @param emailIdToken token containing email id 
	 * @param noteIdToken token containing note id 
	 *        
	 * @return Response object containing status code , message 
	 *         and object .
	 */
	public Response delete(String noteIdToken , String emailIdToken);
	
	
	/**
	 * Purpose: Method for pin and unpin note
	 * @param emailIdToken token containing email id 
	 * @param noteIdToken token containing note id 
	 * @return Response object containing status code , message 
	 *         and object .
	 */
	public Response pin(String noteIdToken , String emailIdToken);
	
	
	
	/**
	 * Purpose: Method for archive and unarchive a note
	 * @param emailIdToken token containing email id 
	 * @param noteIdToken token containing note id 
	 * @return Response object containing status code , message 
	 *         and object .
	 */
	public Response archive(String noteIdToken , String emailIdToken );
	
	/**
	 * Purpose: Method for  unarchive a note and Setting the Pin true
	 *@param emailIdToken token containing email id 
	 * @param noteIdToken token containing note id 
	 * @return Response object containing status code , message 
	 *         and object .
	 */
	public Response archivePin(String noteIdToken , String emailIdToken );
	
	/**
	 * Purpose:Method for trash and untrash a note
	 * @param emailIdToken token containing email id 
	 * @param noteIdToken token containing note id 
	 * @return Response object containing status code , message 
	 *         and object .
	 */
	public Response trash(String noteIdToken , String emailIdToken);
	
	
	/**
	 * Purpose: Method for sorting notes of a user by updated date
	 *@param emailIdToken token containing email id 
	 * @return Response object containing status code , message 
	 *         and object .
	 */
	public Response sortDate(String emailIdToken);
	
	/**
	 * Purpose: Method for sorting notes of a user by name (title()  
	 * @param emailIdToken token containing email id 
	 * @return Response object containing status code , message 
	 *         and object .
	 */
	public Response sortName(String emailIdToken);

}
