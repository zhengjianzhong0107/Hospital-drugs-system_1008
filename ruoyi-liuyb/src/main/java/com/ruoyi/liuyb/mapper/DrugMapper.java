package com.ruoyi.liuyb.mapper;

import java.util.List;
import com.ruoyi.liuyb.domain.Drug;

/**
 * 商品信息管理Mapper接口
 * 
 * @author liuyb
 * @date 2022-02-23
 */
public interface DrugMapper 
{
    /**
     * 查询商品信息管理
     * 
     * @param drugid 商品信息管理主键
     * @return 商品信息管理
     */
    public Drug selectDrugByDrugid(Long drugid);

    public Drug selectDrugByDrugno(Long drugno);

    //下拉选择
    public  List<Drug> selectDrugNoName(Drug drug);

    //查询存放地点
//    public Drug selectDrugPlace(Drug drug);

    /**
     * 查询商品信息管理列表
     * 
     * @param drug 商品信息管理
     * @return 商品信息管理集合
     */
    public List<Drug> selectDrugList(Drug drug);

    /**
     * 查询商品信息的商品编号
     */
    public List<Drug> selectDrugListNo(Drug drug);

    /**
     * 新增商品信息管理
     * 
     * @param drug 商品信息管理
     * @return 结果
     */
    public int insertDrug(Drug drug);

    /**
     * 修改商品信息管理
     * 
     * @param drug 商品信息管理
     * @return 结果
     */
    public int updateDrug(Drug drug);

    public int updateDrugBydrugno(Drug drug);

    /**
     * 删除商品信息管理
     * 
     * @param drugid 商品信息管理主键
     * @return 结果
     */
    public int deleteDrugByDrugid(Long drugid);

    /**
     * 批量删除商品信息管理
     * 
     * @param drugids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDrugByDrugids(Long[] drugids);
}
