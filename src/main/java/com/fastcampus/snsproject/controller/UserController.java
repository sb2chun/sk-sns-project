package com.fastcampus.snsproject.controller;


import com.fastcampus.snsproject.controller.request.UserJoinRequest;
import com.fastcampus.snsproject.controller.request.UserLoginRequest;
import com.fastcampus.snsproject.controller.response.Response;
import com.fastcampus.snsproject.controller.response.UserJoinResponse;
import com.fastcampus.snsproject.controller.response.UserLoginResponse;
import com.fastcampus.snsproject.model.User;
import com.fastcampus.snsproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    private final BCryptPasswordEncoder encoder;

    @GetMapping("/test")
    public String test(){
        return encoder.encode("test");

    }

    @PostMapping("/join")
    public Response<UserJoinResponse> join(@RequestBody UserJoinRequest request){

        User user = userService.join(request.getName(),request.getPassword());

        return Response.success(UserJoinResponse.fromUser(user));
    }

    @PostMapping("/login")
    public Response<UserLoginResponse> login(@RequestBody UserLoginRequest request){

        String token = userService.login(request.getName(), request.getPassword());

        return Response.success(new UserLoginResponse(token));
    }

}
