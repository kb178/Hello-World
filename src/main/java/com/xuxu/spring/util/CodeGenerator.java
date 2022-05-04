package com.xuxu.spring.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {

        generate();
    }
    public static void generate(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/sanya?useUnicode=false&characterEncoding=utf-8&severTimezone=CST", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("许海林") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("C:\\Users\\29252\\IdeaProjects\\JSanya\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.xuxu.spring") // 设置父包名
                            .moduleName(null) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapper, "C:\\Users\\29252\\IdeaProjects\\demo1\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })

                .strategyConfig(builder -> {
                    //配置lombok
                    builder.entityBuilder().enableLombok();
                    builder.controllerBuilder().enableHyphenStyle()  // 开启驼峰转连字符
                            .enableRestStyle();  // 开启生成@RestController 控制器，否者会返回controller
                    builder.addInclude("s_user") // 设置需要生成的表名
                            .addTablePrefix("s_"); // 设置过滤表前缀

                    builder.addInclude("s_article")
                            .addTablePrefix("s_");

                    builder.addInclude("s_comment")
                            .addTablePrefix("s_");
                })
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
