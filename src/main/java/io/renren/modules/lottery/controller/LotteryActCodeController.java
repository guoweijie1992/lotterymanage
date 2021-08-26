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

import io.renren.modules.lottery.entity.LotteryActCodeEntity;
import io.renren.modules.lottery.service.LotteryActCodeService;
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
@RequestMapping("lottery/lotteryactcode")
public class LotteryActCodeController {
    @Autowired
    private LotteryActCodeService lotteryActCodeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("lottery:lotteryactcode:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = lotteryActCodeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("lottery:lotteryactcode:info")
    public R info(@PathVariable("id") Long id){
		LotteryActCodeEntity lotteryActCode = lotteryActCodeService.getById(id);

        return R.ok().put("lotteryActCode", lotteryActCode);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("lottery:lotteryactcode:save")
    public R save(@RequestBody LotteryActCodeEntity lotteryActCode){
		lotteryActCodeService.save(lotteryActCode);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("lottery:lotteryactcode:update")
    public R update(@RequestBody LotteryActCodeEntity lotteryActCode){
		lotteryActCodeService.updateById(lotteryActCode);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("lottery:lotteryactcode:delete")
    public R delete(@RequestBody Long[] ids){
		lotteryActCodeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
