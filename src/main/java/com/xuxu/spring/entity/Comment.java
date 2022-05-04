package com.xuxu.spring.entity;

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
  @TableName("s_comment")
@ApiModel(value = "Comment对象", description = "")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("id")
        private Integer id;

      @ApiModelProperty("评论内容")
      private String content;

      @ApiModelProperty("评论的用户")
      private Integer uId;

      @ApiModelProperty("评论的文章的id")
      private Integer artId;

      @ApiModelProperty("评论的时间")
      private LocalDateTime createTime;


}
