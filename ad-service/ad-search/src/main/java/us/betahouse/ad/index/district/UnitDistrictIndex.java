package us.betahouse.ad.index.district;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import us.betahouse.ad.index.IndexAware;
import us.betahouse.ad.utils.CommonUtils;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;


@Slf4j
@Component
public class UnitDistrictIndex implements IndexAware<String, Set<Long>> {

    private static final Map<String, Set<Long>> districtUnitMap;
    private static final Map<Long, Set<String>> unitDistrictMap;

    static {
        districtUnitMap = new ConcurrentHashMap<>();
        unitDistrictMap = new ConcurrentHashMap<>();
    }

    @Override
    public Set<Long> get(String key) {
        return districtUnitMap.get(key);
    }

    @Override
    public void add(String key, Set<Long> value) {

        log.info("UnitDistrictIndex, before add: {}", unitDistrictMap);

        Set<Long> unitIds = CommonUtils.getOrCreate(
                key, districtUnitMap,
                ConcurrentSkipListSet::new
        );
        unitIds.addAll(value);

        for (Long unitId : value) {

            Set<String> districts = CommonUtils.getOrCreate(
                    unitId, unitDistrictMap,
                    ConcurrentSkipListSet::new
            );
            districts.add(key);
        }

        log.info("UnitDistrictIndex, after add: {}", unitDistrictMap);
    }

    @Override
    public void update(String key, Set<Long> value) {

        log.error("district index can not support update");
    }

    @Override
    public void delete(String key, Set<Long> value) {

        log.info("UnitDistrictIndex, before delete: {}", unitDistrictMap);

        Set<Long> unitIds = CommonUtils.getOrCreate(
                key, districtUnitMap,
                ConcurrentSkipListSet::new
        );
        unitIds.removeAll(value);

        for (Long unitId : value) {

            Set<String> districts = CommonUtils.getOrCreate(
                    unitId, unitDistrictMap,
                    ConcurrentSkipListSet::new
            );
            districts.remove(key);
        }

        log.info("UnitDistrictIndex, after delete: {}", unitDistrictMap);
    }


}
