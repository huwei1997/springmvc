package cap.mapper;

import cap.model.SysCategory;

public interface SysCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_category
     *
     * @mbg.generated
     */
    int insert(SysCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_category
     *
     * @mbg.generated
     */
    int insertSelective(SysCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_category
     *
     * @mbg.generated
     */
    SysCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysCategory record);
}