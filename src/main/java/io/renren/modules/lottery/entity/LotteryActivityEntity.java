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
@TableName("lottery_activity")
public class LotteryActivityEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 活动名称
	 */
	private String lotteryName;
	/**
	 * 活动开始时间
	 */
	private Date startTime;
	/**
	 * 活动结束时间
	 */
	private Date endTime;
	/**
	 * 活动状态  0不可用 1可用 
	 */
	private String status;
	/**
	 * 最大被助力次数
	 */
	private Integer maxBeHelp;
	/**
	 * 最大为他人助力次数
	 */
	private Integer maxHelp;
	/**
	 * 活动规则链接
	 */
	private String ruleUrl;
	/**
	 * 背景图片
	 */
	private String bgImgUrl;
	/**
	 * 抽奖码页面提示
	 */
	private String tips;
	/**
	 * 活动描述
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
	/**
	 * unplayed 未开始/playing 进行中/awaiting 待开奖/completed 已开奖
	 */
	private String lotteryStatus;

}
