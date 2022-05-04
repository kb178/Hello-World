package com.xuxu.spring.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 许海林
 * @since 2022-05-01
 */
@Getter
@Setter
@TableName("s_user")
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("id")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("用户名")
      private String username;

      @ApiModelProperty("用户密码")
      private String password;

      @ApiModelProperty("用户昵称")
      private String nickname;

      @ApiModelProperty("用户头像")
      private String avaterUrl;

      @ApiModelProperty("创建时间")
      private LocalDateTime createTime;


}
