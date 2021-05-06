package us.betahouse.ad.client;

import org.springframework.stereotype.Component;
import us.betahouse.ad.client.vo.AdPlan;
import us.betahouse.ad.client.vo.AdPlanGetRequest;
import us.betahouse.ad.vo.CommonResponse;

import java.util.List;

/**
 * 熔断
 */
@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(
            AdPlanGetRequest request) {
        return new CommonResponse<>(-1,
                "eureka-client-ad-sponsor error");
    }
}
