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


import com.dao.DiscussyishengxinxiDao;
import com.entity.DiscussyishengxinxiEntity;
import com.service.DiscussyishengxinxiService;
import com.entity.vo.DiscussyishengxinxiVO;
import com.entity.view.DiscussyishengxinxiView;

@Service("discussyishengxinxiService")
public class DiscussyishengxinxiServiceImpl extends ServiceImpl<DiscussyishengxinxiDao, DiscussyishengxinxiEntity> implements DiscussyishengxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyishengxinxiEntity> page = this.selectPage(
                new Query<DiscussyishengxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyishengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyishengxinxiEntity> wrapper) {
		  Page<DiscussyishengxinxiView> page =new Query<DiscussyishengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyishengxinxiVO> selectListVO(Wrapper<DiscussyishengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyishengxinxiVO selectVO(Wrapper<DiscussyishengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyishengxinxiView> selectListView(Wrapper<DiscussyishengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyishengxinxiView selectView(Wrapper<DiscussyishengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
