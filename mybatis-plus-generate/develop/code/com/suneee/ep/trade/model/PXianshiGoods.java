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
 * 限时折扣商品表
 * </p>
 *
 * @author Yanghu
 * @since 2019-03-12
 * @Version V1.0
 * @Copyright: www.suneee.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@TableName("suneee_p_xianshi_goods")
public class PXianshiGoods extends Model<PXianshiGoods> {

    private static final long serialVersionUID = 1L;

    /**
     * 限时折扣商品表
     */
    @TableId(value = "xianshi_goods_id", type = IdType.AUTO)
    private Integer xianshiGoodsId;
    /**
     * 限时活动编号
     */
    @TableField("xianshi_id")
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
     * 商品编号
     */
    @TableField("goods_id")
    private Integer goodsId;
    /**
     * 店铺编号
     */
    @TableField("store_id")
    private Integer storeId;
    /**
     * 商品名称
     */
    @TableField("goods_name")
    private String goodsName;
    /**
     * 店铺价格
     */
    @TableField("goods_price")
    private BigDecimal goodsPrice;
    /**
     * 限时折扣价格
     */
    @TableField("xianshi_price")
    private BigDecimal xianshiPrice;
    /**
     * 商品图片
     */
    @TableField("goods_image")
    private String goodsImage;
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
     * 购买下限，0为不限制
     */
    @TableField("lower_limit")
    private Integer lowerLimit;
    /**
     * 状态，0-取消 1-正常
     */
    private Integer state;
    /**
     * 推荐标志 0-未推荐 1-已推荐
     */
    @TableField("xianshi_recommend")
    private Integer xianshiRecommend;


    public Integer getXianshiGoodsId() {
        return xianshiGoodsId;
    }

    public void setXianshiGoodsId(Integer xianshiGoodsId) {
        this.xianshiGoodsId = xianshiGoodsId;
    }

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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getXianshiPrice() {
        return xianshiPrice;
    }

    public void setXianshiPrice(BigDecimal xianshiPrice) {
        this.xianshiPrice = xianshiPrice;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
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

    public Integer getXianshiRecommend() {
        return xianshiRecommend;
    }

    public void setXianshiRecommend(Integer xianshiRecommend) {
        this.xianshiRecommend = xianshiRecommend;
    }

    @Override
    protected Serializable pkVal() {
        return this.xianshiGoodsId;
    }

    @Override
    public String toString() {
        return "PXianshiGoods{" +
        ", xianshiGoodsId=" + xianshiGoodsId +
        ", xianshiId=" + xianshiId +
        ", xianshiName=" + xianshiName +
        ", xianshiTitle=" + xianshiTitle +
        ", xianshiExplain=" + xianshiExplain +
        ", goodsId=" + goodsId +
        ", storeId=" + storeId +
        ", goodsName=" + goodsName +
        ", goodsPrice=" + goodsPrice +
        ", xianshiPrice=" + xianshiPrice +
        ", goodsImage=" + goodsImage +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", lowerLimit=" + lowerLimit +
        ", state=" + state +
        ", xianshiRecommend=" + xianshiRecommend +
        "}";
    }
}
