package io.github.mybatis.generate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.mybatis.generate.entity.UserBase;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Wilson
 * @since 2019-04-22
 */
public interface UserBaseService extends IService<UserBase> {
    UserBase lockSelect(Integer id);

}
