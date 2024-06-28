package com.techlabs.test;

import java.security.Permission;

import com.techlabs.model.Person;

public interface PersonFactory {

	Person create(String name);

}
