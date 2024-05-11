package com.entity.view;

import com.entity.WenzhangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 文章信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wenzhang")
public class WenzhangView extends WenzhangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 文章类型的值
		*/
		private String wenzhangValue;



	public WenzhangView() {

	}

	public WenzhangView(WenzhangEntity wenzhangEntity) {
		try {
			BeanUtils.copyProperties(this, wenzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 文章类型的值
			*/
			public String getWenzhangValue() {
				return wenzhangValue;
			}
			/**
			* 设置： 文章类型的值
			*/
			public void setWenzhangValue(String wenzhangValue) {
				this.wenzhangValue = wenzhangValue;
			}














}
