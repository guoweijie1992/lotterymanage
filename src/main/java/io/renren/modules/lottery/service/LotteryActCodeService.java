package io.renren.modules.lottery.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.lottery.entity.LotteryActCodeEntity;

import java.util.Map;

/**
 * 
 *
 * @author guowj
 * @email guowj@96225.com
 * @date 2021-08-24 10:38:49
 */
public interface LotteryActCodeService extends IService<LotteryActCodeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

