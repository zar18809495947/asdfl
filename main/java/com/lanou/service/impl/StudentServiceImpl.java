package com.lanou.service.impl;

import com.lanou.bean.Student;
import com.lanou.mapper.StudentMapper;
import com.lanou.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zar on 2017/11/2.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> allStudent() {
        return studentMapper.selectAllStudent();
    }
}
