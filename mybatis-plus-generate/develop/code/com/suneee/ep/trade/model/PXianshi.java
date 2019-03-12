package com.suneee.ep.trade.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 限时折扣活动表
 * </p>
 *
 * @author Yanghu
 * @since 2019-03-12
 * @Version V1.0
 * @Copyright: www.suneee.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@TableName("suneee_p_xianshi")
public class PXianshi extends Model<PXianshi> {

    private static final long serialVersionUID = 1L;

    /**
     * 限时编号
     */
    @TableId(value = "xianshi_id", type = IdType.AUTO)
    private Integer xianshiId;
    /**
     * 活动名称
     */
    @TableField("xianshi_name")
    private String xianshiName;
    /**
     * 活动标题
     */
    @TableField("xianshi_title")
    private String xianshiTitle;
    /**
     * 活动说明
     */
    @TableField("xianshi_explain")
    private String xianshiExplain;
    /**
     * 套餐编号
     */
    @TableField("quota_id")
    private Integer quotaId;
    /**
     * 活动开始时间
     */
    @TableField("start_time")
    private Integer startTime;
    /**
     * 活动结束时间
     */
    @TableField("end_time")
    private Integer endTime;
    /**
     * 用户编号
     */
    @TableField("member_id")
    private Integer memberId;
    /**
     * 店铺编号
     */
    @TableField("store_id")
    private Integer storeId;
    /**
     * 用户名
     */
    @TableField("member_name")
    private String memberName;
    /**
     * 店铺名称
     */
    @TableField("store_name")
    private String storeName;
    /**
     * 购买下限，1为不限制
     */
    @TableField("lower_limit")
    private Integer lowerLimit;
    /**
     * 状态，0-取消 1-正常
     */
    private Integer state;


    public Integer getXianshiId() {
        return xianshiId;
    }

    public void setXianshiId(Integer xianshiId) {
        this.xianshiId = xianshiId;
    }

    public String getXianshiName() {
        return xianshiName;
    }

    public void setXianshiName(String xianshiName) {
        this.xianshiName = xianshiName;
    }

    public String getXianshiTitle() {
        return xianshiTitle;
    }

    public void setXianshiTitle(String xianshiTitle) {
        this.xianshiTitle = xianshiTitle;
    }

    public String getXianshiExplain() {
        return xianshiExplain;
    }

    public void setXianshiExplain(String xianshiExplain) {
        this.xianshiExplain = xianshiExplain;
    }

    public Integer getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(Integer quotaId) {
        this.quotaId = quotaId;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Integer getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(Integer lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    protected Serializable pkVal() {
        return this.xianshiId;
    }

    @Override
    public String toString() {
        return "PXianshi{" +
        ", xianshiId=" + xianshiId +
        ", xianshiName=" + xianshiName +
        ", xianshiTitle=" + xianshiTitle +
        ", xianshiExplain=" + xianshiExplain +
        ", quotaId=" + quotaId +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", memberId=" + memberId +
        ", storeId=" + storeId +
        ", memberName=" + memberName +
        ", storeName=" + storeName +
        ", lowerLimit=" + lowerLimit +
        ", state=" + state +
        "}";
    }
}
