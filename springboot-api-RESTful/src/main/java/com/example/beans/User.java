package com.example.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@ApiModel
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @ApiModelProperty("用户id")
    private Long id;
    @NotNull
    @ApiModelProperty("用户姓名")
    private String name;

    @Max(100)
    @Min(1)
    @ApiModelProperty("用户年龄")
    private Integer age;

}
