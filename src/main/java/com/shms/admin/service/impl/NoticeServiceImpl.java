package com.shms.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shms.admin.mapper.NoticeMapper;
import com.shms.admin.service.NoticeService;
import com.shms.admin.entity.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Notice模块的Service层（业务层）的具体实现类，对NoticeService接口中定义的抽象方法作出具体的功能实现
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper,Notice> implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;


    //@Override
    public boolean insert(Notice vo) {
        return this.noticeMapper.doCreate(vo) == 1;
    }

    //@Override
    public boolean delete(Collection<Serializable> ids) {
        return ids.isEmpty() ? false : this.noticeMapper.doRemoveBatch(ids) == ids.size();
    }

    //@Override
    public boolean update(Notice vo) {
        return this.noticeMapper.doUpdate(vo) == 1;
    }

    //@Override
    public Notice get(Serializable id) {
        return this.noticeMapper.findById(id);
    }

    //@Override
    public Map<String, Object> list(Map<String, Object> params) {
        Map<String, Object> resultMap = new HashMap();
        resultMap.put("totalCount", this.noticeMapper.getAllCount(params));
        resultMap.put("list", this.noticeMapper.findAllSplit(params));
        return resultMap;
    }
}
