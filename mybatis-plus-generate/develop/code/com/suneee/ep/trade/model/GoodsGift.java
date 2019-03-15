package com.suneee.ep.trade.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 商品赠品表
 * </p>
 *
 * @author Yanghu
 * @since 2019-03-15
 * @Version V1.0
 * @Copyright: www.weilian.com Inc. All rights reserved.
 * 注意：本内容仅限于深圳象翌微链集团内部传阅，禁止外泄以及用于其他的商业目
 */
@TableName("suneee_goods_gift")
public class GoodsGift extends Model<GoodsGift> {

    private static final long serialVersionUID = 1L;

    /**
     * 赠品id 
     */
    @TableId(value = "gift_id", type = IdType.AUTO)
    private Integer giftId;

    /**
     * 主商品id
     */
    @TableField("goods_id")
    private Integer goodsId;

    /**
     * 主商品公共id
     */
    @TableField("goods_commonid")
    private Integer goodsCommonid;

    /**
     * 赠品商品id 
     */
    @TableField("gift_goodsid")
    private Integer giftGoodsid;

    /**
     * 主商品名称
     */
    @TableField("gift_goodsname")
    private String giftGoodsname;

    /**
     * 主商品图片
     */
    @TableField("gift_goodsimage")
    private String giftGoodsimage;

    /**
     * 赠品数量
     */
    @TableField("gift_amount")
    private Integer giftAmount;

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
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
    public Integer getGiftGoodsid() {
        return giftGoodsid;
    }

    public void setGiftGoodsid(Integer giftGoodsid) {
        this.giftGoodsid = giftGoodsid;
    }
    public String getGiftGoodsname() {
        return giftGoodsname;
    }

    public void setGiftGoodsname(String giftGoodsname) {
        this.giftGoodsname = giftGoodsname;
    }
    public String getGiftGoodsimage() {
        return giftGoodsimage;
    }

    public void setGiftGoodsimage(String giftGoodsimage) {
        this.giftGoodsimage = giftGoodsimage;
    }
    public Integer getGiftAmount() {
        return giftAmount;
    }

    public void setGiftAmount(Integer giftAmount) {
        this.giftAmount = giftAmount;
    }

    @Override
    protected Serializable pkVal() {
        return this.giftId;
    }

    @Override
    public String toString() {
        return "GoodsGift{" +
        "giftId=" + giftId +
        ", goodsId=" + goodsId +
        ", goodsCommonid=" + goodsCommonid +
        ", giftGoodsid=" + giftGoodsid +
        ", giftGoodsname=" + giftGoodsname +
        ", giftGoodsimage=" + giftGoodsimage +
        ", giftAmount=" + giftAmount +
        "}";
    }
}
