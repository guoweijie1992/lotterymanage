package io.renren.modules.lottery.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.lottery.dao.LotteryActPrizeDao;
import io.renren.modules.lottery.entity.LotteryActPrizeEntity;
import io.renren.modules.lottery.service.LotteryActPrizeService;


@Service("lotteryActPrizeService")
public class LotteryActPrizeServiceImpl extends ServiceImpl<LotteryActPrizeDao, LotteryActPrizeEntity> implements LotteryActPrizeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LotteryActPrizeEntity> page = this.page(
                new Query<LotteryActPrizeEntity>().getPage(params),
                new QueryWrapper<LotteryActPrizeEntity>()
        );

        return new PageUtils(page);
    }

}