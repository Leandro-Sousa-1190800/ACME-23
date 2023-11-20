package com.isep.acme.application.mapping;

import com.isep.acme.domain.User;
import com.isep.acme.application.dto.UserView;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class UserViewMapper {

    public abstract UserView toUserView(User user);
}
