package us.betahouse.ad.service.impl;

import us.betahouse.ad.dao.CreativeRepository;
import us.betahouse.ad.entity.Creative;
import us.betahouse.ad.service.ICreativeService;
import us.betahouse.ad.vo.CreativeRequest;
import us.betahouse.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
