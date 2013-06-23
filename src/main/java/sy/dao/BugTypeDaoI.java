package sy.dao;

import sy.model.Tbugtype;

public interface BugTypeDaoI extends BaseDaoI<Tbugtype> {

	/**
	 * 通过ID获得BUG类型
	 * 
	 * @param id
	 * @return
	 */
	public Tbugtype getById(String id);

}
