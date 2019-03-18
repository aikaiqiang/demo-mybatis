package com.example.demo.mcp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 模型表
 * </p>
 *
 * @author aikq
 * @since 2019-03-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mcp_model")
public class Model implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标志,前后端统一标志
     */
    private String uuid;

    /**
     * 模型名称
     */
    private String modelName;

    /**
     * 模型简介
     */
    private String detail;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 模型更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 用户id
     */
    private Integer createBy;

    /**
     * 用户姓名
     */
    private String createByName;

    /**
     * 范围，0：私有（草稿箱）（默认），1：公有，2：局部共享
     */
    private Boolean scope;

    /**
     * 发布状态，0：未发布（默认），1：已发布，2：草稿箱
     */
    private Boolean publishable;

    /**
     * 调度状态，0：不更新（无调度/草稿箱）（默认），1：定时更新（任务调度），2：实时更新
     */
    private Boolean schedulable;

    /**
     * 数据更新时间
     */
    private LocalDateTime dataUpdateTime;

    /**
     * 分组id
     */
    private Integer groupId;

    /**
     * 图标id
     */
    private Integer iconId;

    /**
     * 动态条件，0：固定（默认），1：动态
     */
    private Boolean dynamic;

    /**
     * 复制状态，0：不可复制，1：可复制的（默认）
     */
    private Boolean copyable;

    /**
     * 结构状态，0：不可见，1：可见的（默认）
     */
    private Boolean structurable;

    /**
     * 模型执行权限，0：使用者的数据权限（默认），1：创建者的数据权限
     */
    private Boolean dataUseScope;

    /**
     * 是否可引用，0：不可引用，1：可引用（默认）
     */
    private Boolean citable;


}
