package io.renren.modules.lottery.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.lottery.dao.LotteryActivityDao;
import io.renren.modules.lottery.entity.LotteryActivityEntity;
import io.renren.modules.lottery.service.LotteryActivityService;


@Service("lotteryActivityService")
public class LotteryActivityServiceImpl extends ServiceImpl<LotteryActivityDao, LotteryActivityEntity> implements LotteryActivityService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LotteryActivityEntity> page = this.page(
                new Query<LotteryActivityEntity>().getPage(params),
                new QueryWrapper<LotteryActivityEntity>()
        );

        return new PageUtils(page);
    }

}