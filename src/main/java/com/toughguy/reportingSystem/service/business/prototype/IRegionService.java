package com.toughguy.reportingSystem.service.business.prototype;
import java.util.List;
import java.util.Map;

import com.toughguy.reportingSystem.model.business.Region;
import com.toughguy.reportingSystem.service.prototype.IGenericService;
/**
 * 地域Service层接口类
 * @author zmk
 *
 */
public interface IRegionService extends IGenericService<Region, Integer>{
	public List<Region> findByParams(Map<String, Object> params);

	public Region findByRegionName(String regionName);
	/**
	 *  根据区县id查询市或者是根据市id查询省
	 * @param id 区县ID或市ID
	 * @return 
	 */
	public Region findByPId(int id);
}
