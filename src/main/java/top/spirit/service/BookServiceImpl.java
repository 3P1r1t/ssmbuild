package top.spirit.service;

import top.spirit.dao.BookMapper;
import top.spirit.pojo.Books;

import java.awt.print.Book;
import java.util.List;
//service调dao层：组合dao层
public class BookServiceImpl implements BookService{

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    private BookMapper bookMapper;

    @Override
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Books queryBookId(int id) {
        return bookMapper.queryBookId(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
