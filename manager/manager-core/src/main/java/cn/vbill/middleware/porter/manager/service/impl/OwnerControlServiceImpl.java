/*
 * Copyright ©2018 vbill.cn.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */
package cn.vbill.middleware.porter.manager.service.impl;

import cn.vbill.middleware.porter.manager.core.entity.OwnerControl;
import cn.vbill.middleware.porter.manager.core.mapper.OwnerControlMapper;
import cn.vbill.middleware.porter.manager.service.OwnerControlService;
import cn.vbill.middleware.porter.manager.web.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 权限控制操作类型表 服务实现类
 *
 * @author: FairyHood
 * @date: 2019-04-02 10:58:29
 * @version: V1.0-auto
 * @review: FairyHood/2019-04-02 10:58:29
 */
@Service
public class OwnerControlServiceImpl implements OwnerControlService {

    @Autowired
    private OwnerControlMapper ownerControlMapper;

    @Override
    public Integer insert(OwnerControl ownerControl) {
        return ownerControlMapper.insert(ownerControl);
    }

    @Override
    public Integer update(Long id, OwnerControl ownerControl) {
        return ownerControlMapper.update(id, ownerControl);
    }

    @Override
    public Integer delete(Long id) {
        return ownerControlMapper.delete(id);
    }

    @Override
    public OwnerControl selectById(Long id) {
        return ownerControlMapper.selectById(id);
    }

    @Override
    public Page<OwnerControl> page(Page<OwnerControl> page) {
        Integer total = ownerControlMapper.pageAll(1);
        if (total > 0) {
            page.setTotalItems(total);
            page.setResult(ownerControlMapper.page(page, 1));
        }
        return page;
    }

}
