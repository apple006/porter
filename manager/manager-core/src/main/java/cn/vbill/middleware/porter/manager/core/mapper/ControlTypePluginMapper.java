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
package cn.vbill.middleware.porter.manager.core.mapper;

import cn.vbill.middleware.porter.manager.core.entity.ControlTypePlugin;
import cn.vbill.middleware.porter.manager.web.page.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 操作类型字典 Mapper接口
 *
 * @author: FairyHood
 * @date: 2019-04-02 10:58:29
 * @version: V1.0-auto
 * @review: FairyHood/2019-04-02 10:58:29
 */
public interface ControlTypePluginMapper {

    /**
     * 新增
     *
     * @param controlTypePlugin
     */
    Integer insert(ControlTypePlugin controlTypePlugin);

    /**
     * 修改
     *
     * @param controlTypePlugin
     */
    Integer update(@Param("id") Long id, @Param("controlTypePlugin") ControlTypePlugin controlTypePlugin);

    /**
     * 刪除
     *
     * @param id
     * @return
     */
    Integer delete(Long id);

    /**
     * 根據主鍵id查找數據
     *
     * @param id
     * @return
     */
    ControlTypePlugin selectById(Long id);

    /**
     * 分頁
     *
     * @return
     */
    List<ControlTypePlugin> page(@Param("page") Page<ControlTypePlugin> page, @Param("state") Integer state);

    /**
     * 分頁All
     *
     * @return
     */
    Integer pageAll(@Param("state") Integer state);

}