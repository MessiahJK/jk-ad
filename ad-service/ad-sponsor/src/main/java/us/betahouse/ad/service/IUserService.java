package us.betahouse.ad.service;

import us.betahouse.ad.exception.AdException;
import us.betahouse.ad.vo.CreateUserRequest;
import us.betahouse.ad.vo.CreateUserResponse;

public interface IUserService {

    /**
     * 创建用户
     *
     * @param createUserRequest 创建用户请求
     * @return CreateUserResponse
     * @throws AdException 广告异常
     */
    CreateUserResponse createUser(CreateUserRequest createUserRequest) throws AdException;
}
