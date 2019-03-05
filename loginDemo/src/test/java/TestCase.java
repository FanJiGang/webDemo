import cn.fan.dao.WordsDao;
import cn.fan.dao.WordsDaoImpl;
import cn.fan.entity.WordBean;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class TestCase {
    @Test
    public void test1() throws SQLException {
        WordsDao dao= new WordsDaoImpl();
        List<WordBean> words = dao.findWords("%a%");
        for (WordBean word : words) {
            System.out.println("word.getWord() = " + word.getWord());
        }
    }
}
