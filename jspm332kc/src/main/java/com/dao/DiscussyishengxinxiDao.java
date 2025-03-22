package com.dao;

import com.entity.DiscussyishengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyishengxinxiVO;
import com.entity.view.DiscussyishengxinxiView;


/**
 * 医生信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-04 15:27:56
 */
public interface DiscussyishengxinxiDao extends BaseMapper<DiscussyishengxinxiEntity> {
	
	List<DiscussyishengxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyishengxinxiEntity> wrapper);
	
	DiscussyishengxinxiVO selectVO(@Param("ew") Wrapper<DiscussyishengxinxiEntity> wrapper);
	
	List<DiscussyishengxinxiView> selectListView(@Param("ew") Wrapper<DiscussyishengxinxiEntity> wrapper);

	List<DiscussyishengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyishengxinxiEntity> wrapper);
	
	DiscussyishengxinxiView selectView(@Param("ew") Wrapper<DiscussyishengxinxiEntity> wrapper);
	
}
