package com.suneee.ep.trade.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 团购商品表
 * </p>
 *
 * @author Yanghu
 * @since 2019-03-12
 * @Version V1.0
 * @Copyright: www.suneee.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@TableName("suneee_groupbuy")
public class Groupbuy extends Model<Groupbuy> {

    private static final long serialVersionUID = 1L;

    /**
     * 团购ID
     */
    @TableId(value = "groupbuy_id", type = IdType.AUTO)
    private Integer groupbuyId;
    /**
     * 活动名称
     */
    @TableField("groupbuy_name")
    private String groupbuyName;
    /**
     * 开始时间
     */
    @TableField("start_time")
    private Integer startTime;
    /**
     * 结束时间
     */
    @TableField("end_time")
    private Integer endTime;
    /**
     * 商品ID
     */
    @TableField("goods_id")
    private Integer goodsId;
    /**
     * 商品公共表ID
     */
    @TableField("goods_commonid")
    private Integer goodsCommonid;
    /**
     * 商品名称
     */
    @TableField("goods_name")
    private String goodsName;
    /**
     * 店铺ID
     */
    @TableField("store_id")
    private Integer storeId;
    /**
     * 店铺名称
     */
    @TableField("store_name")
    private String storeName;
    /**
     * 商品原价
     */
    @TableField("goods_price")
    private BigDecimal goodsPrice;
    /**
     * 团购价格
     */
    @TableField("groupbuy_price")
    private BigDecimal groupbuyPrice;
    /**
     * 折扣
     */
    @TableField("groupbuy_rebate")
    private BigDecimal groupbuyRebate;
    /**
     * 虚拟购买数量
     */
    @TableField("virtual_quantity")
    private Integer virtualQuantity;
    /**
     * 购买上限
     */
    @TableField("upper_limit")
    private Integer upperLimit;
    /**
     * 已购买人数
     */
    @TableField("buyer_count")
    private Integer buyerCount;
    /**
     * 购买数量
     */
    @TableField("buy_quantity")
    private Integer buyQuantity;
    /**
     * 本团介绍
     */
    @TableField("groupbuy_intro")
    private String groupbuyIntro;
    /**
     * 团购状态 10-审核中 20-正常 30-审核失败 31-管理员关闭 32-已结束
     */
    private Integer state;
    /**
     * 是否推荐 0.未推荐 1.已推荐
     */
    private Integer recommended;
    /**
     * 查看次数
     */
    private Integer views;
    /**
     * 团购类别编号
     */
    @TableField("class_id")
    private Integer classId;
    /**
     * 团购2级分类id
     */
    @TableField("s_class_id")
    private Integer sClassId;
    /**
     * 团购图片
     */
    @TableField("groupbuy_image")
    private String groupbuyImage;
    /**
     * 团购图片1
     */
    @TableField("groupbuy_image1")
    private String groupbuyImage1;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否虚拟团购 1是0否
     */
    @TableField("is_vr")
    private Integer isVr;
    /**
     * 虚拟团购城市id
     */
    @TableField("vr_city_id")
    private Integer vrCityId;
    /**
     * 虚拟团购区域id
     */
    @TableField("vr_area_id")
    private Integer vrAreaId;
    /**
     * 虚拟团购商区id
     */
    @TableField("vr_mall_id")
    private Integer vrMallId;
    /**
     * 虚拟团购大分类id
     */
    @TableField("vr_class_id")
    private Integer vrClassId;
    /**
     * 虚拟团购小分类id
     */
    @TableField("vr_s_class_id")
    private Integer vrSClassId;


    public Integer getGroupbuyId() {
        return groupbuyId;
    }

    public void setGroupbuyId(Integer groupbuyId) {
        this.groupbuyId = groupbuyId;
    }

    public String getGroupbuyName() {
        return groupbuyName;
    }

    public void setGroupbuyName(String groupbuyName) {
        this.groupbuyName = groupbuyName;
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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsCommonid() {
        return goodsCommonid;
    }

    public void setGoodsCommonid(Integer goodsCommonid) {
        this.goodsCommonid = goodsCommonid;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getGroupbuyPrice() {
        return groupbuyPrice;
    }

    public void setGroupbuyPrice(BigDecimal groupbuyPrice) {
        this.groupbuyPrice = groupbuyPrice;
    }

    public BigDecimal getGroupbuyRebate() {
        return groupbuyRebate;
    }

    public void setGroupbuyRebate(BigDecimal groupbuyRebate) {
        this.groupbuyRebate = groupbuyRebate;
    }

    public Integer getVirtualQuantity() {
        return virtualQuantity;
    }

    public void setVirtualQuantity(Integer virtualQuantity) {
        this.virtualQuantity = virtualQuantity;
    }

    public Integer getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
    }

    public Integer getBuyerCount() {
        return buyerCount;
    }

    public void setBuyerCount(Integer buyerCount) {
        this.buyerCount = buyerCount;
    }

    public Integer getBuyQuantity() {
        return buyQuantity;
    }

    public void setBuyQuantity(Integer buyQuantity) {
        this.buyQuantity = buyQuantity;
    }

    public String getGroupbuyIntro() {
        return groupbuyIntro;
    }

    public void setGroupbuyIntro(String groupbuyIntro) {
        this.groupbuyIntro = groupbuyIntro;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getRecommended() {
        return recommended;
    }

    public void setRecommended(Integer recommended) {
        this.recommended = recommended;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getsClassId() {
        return sClassId;
    }

    public void setsClassId(Integer sClassId) {
        this.sClassId = sClassId;
    }

    public String getGroupbuyImage() {
        return groupbuyImage;
    }

    public void setGroupbuyImage(String groupbuyImage) {
        this.groupbuyImage = groupbuyImage;
    }

    public String getGroupbuyImage1() {
        return groupbuyImage1;
    }

    public void setGroupbuyImage1(String groupbuyImage1) {
        this.groupbuyImage1 = groupbuyImage1;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsVr() {
        return isVr;
    }

    public void setIsVr(Integer isVr) {
        this.isVr = isVr;
    }

    public Integer getVrCityId() {
        return vrCityId;
    }

    public void setVrCityId(Integer vrCityId) {
        this.vrCityId = vrCityId;
    }

    public Integer getVrAreaId() {
        return vrAreaId;
    }

    public void setVrAreaId(Integer vrAreaId) {
        this.vrAreaId = vrAreaId;
    }

    public Integer getVrMallId() {
        return vrMallId;
    }

    public void setVrMallId(Integer vrMallId) {
        this.vrMallId = vrMallId;
    }

    public Integer getVrClassId() {
        return vrClassId;
    }

    public void setVrClassId(Integer vrClassId) {
        this.vrClassId = vrClassId;
    }

    public Integer getVrSClassId() {
        return vrSClassId;
    }

    public void setVrSClassId(Integer vrSClassId) {
        this.vrSClassId = vrSClassId;
    }

    @Override
    protected Serializable pkVal() {
        return this.groupbuyId;
    }

    @Override
    public String toString() {
        return "Groupbuy{" +
        ", groupbuyId=" + groupbuyId +
        ", groupbuyName=" + groupbuyName +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", goodsId=" + goodsId +
        ", goodsCommonid=" + goodsCommonid +
        ", goodsName=" + goodsName +
        ", storeId=" + storeId +
        ", storeName=" + storeName +
        ", goodsPrice=" + goodsPrice +
        ", groupbuyPrice=" + groupbuyPrice +
        ", groupbuyRebate=" + groupbuyRebate +
        ", virtualQuantity=" + virtualQuantity +
        ", upperLimit=" + upperLimit +
        ", buyerCount=" + buyerCount +
        ", buyQuantity=" + buyQuantity +
        ", groupbuyIntro=" + groupbuyIntro +
        ", state=" + state +
        ", recommended=" + recommended +
        ", views=" + views +
        ", classId=" + classId +
        ", sClassId=" + sClassId +
        ", groupbuyImage=" + groupbuyImage +
        ", groupbuyImage1=" + groupbuyImage1 +
        ", remark=" + remark +
        ", isVr=" + isVr +
        ", vrCityId=" + vrCityId +
        ", vrAreaId=" + vrAreaId +
        ", vrMallId=" + vrMallId +
        ", vrClassId=" + vrClassId +
        ", vrSClassId=" + vrSClassId +
        "}";
    }
}
