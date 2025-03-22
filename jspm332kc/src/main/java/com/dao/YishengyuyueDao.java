package com.dao;

import com.entity.YishengyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishengyuyueVO;
import com.entity.view.YishengyuyueView;


/**
 * 医生预约
 * 
 * @author 
 * @email 
 * @date 2021-03-04 15:27:56
 */
public interface YishengyuyueDao extends BaseMapper<YishengyuyueEntity> {
	
	List<YishengyuyueVO> selectListVO(@Param("ew") Wrapper<YishengyuyueEntity> wrapper);
	
	YishengyuyueVO selectVO(@Param("ew") Wrapper<YishengyuyueEntity> wrapper);
	
	List<YishengyuyueView> selectListView(@Param("ew") Wrapper<YishengyuyueEntity> wrapper);

	List<YishengyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<YishengyuyueEntity> wrapper);
	
	YishengyuyueView selectView(@Param("ew") Wrapper<YishengyuyueEntity> wrapper);
	
}
