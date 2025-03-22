package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishengyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishengyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishengyuyueView;


/**
 * 医生预约
 *
 * @author 
 * @email 
 * @date 2021-03-04 15:27:56
 */
public interface YishengyuyueService extends IService<YishengyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishengyuyueVO> selectListVO(Wrapper<YishengyuyueEntity> wrapper);
   	
   	YishengyuyueVO selectVO(@Param("ew") Wrapper<YishengyuyueEntity> wrapper);
   	
   	List<YishengyuyueView> selectListView(Wrapper<YishengyuyueEntity> wrapper);
   	
   	YishengyuyueView selectView(@Param("ew") Wrapper<YishengyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishengyuyueEntity> wrapper);
   	
}

