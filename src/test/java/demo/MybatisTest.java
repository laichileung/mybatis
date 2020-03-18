package demo;

import demo.domain.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @auther: marco.li
 * @date: Created in 2020/3/15
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //mybatis的配置文件
        String resource = "mybatis/mybatis-config.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = Resources.getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();
        UserInfo userInfo = session.selectOne("demo.mapper.UserInfoMapper.selectByName", "marco");
        System.out.println(userInfo);

    }
}
