package com.devutility.test.dubbo.common.interfaces;

import com.devutility.test.dubbo.common.models.User;

public interface IUserService {
	User getUser(String name);
}