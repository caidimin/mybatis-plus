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
 * 组合销售活动表
 * </p>
 *
 * @author Yanghu
 * @since 2019-03-12
 * @Version V1.0
 * @Copyright: www.suneee.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@TableName("suneee_p_bundling")
public class PBundling extends Model<PBundling> {

    private static final long serialVersionUID = 1L;

    /**
     * 组合ID
     */
    @TableId(value = "bl_id", type = IdType.AUTO)
    private Integer blId;
    /**
     * 组合名称
     */
    @TableField("bl_name")
    private String blName;
    /**
     * 店铺名称
     */
    @TableField("store_id")
    private Integer storeId;
    /**
     * 店铺名称
     */
    @TableField("store_name")
    private String storeName;
    /**
     * 组合价格
     */
    @TableField("bl_discount_price")
    private BigDecimal blDiscountPrice;
    /**
     * 运费承担方式
     */
    @TableField("bl_freight_choose")
    private Integer blFreightChoose;
    /**
     * 运费
     */
    @TableField("bl_freight")
    private BigDecimal blFreight;
    /**
     * 组合状态 0-关闭/1-开启
     */
    @TableField("bl_state")
    private Integer blState;


    public Integer getBlId() {
        return blId;
    }

    public void setBlId(Integer blId) {
        this.blId = blId;
    }

    public String getBlName() {
        return blName;
    }

    public void setBlName(String blName) {
        this.blName = blName;
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

    public BigDecimal getBlDiscountPrice() {
        return blDiscountPrice;
    }

    public void setBlDiscountPrice(BigDecimal blDiscountPrice) {
        this.blDiscountPrice = blDiscountPrice;
    }

    public Integer getBlFreightChoose() {
        return blFreightChoose;
    }

    public void setBlFreightChoose(Integer blFreightChoose) {
        this.blFreightChoose = blFreightChoose;
    }

    public BigDecimal getBlFreight() {
        return blFreight;
    }

    public void setBlFreight(BigDecimal blFreight) {
        this.blFreight = blFreight;
    }

    public Integer getBlState() {
        return blState;
    }

    public void setBlState(Integer blState) {
        this.blState = blState;
    }

    @Override
    protected Serializable pkVal() {
        return this.blId;
    }

    @Override
    public String toString() {
        return "PBundling{" +
        ", blId=" + blId +
        ", blName=" + blName +
        ", storeId=" + storeId +
        ", storeName=" + storeName +
        ", blDiscountPrice=" + blDiscountPrice +
        ", blFreightChoose=" + blFreightChoose +
        ", blFreight=" + blFreight +
        ", blState=" + blState +
        "}";
    }
}
