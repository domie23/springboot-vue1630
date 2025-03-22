package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YishengyuyueDao;
import com.entity.YishengyuyueEntity;
import com.service.YishengyuyueService;
import com.entity.vo.YishengyuyueVO;
import com.entity.view.YishengyuyueView;

@Service("yishengyuyueService")
public class YishengyuyueServiceImpl extends ServiceImpl<YishengyuyueDao, YishengyuyueEntity> implements YishengyuyueService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YishengyuyueEntity> page = this.selectPage(
                new Query<YishengyuyueEntity>(params).getPage(),
                new EntityWrapper<YishengyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YishengyuyueEntity> wrapper) {
		  Page<YishengyuyueView> page =new Query<YishengyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YishengyuyueVO> selectListVO(Wrapper<YishengyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YishengyuyueVO selectVO(Wrapper<YishengyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YishengyuyueView> selectListView(Wrapper<YishengyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YishengyuyueView selectView(Wrapper<YishengyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
