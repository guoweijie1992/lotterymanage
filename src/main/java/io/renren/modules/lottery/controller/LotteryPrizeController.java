package io.renren.modules.lottery.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.lottery.entity.LotteryPrizeEntity;
import io.renren.modules.lottery.service.LotteryPrizeService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author guowj
 * @email guowj@96225.com
 * @date 2021-08-24 10:38:49
 */
@RestController
@RequestMapping("lottery/lotteryprize")
public class LotteryPrizeController {
    @Autowired
    private LotteryPrizeService lotteryPrizeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("lottery:lotteryprize:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = lotteryPrizeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("lottery:lotteryprize:info")
    public R info(@PathVariable("id") Long id){
		LotteryPrizeEntity lotteryPrize = lotteryPrizeService.getById(id);

        return R.ok().put("lotteryPrize", lotteryPrize);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("lottery:lotteryprize:save")
    public R save(@RequestBody LotteryPrizeEntity lotteryPrize){
		lotteryPrizeService.save(lotteryPrize);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("lottery:lotteryprize:update")
    public R update(@RequestBody LotteryPrizeEntity lotteryPrize){
		lotteryPrizeService.updateById(lotteryPrize);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("lottery:lotteryprize:delete")
    public R delete(@RequestBody Long[] ids){
		lotteryPrizeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
