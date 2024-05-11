package com.entity.model;

import com.entity.KechuangzuopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 作品信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechuangzuopinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 作品标题
     */
    private String kechuangzuopinName;


    /**
     * 作品类型
     */
    private Integer kechuangzuopinTypes;


    /**
     * 作品封面
     */
    private String kechuangzuopinPhoto;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 作品内容
     */
    private String kechuangzuopinContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：作品标题
	 */
    public String getKechuangzuopinName() {
        return kechuangzuopinName;
    }


    /**
	 * 设置：作品标题
	 */
    public void setKechuangzuopinName(String kechuangzuopinName) {
        this.kechuangzuopinName = kechuangzuopinName;
    }
    /**
	 * 获取：作品类型
	 */
    public Integer getKechuangzuopinTypes() {
        return kechuangzuopinTypes;
    }


    /**
	 * 设置：作品类型
	 */
    public void setKechuangzuopinTypes(Integer kechuangzuopinTypes) {
        this.kechuangzuopinTypes = kechuangzuopinTypes;
    }
    /**
	 * 获取：作品封面
	 */
    public String getKechuangzuopinPhoto() {
        return kechuangzuopinPhoto;
    }


    /**
	 * 设置：作品封面
	 */
    public void setKechuangzuopinPhoto(String kechuangzuopinPhoto) {
        this.kechuangzuopinPhoto = kechuangzuopinPhoto;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：作品内容
	 */
    public String getKechuangzuopinContent() {
        return kechuangzuopinContent;
    }


    /**
	 * 设置：作品内容
	 */
    public void setKechuangzuopinContent(String kechuangzuopinContent) {
        this.kechuangzuopinContent = kechuangzuopinContent;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
