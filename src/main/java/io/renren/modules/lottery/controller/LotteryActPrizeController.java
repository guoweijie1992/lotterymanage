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

import io.renren.modules.lottery.entity.LotteryActPrizeEntity;
import io.renren.modules.lottery.service.LotteryActPrizeService;
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
@RequestMapping("lottery/lotteryactprize")
public class LotteryActPrizeController {
    @Autowired
    private LotteryActPrizeService lotteryActPrizeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("lottery:lotteryactprize:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = lotteryActPrizeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("lottery:lotteryactprize:info")
    public R info(@PathVariable("id") Long id){
		LotteryActPrizeEntity lotteryActPrize = lotteryActPrizeService.getById(id);

        return R.ok().put("lotteryActPrize", lotteryActPrize);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("lottery:lotteryactprize:save")
    public R save(@RequestBody LotteryActPrizeEntity lotteryActPrize){
		lotteryActPrizeService.save(lotteryActPrize);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("lottery:lotteryactprize:update")
    public R update(@RequestBody LotteryActPrizeEntity lotteryActPrize){
		lotteryActPrizeService.updateById(lotteryActPrize);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("lottery:lotteryactprize:delete")
    public R delete(@RequestBody Long[] ids){
		lotteryActPrizeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
