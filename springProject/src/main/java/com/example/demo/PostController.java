package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 클래스는 REST API를 처리하는 컨트롤러로 등록된다.
@RequestMapping("/post")    // 리소스를 설정하는 코드, URI가 localhost:8080/post로 설정된다.
public class PostController {
    @PostMapping(value = "/search")
    public SearchVO search(@RequestBody SearchVO searchVO) {
        // VO에 string으로 반환하는 함수를 리턴하면 string으로 응답하고
        // 그냥 vo 객체로 리턴하면 알아서 JSON으로 반환하여 응답한다
        return searchVO;
    }
}
