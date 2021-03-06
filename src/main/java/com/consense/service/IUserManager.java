package com.consense.service;

import java.io.File;
import java.util.List;

import com.consense.model.User;
import com.consense.model.UserFeature;

public interface IUserManager {

	User authenticateUser(User user);
	User getUser(String email);
	User getUserById(Integer userId);
	int addUser(User user);
	List<User> getAllUsers();
	List<UserFeature> getUserFeatures(Integer userId);
	List<UserFeature> getFeaturesOfUser(Integer requesterId, Integer profileOwnerId);
	void addUserFeature(Integer userId, UserFeature feature);
	String setUserImage(Integer userId, String filepath);
	File getUserImage(Integer userId);
	List<User> findUsersInProximity(Integer userId);
}
