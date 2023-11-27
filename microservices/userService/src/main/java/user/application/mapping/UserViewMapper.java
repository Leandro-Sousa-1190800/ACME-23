package user.application.mapping;

import org.mapstruct.Mapper;
import user.application.dto.UserView;
import user.domain.User;

@Mapper(componentModel = "spring")
public abstract class UserViewMapper {

    public abstract UserView toUserView(User user);
}
