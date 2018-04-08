package com.venkat.tech.management.app.filesystem;

import com.venkat.tech.management.app.domain.User;

public interface UserRepository {
void save(User user);
void findAll();

}
