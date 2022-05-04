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
@TableName("s_article")
@ApiModel(value = "Article对象", description = "")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("id")
      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("文章标题")
      private String title;

      @ApiModelProperty("内容")
      private String text;

      @ApiModelProperty("评论数量")
      private Integer count;

      @ApiModelProperty("文章图片")
      private String picture;

      @ApiModelProperty("作者id（关联用户表）")
      private Integer uId;

      @ApiModelProperty("创建时间")
      private LocalDateTime createTime;


}
