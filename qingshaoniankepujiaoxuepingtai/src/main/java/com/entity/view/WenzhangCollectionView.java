package com.entity.view;

import com.entity.WenzhangCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 文章收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wenzhang_collection")
public class WenzhangCollectionView extends WenzhangCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String wenzhangCollectionValue;



		//级联表 wenzhang
			/**
			* 文章标题
			*/
			private String wenzhangName;
			/**
			* 文章类型
			*/
			private Integer wenzhangTypes;
				/**
				* 文章类型的值
				*/
				private String wenzhangValue;
			/**
			* 文章封面
			*/
			private String wenzhangPhoto;
			/**
			* 文章
			*/
			private String wenzhangFile;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 文章内容
			*/
			private String wenzhangContent;

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

	public WenzhangCollectionView() {

	}

	public WenzhangCollectionView(WenzhangCollectionEntity wenzhangCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, wenzhangCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getWenzhangCollectionValue() {
				return wenzhangCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setWenzhangCollectionValue(String wenzhangCollectionValue) {
				this.wenzhangCollectionValue = wenzhangCollectionValue;
			}

























				//级联表的get和set wenzhang

					/**
					* 获取： 文章标题
					*/
					public String getWenzhangName() {
						return wenzhangName;
					}
					/**
					* 设置： 文章标题
					*/
					public void setWenzhangName(String wenzhangName) {
						this.wenzhangName = wenzhangName;
					}

					/**
					* 获取： 文章类型
					*/
					public Integer getWenzhangTypes() {
						return wenzhangTypes;
					}
					/**
					* 设置： 文章类型
					*/
					public void setWenzhangTypes(Integer wenzhangTypes) {
						this.wenzhangTypes = wenzhangTypes;
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

					/**
					* 获取： 文章封面
					*/
					public String getWenzhangPhoto() {
						return wenzhangPhoto;
					}
					/**
					* 设置： 文章封面
					*/
					public void setWenzhangPhoto(String wenzhangPhoto) {
						this.wenzhangPhoto = wenzhangPhoto;
					}

					/**
					* 获取： 文章
					*/
					public String getWenzhangFile() {
						return wenzhangFile;
					}
					/**
					* 设置： 文章
					*/
					public void setWenzhangFile(String wenzhangFile) {
						this.wenzhangFile = wenzhangFile;
					}

					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 文章内容
					*/
					public String getWenzhangContent() {
						return wenzhangContent;
					}
					/**
					* 设置： 文章内容
					*/
					public void setWenzhangContent(String wenzhangContent) {
						this.wenzhangContent = wenzhangContent;
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
