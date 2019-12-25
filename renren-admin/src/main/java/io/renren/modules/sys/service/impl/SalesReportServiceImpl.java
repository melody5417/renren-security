package io.renren.modules.sys.service.impl;

import io.renren.common.annotation.DataFilter;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.SalesReportDao;
import io.renren.modules.sys.entity.SalesReportEntity;
import io.renren.modules.sys.service.SalesReportService;


@Service("salesReportService")
public class SalesReportServiceImpl extends ServiceImpl<SalesReportDao, SalesReportEntity> implements SalesReportService {

    @Override
    @DataFilter(userId = "sale_id")
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SalesReportEntity> page = this.page(
                new Query<SalesReportEntity>().getPage(params),
                new QueryWrapper<SalesReportEntity>()
        );

        return new PageUtils(page);
    }

}
