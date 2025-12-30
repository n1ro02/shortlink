package com.openai.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.openai.shortlink.admin.dao.entity.GroupDO;
import com.openai.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

public interface GroupService extends IService<GroupDO> {

    void saveGroup(String name);

    List<ShortLinkGroupRespDTO> listGroup();

}
