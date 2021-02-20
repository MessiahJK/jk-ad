package us.betahouse.ad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import us.betahouse.ad.entity.AdUser;

public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    /**
     * 根据用户名查找用户记录
     * */
    AdUser findByUsername(String username);
}