package org.example.userservice.service;

import lombok.RequiredArgsConstructor;
import org.example.userservice.domain.User;
import org.example.userservice.dto.UserDto;
import org.example.userservice.infrastructure.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        userDto.setUserId(UUID.randomUUID().toString());

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        User user = mapper.map(userDto, User.class);
        user.setEncryptedPwd("encrypted_Password");

        userRepository.save(user);

        UserDto returnUserDto = mapper.map(user,UserDto.class);

        return returnUserDto;
    }
}
