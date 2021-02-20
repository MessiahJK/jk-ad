package us.betahouse.ad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import us.betahouse.ad.entity.AdUnit;

import java.util.List;

public interface AdUnitRepository extends JpaRepository<AdUnit, Long> {

    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);

    List<AdUnit> findAllByUnitStatus(Integer unitStatus);
}