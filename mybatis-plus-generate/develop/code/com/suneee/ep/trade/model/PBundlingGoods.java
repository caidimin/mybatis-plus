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
 * 组合销售活动商品表
 * </p>
 *
 * @author Yanghu
 * @since 2019-03-15
 * @Version V1.0
 * @Copyright: www.weilian.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@TableName("suneee_p_bundling_goods")
public class PBundlingGoods extends Model<PBundlingGoods> {

    private static final long serialVersionUID = 1L;

    /**
     * 组合商品id
     */
    @TableId(value = "bl_goods_id", type = IdType.AUTO)
    private Integer blGoodsId;

    /**
     * 组合id
     */
    @TableField("bl_id")
    private Integer blId;

    /**
     * 商品id
     */
    @TableField("goods_id")
    private Integer goodsId;

    /**
     * 商品名称
     */
    @TableField("goods_name")
    private String goodsName;

    /**
     * 商品图片
     */
    @TableField("goods_image")
    private String goodsImage;

    /**
     * 商品价格
     */
    @TableField("bl_goods_price")
    private BigDecimal blGoodsPrice;

    /**
     * 指定商品 1是，0否
     */
    @TableField("bl_appoint")
    private Integer blAppoint;

    public Integer getBlGoodsId() {
        return blGoodsId;
    }

    public void setBlGoodsId(Integer blGoodsId) {
        this.blGoodsId = blGoodsId;
    }
    public Integer getBlId() {
        return blId;
    }

    public void setBlId(Integer blId) {
        this.blId = blId;
    }
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }
    public BigDecimal getBlGoodsPrice() {
        return blGoodsPrice;
    }

    public void setBlGoodsPrice(BigDecimal blGoodsPrice) {
        this.blGoodsPrice = blGoodsPrice;
    }
    public Integer getBlAppoint() {
        return blAppoint;
    }

    public void setBlAppoint(Integer blAppoint) {
        this.blAppoint = blAppoint;
    }

    @Override
    protected Serializable pkVal() {
        return this.blGoodsId;
    }

    @Override
    public String toString() {
        return "PBundlingGoods{" +
        "blGoodsId=" + blGoodsId +
        ", blId=" + blId +
        ", goodsId=" + goodsId +
        ", goodsName=" + goodsName +
        ", goodsImage=" + goodsImage +
        ", blGoodsPrice=" + blGoodsPrice +
        ", blAppoint=" + blAppoint +
        "}";
    }
}
