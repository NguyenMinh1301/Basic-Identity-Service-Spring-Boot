package com.devteria.identityservice.mapper;


import com.devteria.identityservice.dto.request.UserCreationRequest;
import com.devteria.identityservice.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
}
