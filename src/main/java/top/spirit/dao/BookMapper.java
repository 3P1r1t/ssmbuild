package top.spirit.dao;

import org.apache.ibatis.annotations.Param;
import top.spirit.pojo.Books;

import java.util.List;


public interface BookMapper {

    //增加一本书
    int addBook(Books book);
    //删除一本书
    int deleteBookById(@Param("bookId") int id);
    //更新一本书
    int updateBook(Books book);
    //查询一本书
    Books queryBookId(@Param("bookId") int id);
    //查询所有的书
    List<Books> queryAllBook();
}
