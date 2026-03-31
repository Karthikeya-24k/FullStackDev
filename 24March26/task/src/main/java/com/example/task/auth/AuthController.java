package com.example.task.auth;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterRequest request){
        String messaqe = authService.register(request.getUsername(),request.getPassword());
        return new AuthResponse(null,messaqe);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request){
        String token = authService.login(request.getUsername(), request.getPassword());
        return new AuthResponse(token,"Login Successfull");
    }

    @GetMapping("/hello")
    public String hello(){
        return  "Hello you are authernticated";
    }
}
