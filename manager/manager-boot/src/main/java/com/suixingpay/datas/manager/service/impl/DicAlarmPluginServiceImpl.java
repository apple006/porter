/**
 *
 */
package com.suixingpay.datas.manager.service.impl;

import com.suixingpay.datas.manager.core.entity.DicAlarmPlugin;
import com.suixingpay.datas.manager.core.mapper.DicAlarmPluginMapper;
import com.suixingpay.datas.manager.service.DicAlarmPluginService;
import com.suixingpay.datas.manager.web.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 告警配置策略字典表 服务实现类
 *
 * @author: FairyHood
 * @date: 2018-03-08 10:46:01
 * @version: V1.0-auto
 * @review: FairyHood/2018-03-08 10:46:01
 */
@Service
public class DicAlarmPluginServiceImpl implements DicAlarmPluginService {

    @Autowired
    private DicAlarmPluginMapper dicAlarmPluginMapper;

    @Override
    public Integer insert(DicAlarmPlugin dicAlarmPlugin) {
        return dicAlarmPluginMapper.insert(dicAlarmPlugin);
    }

    @Override
    public Integer update(Long id, DicAlarmPlugin dicAlarmPlugin) {
        return dicAlarmPluginMapper.update(id, dicAlarmPlugin);
    }

    @Override
    public Integer delete(Long id) {
        return dicAlarmPluginMapper.delete(id);
    }

    @Override
    public DicAlarmPlugin selectById(Long id) {
        return dicAlarmPluginMapper.selectById(id);
    }

    @Override
    public Page<DicAlarmPlugin> page(Page<DicAlarmPlugin> page) {
        Integer total = dicAlarmPluginMapper.pageAll(1);
        if (total > 0) {
            page.setTotalItems(total);
            page.setResult(dicAlarmPluginMapper.page(page, 1));
        }
        return page;
    }

}
