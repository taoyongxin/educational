package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@SpringBootTest
class BookMapperTest {

    @Resource
    private BookMapper bookMapper;

    @Test
    void deleteBook() throws SQLException {
        bookMapper.deleteBook((long)1);
    }

    @Test
    void getBookByPkBookId() {
        Book b = bookMapper.getBookByPkBookId((long)1);
        System.out.println(b);
    }

    @Test
    void insert() throws SQLException{
        Book book = Book.builder()
                .author("凉凉")
                .bookName("西游记")
                .bookNumber(10)
                .bookResidueNumber(5)
                .cover("1.jpg")
                .description("师徒四人斩妖除魔，西天取经")
                .gmtCreate(Timestamp.valueOf(LocalDateTime.now()))
                .gmtModified(Timestamp.valueOf(LocalDateTime.now()))
                .isDeleted(false)
                .type("搞笑的")
                .build();
        bookMapper.insert(book);


    }


    @Test
    void updateBook() throws SQLException{
        Book book = Book.builder()
                .pkBookId((long)3)
                .author("梁儿子")
                .description("南工院第一帅")
                .cover("66.jpg")
                .build();
        bookMapper.updateBook(book);
    }

}