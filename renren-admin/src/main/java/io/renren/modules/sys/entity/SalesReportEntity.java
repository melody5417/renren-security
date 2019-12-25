package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 销售报表
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-12-23 11:11:14
 */
@Data
@TableName("tb_sales_report")
public class SalesReportEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 产品ID
	 */
	private Long productId;
	/**
	 * 产品名称
	 */
	private String productName;
	/**
	 * 销售ID
	 */
	private Long saleId;
	/**
	 * 销售
	 */
	private String saleName;
	/**
	 * 销售人员所属部门ID
	 */
	private Long deptId;
	/**
	 * 部门
	 */
	private String deptName;
	/**
	 * 创建时间
	 */
	private Date createDate;

}
