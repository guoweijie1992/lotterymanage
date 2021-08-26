package io.renren.modules.lottery.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.lottery.dao.LotteryPrizeDao;
import io.renren.modules.lottery.entity.LotteryPrizeEntity;
import io.renren.modules.lottery.service.LotteryPrizeService;


@Service("lotteryPrizeService")
public class LotteryPrizeServiceImpl extends ServiceImpl<LotteryPrizeDao, LotteryPrizeEntity> implements LotteryPrizeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LotteryPrizeEntity> page = this.page(
                new Query<LotteryPrizeEntity>().getPage(params),
                new QueryWrapper<LotteryPrizeEntity>()
        );

        return new PageUtils(page);
    }

}