package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.entity.SalesReportEntity;
import io.renren.modules.sys.service.SalesReportService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 销售报表
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-12-23 11:11:14
 */
@RestController
@RequestMapping("sys/salesreport")
public class SalesReportController {
    @Autowired
    private SalesReportService salesReportService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:salesreport:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = salesReportService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:salesreport:info")
    public R info(@PathVariable("id") Long id){
        SalesReportEntity salesReport = salesReportService.getById(id);

        return R.ok().put("salesReport", salesReport);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:salesreport:save")
    public R save(@RequestBody SalesReportEntity salesReport){
        salesReportService.save(salesReport);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:salesreport:update")
    public R update(@RequestBody SalesReportEntity salesReport){
        ValidatorUtils.validateEntity(salesReport);
        salesReportService.updateById(salesReport);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:salesreport:delete")
    public R delete(@RequestBody Long[] ids){
        salesReportService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
