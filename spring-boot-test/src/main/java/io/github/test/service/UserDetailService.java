package io.github.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.test.domain.entity.UserDetail;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author
 * @since 2019-05-07
 */
public interface UserDetailService extends IService<UserDetail> {
    void add();
}
