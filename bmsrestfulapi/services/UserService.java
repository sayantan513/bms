package com.bmsrestfulapi.services;

import java.util.List;

import com.bmsrestfulapi.entities.User;
import com.bmsrestfulapi.exceptions.EmptyUserListException;
import com.bmsrestfulapi.exceptions.InvalidCredentialsException;
import com.bmsrestfulapi.exceptions.NotLoggedInException;
import com.bmsrestfulapi.exceptions.UserNotCreatedException;
import com.bmsrestfulapi.exceptions.UserNotFoundException;

/*all methods for user operations*/
public interface UserService {

	public static final String STRING = "\"string\"";
	public static final String ADMIN = "admin";

	/* Get list of all non verified users */
	public List<User> getAllNotVerifiedUser() throws EmptyUserListException;

	/*
	 * Creating user if doesn't exist in database. Contact number and userId must
	 * not be same.
	 */
	public String createUser(User user) throws UserNotCreatedException;

	/* Verifying user by getting userId to fetch user details. */
	public String verifyUser(Integer userId, Integer adminId) throws InvalidCredentialsException, UserNotFoundException, NotLoggedInException;

	/* Checking account balance by fetching user by userId and matching pin. */
	public String checkBalance(Integer userId, Integer pin) throws InvalidCredentialsException, NotLoggedInException;

	/*
	 * Withdraw money from users account. Needs user's account number, amount to
	 * withdraw, pin
	 */
	public String withdrawMoney(Integer accountNo, Integer amount, Integer pin) throws InvalidCredentialsException, NotLoggedInException;

	/*
	 * Transfer money form one account to another user's account. Requires pin,
	 * amount, account Number of sender and receiver.
	 */
	public String moneyTransfer(Integer accountNo, Integer receiversAccountNo, Integer amount, Integer pin)
			throws InvalidCredentialsException, NotLoggedInException;

	/*
	 * Delete user's account and all details. Requires userId, adminId (only admin
	 * can delete user)
	 */
	public String deleteUserById(Integer userId, Integer adminId)
			throws UserNotFoundException, InvalidCredentialsException, NotLoggedInException;

	/*
	 * Updates user details. Requires user object, adminId(only admin can perform
	 * this action)
	 */
	public String updateUser(User user, Integer adminId) throws UserNotFoundException, InvalidCredentialsException, NotLoggedInException;

	/*
	 * Get List of all users in database. Requires adminId(only admin can perform
	 * this operation)
	 */

	public String getAllUsers(Integer adminId)
			throws EmptyUserListException, InvalidCredentialsException, UserNotFoundException, NotLoggedInException;

}
