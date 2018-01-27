package com.taskpool.Domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by 14437 on 2018/1/27.
 */

@Entity
@Data
public class Project {
    @Id
    @GeneratedValue
    @Column(nullable = false, columnDefinition = "Int(11) COMMENT '项目主键'")
    private int projectId;
    @Column(nullable = false, columnDefinition = "varchar(40) COMMENT '项目名称' default '未命名'")
    private String projectName;
    @Column(nullable = false, columnDefinition = "Int(11) COMMENT '项目创建者id'")
    private int createId;
    @Column(nullable = false, columnDefinition = "Int(11) COMMENT '项目所属者id'")
    private int ownerId;
    @Column(nullable = false, columnDefinition = "varchar(5000) COMMENT '项目描述' default ' '")
    private String projectDescription;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false, columnDefinition = "datetime COMMENT '创建时间'")
    private Timestamp createTime;
}
