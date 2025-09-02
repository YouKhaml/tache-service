package org.example.tacheservice.feign;

import org.example.tacheservice.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "USER-SERVICE")
public interface UserRestClient {
    @GetMapping("/users/user/{id}")
    UserDTO getUser(@PathVariable("id") Long id);
}
