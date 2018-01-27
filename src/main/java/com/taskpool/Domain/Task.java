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
public class Task {
    @Id
    @GeneratedValue
    @Column(nullable = false, columnDefinition = "Int(11) COMMENT '任务主键'")
    private int taskId;
    @Column(nullable = false, columnDefinition = "varchar(40) COMMENT '任务名称' default '未命名'")
    private String taskName;
    @Column(nullable = false, columnDefinition = "varchar(5000) COMMENT '任务描述' default '无'")
    private String taskDescription;
    @Column(nullable = false, columnDefinition = "varchar(5000) COMMENT '完成标准' default '无'")
    private String taskStandard;
    @Column(nullable = false, columnDefinition = "Int(11) COMMENT '任务所属项目id'")
    private int projectId;
    @Column(nullable = false, columnDefinition = "Int(11) COMMENT '任务创建者id'")
    private int creatorId;
    @Column(nullable = false, columnDefinition = "Int(11) COMMENT '负责人id'")
    private int workerId;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false, columnDefinition = "datetime COMMENT '创建时间'")
    private Timestamp createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false, columnDefinition = "datetime COMMENT '截止时间'")
    private Timestamp deadlineTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false, columnDefinition = "datetime COMMENT '开始时间'")
    private Timestamp startTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false, columnDefinition = "datetime COMMENT '完成时间'")
    private Timestamp endTime;
    @Column(nullable = false, columnDefinition = "varchar(5000) COMMENT '备注' default '无'")
    private String other;
}
