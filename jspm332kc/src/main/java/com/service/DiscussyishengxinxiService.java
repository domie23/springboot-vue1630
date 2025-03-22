package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyishengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyishengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyishengxinxiView;


/**
 * 医生信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-04 15:27:56
 */
public interface DiscussyishengxinxiService extends IService<DiscussyishengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyishengxinxiVO> selectListVO(Wrapper<DiscussyishengxinxiEntity> wrapper);
   	
   	DiscussyishengxinxiVO selectVO(@Param("ew") Wrapper<DiscussyishengxinxiEntity> wrapper);
   	
   	List<DiscussyishengxinxiView> selectListView(Wrapper<DiscussyishengxinxiEntity> wrapper);
   	
   	DiscussyishengxinxiView selectView(@Param("ew") Wrapper<DiscussyishengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyishengxinxiEntity> wrapper);
   	
}

