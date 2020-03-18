package demo.mapper;

import demo.domain.UserInfo;

/**
 * @auther: marco.li
 * @date: Created in 2020/3/16
 */
public interface UserInfoMapper {

    UserInfo selectByName(String name);
}
