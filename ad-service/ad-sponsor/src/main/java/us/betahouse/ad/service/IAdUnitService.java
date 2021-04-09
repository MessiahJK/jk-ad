package us.betahouse.ad.service;

import us.betahouse.ad.exception.AdException;
import us.betahouse.ad.vo.AdUnitRequest;
import us.betahouse.ad.vo.AdUnitResponse;

public interface IAdUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;


}
