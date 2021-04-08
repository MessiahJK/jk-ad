package us.betahouse.ad.service;


import us.betahouse.ad.entity.AdPlan;
import us.betahouse.ad.exception.AdException;
import us.betahouse.ad.vo.AdPlanGetRequest;
import us.betahouse.ad.vo.AdPlanRequest;
import us.betahouse.ad.vo.AdPlanResponse;

import java.util.List;

public interface IAdPlanService {

    /**
     * <h2>创建推广计划</h2>
     */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>获取推广计划</h2>
     */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * <h2>更新推广计划</h2>
     */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>删除推广计划</h2>
     */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
