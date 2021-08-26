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
@TableName("lottery_act_code")
public class LotteryActCodeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 活动主键id
	 */
	private Long actId;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 助力用户id
	 */
	private String helpUserId;
	/**
	 * 助力用户手机号
	 */
	private String helpMobile;
	/**
	 * 助力用户头像
	 */
	private String helpUserImg;
	/**
	 * 券码
	 */
	private String lotteryCode;
	/**
	 * 开奖状态 unplayed 未开始/playing 进行中/awaiting 待开奖/completed 已开奖
	 */
	private String lotteryStatus;
	/**
	 * 中奖状态 win已中奖 lose未中奖
	 */
	private String prizeStatus;
	/**
	 * 奖品主键id
	 */
	private Long prizeId;
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
