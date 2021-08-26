package io.renren.modules.lottery.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author guowj
 * @email guowj@96225.com
 * @date 2021-08-24 10:38:49
 */
@Data
@TableName("lottery_prize")
public class LotteryPrizeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 奖品名称
	 */
	private String prizeName;
	/**
	 * 奖品价格
	 */
	private Integer prizePrice;
	/**
	 * 奖品图片
	 */
	private String imgUrl;
	/**
	 * 奖品状态  0不可用 1可用 
	 */
	private String status;
	/**
	 * 奖品描述
	 */
	private String description;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 是否删除 0未删除 1已删除 默认0
	 */
	private Integer ifDelete;

}
