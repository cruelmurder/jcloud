package com.angelj.jcloudprovider.oauth.mapper;

import com.angelj.jcloudprovider.oauth.model.domain.OauthRefreshToken;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OauthRefreshTokenMapper extends BaseMapper<OauthRefreshToken> {
}
