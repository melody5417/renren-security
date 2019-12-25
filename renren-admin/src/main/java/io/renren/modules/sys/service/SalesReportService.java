package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.SalesReportEntity;

import java.util.Map;

/**
 * 销售报表
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-12-23 11:11:14
 */
public interface SalesReportService extends IService<SalesReportEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

