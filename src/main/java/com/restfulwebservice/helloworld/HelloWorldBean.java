package com.restfulwebservice.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data /* Getter&Setter + @ */
@AllArgsConstructor /* 생성자(this.message=message 생략 */
@NoArgsConstructor // default 생성자
public class HelloWorldBean {

    private String message;

}
