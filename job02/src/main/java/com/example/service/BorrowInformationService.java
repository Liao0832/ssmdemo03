package com.example.service.service;

import com.example.mybatis.entity.BorrowInformation;
import java.text.ParseException;
import java.util.List;

public interface borrowInformationService {
    List<BorrowInformation> allNotBackBooks();
    List<BorrowInformation> timeOutRecord() throws ParseException;
    int addBorrowInformation(BorrowInformation borrowInformation);
    int deleteBorrowInformationById(int studentId);
    List<BorrowInformation> selectBorrowInformationByStudentId(int id);
    int updateBorrowInformation(BorrowInformation borrowInformation);
}
