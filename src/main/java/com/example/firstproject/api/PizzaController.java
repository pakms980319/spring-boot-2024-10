package com.example.firstproject.api;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {
    // 실제로 구현하지 않고 REST API 주소만 설계

    /*
    [피자의 생성]
    HTTP 메소드: POST
    요청 주소: "/pizzas"
    비고:
    피자 등록(JSON 데이터 입력)
    예시)
    {"name": "페퍼로니 피자", "price": 25900} (id 자동 생성)

    [피자 단건 조회]
    HTTP 메소드: GET
    요청 주소: "/pizzas/{id}"

    [피자 목록 조회]
    HTTP 메소드: GET
    요청 주소: "/pizzas"

    [피자 수정]
    HTTP 메소드: PATCH
    요청 주소: "/pizzas/{id}"
    비고:
    피자 수정(JSON 데이터 입력)
    예시)
    {"id": 1, "name": "페퍼로니 피자", "price": 29000} (수정할 피자의 id 정보가 dto 에 포함되어 있어야 한다)

    [피자 삭제]
    HTTP 메소드: DELETE
    요청 주소: "/pizzas/{id}"
     */
}
