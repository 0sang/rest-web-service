package com.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

// @JsonIgnore - 제이슨 포맷에서 해당 필드 값을 제외한다 -> 필드에 선언
// @JsonIgnoreProperties(value = {"field1", "field2"} - value 배열에 언급 한 필드를 제외 -> 클래스에 선언

@Data
@AllArgsConstructor
@JsonFilter("UserInfoV2")
@NoArgsConstructor
public class UserV2 extends User{
    private String grade;
}
