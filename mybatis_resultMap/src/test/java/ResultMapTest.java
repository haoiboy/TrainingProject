import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ResultMapTest {
    @Test
    public void testGetEmpByEmpId(){
        SqlSession sqlSession= SqlSessionUtil.getSqlsession();
        EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpByEmpId(1);
        System.out.println(emp);
    }
    @Test
    public void testGetEmpAndDeptByEmpId(){
        SqlSession sqlSession= SqlSessionUtil.getSqlsession();
        EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(emp);
    }
    @Test
    public void testGetEmpAndDeptByStep(){
        SqlSession sqlSession= SqlSessionUtil.getSqlsession();
        EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepOne(2);
        System.out.println(emp);
    }
}
