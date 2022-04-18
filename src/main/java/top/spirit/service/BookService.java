package top.spirit.service;

import org.apache.ibatis.annotations.Param;
import top.spirit.pojo.Books;

import java.awt.print.Book;
import java.util.List;

public interface BookService {

    //增加一本书
    int addBook(Books book);
    //删除一本书
    int deleteBookById(int id);
    //更新一本书
    int updateBook(Books book);
    //查询一本书
    Books queryBookId(int id);
    //查询所有的书
    List<Books> queryAllBook();
}
