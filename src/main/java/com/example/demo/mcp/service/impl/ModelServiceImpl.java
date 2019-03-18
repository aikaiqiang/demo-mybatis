package com.example.demo.mcp.service.impl;

import com.example.demo.mcp.entity.Model;
import com.example.demo.mcp.mapper.ModelMapper;
import com.example.demo.mcp.service.IModelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 模型表 服务实现类
 * </p>
 *
 * @author aikq
 * @since 2019-03-18
 */
@Service
public class ModelServiceImpl extends ServiceImpl<ModelMapper, Model> implements IModelService {

}
