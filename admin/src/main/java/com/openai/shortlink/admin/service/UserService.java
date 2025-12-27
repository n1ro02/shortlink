package com.openai.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.openai.shortlink.admin.dao.entity.UserDO;
import com.openai.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    UserRespDTO getUserByUsername(String username);

    Boolean hasUsername(String username);
}
