package com.navneet.projects.airBnbApp.service;

import com.navneet.projects.airBnbApp.dto.ProfileUpdateRequestDto;
import com.navneet.projects.airBnbApp.dto.UserDto;
import com.navneet.projects.airBnbApp.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
