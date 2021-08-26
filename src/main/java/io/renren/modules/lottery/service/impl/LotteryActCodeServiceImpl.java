package io.renren.modules.lottery.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.lottery.dao.LotteryActCodeDao;
import io.renren.modules.lottery.entity.LotteryActCodeEntity;
import io.renren.modules.lottery.service.LotteryActCodeService;


@Service("lotteryActCodeService")
public class LotteryActCodeServiceImpl extends ServiceImpl<LotteryActCodeDao, LotteryActCodeEntity> implements LotteryActCodeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LotteryActCodeEntity> page = this.page(
                new Query<LotteryActCodeEntity>().getPage(params),
                new QueryWrapper<LotteryActCodeEntity>()
        );

        return new PageUtils(page);
    }

}