/**
 *
 */
package com.suixingpay.datas.manager.service.impl;

import com.suixingpay.datas.manager.core.entity.MrJobTasksSchedule;
import com.suixingpay.datas.manager.core.mapper.MrJobTasksScheduleMapper;
import com.suixingpay.datas.manager.service.MrJobTasksScheduleService;
import com.suixingpay.datas.manager.web.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 任务泳道进度表 服务实现类
 *
 * @author: FairyHood
 * @date: 2018-03-07 13:40:30
 * @version: V1.0-auto
 * @review: FairyHood/2018-03-07 13:40:30
 */
@Service
public class MrJobTasksScheduleServiceImpl implements MrJobTasksScheduleService {

    @Autowired
    private MrJobTasksScheduleMapper mrJobTasksScheduleMapper;

    @Override
    public Integer insert(MrJobTasksSchedule mrJobTasksSchedule) {
        return mrJobTasksScheduleMapper.insert(mrJobTasksSchedule);
    }

    @Override
    public Integer update(Long id, MrJobTasksSchedule mrJobTasksSchedule) {
        return mrJobTasksScheduleMapper.update(id, mrJobTasksSchedule);
    }

    @Override
    public Integer delete(Long id) {
        return mrJobTasksScheduleMapper.delete(id);
    }

    @Override
    public MrJobTasksSchedule selectById(Long id) {
        return mrJobTasksScheduleMapper.selectById(id);
    }

    @Override
    public Page<MrJobTasksSchedule> page(Page<MrJobTasksSchedule> page) {
        Integer total = mrJobTasksScheduleMapper.pageAll(1);
        if (total > 0) {
            page.setTotalItems(total);
            page.setResult(mrJobTasksScheduleMapper.page(page, 1));
        }
        return page;
    }

}
