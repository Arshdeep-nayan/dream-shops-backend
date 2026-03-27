package com.arshdeep.backend.dreamshops.service.user;

import com.arshdeep.backend.dreamshops.dto.UserDto;
import com.arshdeep.backend.dreamshops.model.User;
import com.arshdeep.backend.dreamshops.request.CreateUserRequest;
import com.arshdeep.backend.dreamshops.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
