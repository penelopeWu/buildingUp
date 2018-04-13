package com.penelopenest.buildingup.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author penelopeWu
 * @version ${version}
 * @date 2018-04-12 15:37
 */
@Component
@Data
public class BlogProperties {
    @Value("${com.penelopenest.blog.name}")
    private String name;
    @Value("${com.penelopenest.blog.title}")
    private String title;
}
