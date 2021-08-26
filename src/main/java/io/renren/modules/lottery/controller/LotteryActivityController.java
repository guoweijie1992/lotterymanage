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

import io.renren.modules.lottery.entity.LotteryActivityEntity;
import io.renren.modules.lottery.service.LotteryActivityService;
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
@RequestMapping("lottery/lotteryactivity")
public class LotteryActivityController {
    @Autowired
    private LotteryActivityService lotteryActivityService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("lottery:lotteryactivity:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = lotteryActivityService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("lottery:lotteryactivity:info")
    public R info(@PathVariable("id") Long id){
		LotteryActivityEntity lotteryActivity = lotteryActivityService.getById(id);

        return R.ok().put("lotteryActivity", lotteryActivity);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("lottery:lotteryactivity:save")
    public R save(@RequestBody LotteryActivityEntity lotteryActivity){
		lotteryActivityService.save(lotteryActivity);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("lottery:lotteryactivity:update")
    public R update(@RequestBody LotteryActivityEntity lotteryActivity){
		lotteryActivityService.updateById(lotteryActivity);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("lottery:lotteryactivity:delete")
    public R delete(@RequestBody Long[] ids){
		lotteryActivityService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
