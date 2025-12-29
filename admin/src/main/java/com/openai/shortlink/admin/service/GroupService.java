package com.openai.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.openai.shortlink.admin.dao.entity.GroupDO;

public interface GroupService extends IService<GroupDO> {

    void saveGroup(String name);
}
