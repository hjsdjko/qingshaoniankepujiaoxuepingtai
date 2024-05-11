package com.entity.view;

import com.entity.KechuangzuopinLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 作品评论
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kechuangzuopin_liuyan")
public class KechuangzuopinLiuyanView extends KechuangzuopinLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 kechuangzuopin
			/**
			* 作品标题
			*/
			private String kechuangzuopinName;
			/**
			* 作品类型
			*/
			private Integer kechuangzuopinTypes;
				/**
				* 作品类型的值
				*/
				private String kechuangzuopinValue;
			/**
			* 作品封面
			*/
			private String kechuangzuopinPhoto;
			/**
			* 作品信息 的 用户
			*/
			private Integer kechuangzuopinYonghuId;
			/**
			* 作品内容
			*/
			private String kechuangzuopinContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public KechuangzuopinLiuyanView() {

	}

	public KechuangzuopinLiuyanView(KechuangzuopinLiuyanEntity kechuangzuopinLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, kechuangzuopinLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set kechuangzuopin

					/**
					* 获取： 作品标题
					*/
					public String getKechuangzuopinName() {
						return kechuangzuopinName;
					}
					/**
					* 设置： 作品标题
					*/
					public void setKechuangzuopinName(String kechuangzuopinName) {
						this.kechuangzuopinName = kechuangzuopinName;
					}

					/**
					* 获取： 作品类型
					*/
					public Integer getKechuangzuopinTypes() {
						return kechuangzuopinTypes;
					}
					/**
					* 设置： 作品类型
					*/
					public void setKechuangzuopinTypes(Integer kechuangzuopinTypes) {
						this.kechuangzuopinTypes = kechuangzuopinTypes;
					}


						/**
						* 获取： 作品类型的值
						*/
						public String getKechuangzuopinValue() {
							return kechuangzuopinValue;
						}
						/**
						* 设置： 作品类型的值
						*/
						public void setKechuangzuopinValue(String kechuangzuopinValue) {
							this.kechuangzuopinValue = kechuangzuopinValue;
						}

					/**
					* 获取： 作品封面
					*/
					public String getKechuangzuopinPhoto() {
						return kechuangzuopinPhoto;
					}
					/**
					* 设置： 作品封面
					*/
					public void setKechuangzuopinPhoto(String kechuangzuopinPhoto) {
						this.kechuangzuopinPhoto = kechuangzuopinPhoto;
					}

					/**
					* 获取：作品信息 的 用户
					*/
					public Integer getKechuangzuopinYonghuId() {
						return kechuangzuopinYonghuId;
					}
					/**
					* 设置：作品信息 的 用户
					*/
					public void setKechuangzuopinYonghuId(Integer kechuangzuopinYonghuId) {
						this.kechuangzuopinYonghuId = kechuangzuopinYonghuId;
					}


					/**
					* 获取： 作品内容
					*/
					public String getKechuangzuopinContent() {
						return kechuangzuopinContent;
					}
					/**
					* 设置： 作品内容
					*/
					public void setKechuangzuopinContent(String kechuangzuopinContent) {
						this.kechuangzuopinContent = kechuangzuopinContent;
					}




























				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
