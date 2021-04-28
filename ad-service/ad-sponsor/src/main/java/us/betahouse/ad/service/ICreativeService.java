package us.betahouse.ad.service;

import us.betahouse.ad.vo.CreativeRequest;
import us.betahouse.ad.vo.CreativeResponse;

/**
 * 创意服务
 */
public interface ICreativeService {
    CreativeResponse createCreative(CreativeRequest request);
}
