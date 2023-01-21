package com.fastcampus.snsproject.controller;


import com.fastcampus.snsproject.controller.request.UserJoinRequest;
import com.fastcampus.snsproject.controller.response.Response;
import com.fastcampus.snsproject.controller.response.UserJoinResponse;
import com.fastcampus.snsproject.model.User;
import com.fastcampus.snsproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public Response<UserJoinResponse> join(@RequestBody UserJoinRequest request){

        User user = userService.join(request.getUserName(),request.getPassword());

        return Response.success(UserJoinResponse.fromUser(user));
    }

}
