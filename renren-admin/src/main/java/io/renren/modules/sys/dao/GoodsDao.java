package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.GoodsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品管理
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-12-20 16:40:58
 */
@Mapper
public interface GoodsDao extends BaseMapper<GoodsEntity> {
	
}
