package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.SalesReportEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 销售报表
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-12-23 11:11:14
 */
@Mapper
public interface SalesReportDao extends BaseMapper<SalesReportEntity> {

    List<SalesReportEntity> queryList();

}
