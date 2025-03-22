package com.entity.view;

import com.entity.DiscussyishengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医生信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-04 15:27:56
 */
@TableName("discussyishengxinxi")
public class DiscussyishengxinxiView  extends DiscussyishengxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyishengxinxiView(){
	}
 
 	public DiscussyishengxinxiView(DiscussyishengxinxiEntity discussyishengxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussyishengxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
