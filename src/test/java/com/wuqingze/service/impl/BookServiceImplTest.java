package com.wuqingze.service.impl;

/**
 * Created by wuqingze on 2018/6/9.
 */
import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wuqingze.BaseTest;
import com.wuqingze.dto.AppointExecution;
import com.wuqingze.service.BookService;

public class BookServiceImplTest extends BaseTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() throws Exception {
        long bookId = 1001;
        long studentId = 12345678910L;
        AppointExecution execution = bookService.appoint(bookId, studentId);
        System.out.println(execution);
    }

}