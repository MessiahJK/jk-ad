package us.betahouse.ad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import us.betahouse.ad.entity.Creative;

public interface CreativeRepository extends JpaRepository<Creative, Long> {
}
