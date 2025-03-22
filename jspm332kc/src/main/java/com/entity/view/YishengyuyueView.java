package com.entity.view;

import com.entity.YishengyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医生预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-04 15:27:56
 */
@TableName("yishengyuyue")
public class YishengyuyueView  extends YishengyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YishengyuyueView(){
	}
 
 	public YishengyuyueView(YishengyuyueEntity yishengyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, yishengyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
