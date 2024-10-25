package com.TMDT.services;

import com.TMDT.models.User;

public interface UserService {
	User findByUserName(String userName);
}
