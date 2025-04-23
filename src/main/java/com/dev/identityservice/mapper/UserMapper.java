package com.dev.identityservice.mapper;


import com.dev.identityservice.dto.request.UserCreationRequest;
import com.dev.identityservice.dto.request.UserUpdateRequest;
import com.dev.identityservice.dto.response.UserResponse;
import com.dev.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
