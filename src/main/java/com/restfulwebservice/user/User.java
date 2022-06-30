package com.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

// @JsonIgnore - 제이슨 포맷에서 해당 필드 값을 제외한다 -> 필드에 선언
// @JsonIgnoreProperties(value = {"field1", "field2"} - value 배열에 언급 한 필드를 제외 -> 클래스에 선언

@Data
@AllArgsConstructor
//@JsonIgnoreProperties(value = {"password"})
@JsonFilter("UserInfo")
public class User {

    private Integer id;

    @Size(min = 2, message = "Name은 2글자 이상 입력해 주세요.")
    private String name;

    @Past // 과거의 date만 들어감
    private Date joinDate;

//    @JsonIgnore
    private String password;

    // 주민번호
//    @JsonIgnore
    private String ssn;
}
