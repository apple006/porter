/**
 *
 */
package com.suixingpay.datas.manager.service.impl;

import com.suixingpay.datas.manager.core.entity.MrNodesMonitor;
import com.suixingpay.datas.manager.core.mapper.MrNodesMonitorMapper;
import com.suixingpay.datas.manager.service.MrNodesMonitorService;
import com.suixingpay.datas.manager.web.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 节点任务实时监控表 服务实现类
 *
 * @author: FairyHood
 * @date: 2018-03-07 13:40:30
 * @version: V1.0-auto
 * @review: FairyHood/2018-03-07 13:40:30
 */
@Service
public class MrNodesMonitorServiceImpl implements MrNodesMonitorService {

    @Autowired
    private MrNodesMonitorMapper mrNodesMonitorMapper;

    @Override
    public Integer insert(MrNodesMonitor mrNodesMonitor) {
        return mrNodesMonitorMapper.insert(mrNodesMonitor);
    }

    @Override
    public Integer update(Long id, MrNodesMonitor mrNodesMonitor) {
        return mrNodesMonitorMapper.update(id, mrNodesMonitor);
    }

    @Override
    public Integer delete(Long id) {
        return mrNodesMonitorMapper.delete(id);
    }

    @Override
    public MrNodesMonitor selectById(Long id) {
        return mrNodesMonitorMapper.selectById(id);
    }

    @Override
    public Page<MrNodesMonitor> page(Page<MrNodesMonitor> page) {
        Integer total = mrNodesMonitorMapper.pageAll(1);
        if (total > 0) {
            page.setTotalItems(total);
            page.setResult(mrNodesMonitorMapper.page(page, 1));
        }
        return page;
    }

}
