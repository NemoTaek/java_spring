package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

//(exclude = {DataSourceAutoConfiguration.class})	// DB를 사용하지 않겠다
@SpringBootApplication
@RestController	// 해당 클래스는 REST API를 처리하는 컨트롤러로 등록된다.
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello")	// HTTP GET 요청 왔을 때 동작
//	@RequestMapping(method = RequestMethod.GET, path="/hello")	// 이 방법도 있음
	// @RequestParam(): 파라미터를 메소드 인자 값으로 넣어 설정, localhost:8080/hello?name=abc 이런 식으로 사용
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
